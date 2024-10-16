package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HomeworkTask task = new HomeworkTask();
        task.readFile(task.fileInfo("Homework9_15_10_2024.txt"));

    WorkingArea work =  new WorkingArea();
    ArrayList<Integer> randArr = work.getRandArr();
        System.out.println("**********************");
    work.getEvenMember(randArr);
        System.out.println("**********************");
        System.out.println("We will split the next text:");
        System.out.println(work.getText1());
        ArrayList<String> splitTextArr = work.splitText(work.getText1());
        System.out.println("**********************");
    work.removeRepead(splitTextArr);
        System.out.println("**********************");
        System.out.println("We will split the next text:");
        System.out.println(work.getText2());
        ArrayList<String> splitTextArr1 = work.splitText(work.getText2());
        work.concatArrayString(splitTextArr1);
        System.out.println("**********************");
        ArrayList<Integer> randArr1 = work.getRandArr();
        work.getArraySum(randArr1);
        System.out.println("**********************");
        ArrayList<Integer> randArr2 = work.getRandArr();
        work.getMaxArr(randArr2);
        System.out.println("**********************");
        ArrayList<String> splitTextArr3 = work.splitText(work.getText1());
        work.getLangArr(splitTextArr3);
        System.out.println("**********************");
        ArrayList<String> splitTextArr4 = work.splitText(work.getText2());
        work.getLangArr(splitTextArr4);
        System.out.println("**********************");
        ArrayList<String> splitTextArr5 = work.splitText(work.getText1());
        System.out.println("**********************");
        ArrayList<String> splitTextArr6 = work.splitText(work.getText2());
        System.out.println("**********************");
        work.unitedTwoArr(splitTextArr5,splitTextArr6);
    }
}