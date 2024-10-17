package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class MyArrayList implements Iterable<String> {

    private String[] data;

    public void add(String element) {
        // logic for adding element
    }

    public MyArrayList(String[] data) {
        this.data = data;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyRandomIterator();
    }


    private class MyIterator implements Iterator<String> {

        private int index = 0;
        @Override
        public boolean hasNext() {
            return data.length > index;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[index++];
        }
    }

    private class MyReverseIterator implements Iterator<String> {
        private int index = data.length - 1;
        @Override
        public boolean hasNext() {
            return index >= 0;
        }
        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[index--];
        }
    }

    private class MyRandomIterator implements Iterator<String> {
        private int index = 0;
        Random rand = new Random();
        int upBond = data.length;
        @Override
        public boolean hasNext() {
            return data.length > index;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int randIndex = rand.nextInt(0,upBond);
            index++;
            return data[randIndex];
        }
    }

}
