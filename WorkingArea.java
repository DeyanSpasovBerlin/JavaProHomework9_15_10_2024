package org.example;

import java.lang.reflect.Type;
import java.util.*;

public class WorkingArea {
    private String text1 = "Жизнь, господа присяжные заседатели, это сложная штука," +
            " но, господа присяжные заседатели, эта сложная штука открывается " +
            "просто, как ящик. Надо только уметь его открыть. Кто не может открыть," +
            " тот пропадает. ";
    private String text2 = "Хотите услышать мое излюбленное определение человека? Это существо, " +
            "которое охотнее всего рассуждает о том, в чем меньше всего разбирается.";

    public WorkingArea() {
    }

    ;

    public WorkingArea(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public ArrayList<Integer> getRandArr() {
        Random rand = new Random();
        int lengthOfArr = rand.nextInt(5, 20);
        ArrayList<Integer> randArrList = new ArrayList(lengthOfArr);
        for (int i = 0; i < lengthOfArr; i++) {
            randArrList.add(rand.nextInt(0, 51));
        }
        System.out.println("We generate the next random Array:");
        System.out.println(randArrList);
        return randArrList;
    }

    public ArrayList<Integer> getEvenMember(ArrayList<Integer> arr) {
        ArrayList<Integer> evenMembers = new ArrayList<Integer>();
        for (Integer i : arr) {
            if ((i % 2) != 0) {
                evenMembers.add(i);
            }
        }
        System.out.println("Now we pick up the even members:");
        System.out.println(evenMembers);
        return evenMembers;
    }

    public Integer getArraySum(ArrayList<Integer> arr) {
        Integer bufer = 0;
        Iterator<Integer> itInteger = arr.iterator();
        while (itInteger.hasNext()) {
            Integer num = itInteger.next();
            bufer += num;
        }
        System.out.println("The sum of all member is:");
        System.out.println(bufer);
        return bufer;
    }

    public Integer getMaxArr(ArrayList<Integer> arr) {
        System.out.println("Now we pick up the max members:");
        Integer bufer = arr.get(0);
        arr.remove(0);
        Iterator<Integer> itInteger = arr.iterator();
        while (itInteger.hasNext()) {
            Integer num = itInteger.next();
            if (bufer > num) {
                itInteger.remove();
            }else {
                bufer = num;
            }
        }
        System.out.println("The max member is: "+bufer);
        return bufer;
    }
        public ArrayList<String> splitText (String text){
            String[] splitTextArr;
            ArrayList<String> splitTextArrList = new ArrayList<>();
            System.out.println("Now we split text in String Array:");
            String spliter = "[,\\.\\s\\?]";
            splitTextArr = text.split(spliter);
            for (int i = 0; i < splitTextArr.length; i++) {
                splitTextArrList.add(splitTextArr[i]);
            }
            System.out.println(splitTextArrList);
            return splitTextArrList;
        }
        public ArrayList<String> removeRepead (ArrayList <String> text) {
            ArrayList<String> nonRepeadArr = new ArrayList<String>();
            boolean flag = false;
            Iterator<String> itString = text.iterator();
            while (itString.hasNext()) {
                String s = itString.next();
                itString.remove();
                if (!text.contains(s)) {
                    nonRepeadArr.add(s);
                }
            }
            System.out.println("The non repead Array is:");
            System.out.println(nonRepeadArr);
            return nonRepeadArr;
        }
        public String concatArrayString (ArrayList<String> text) {
            ArrayList<String> nonRepeadArr = new ArrayList<String>();
            String concatString = "";
            Iterator<String> itString = text.iterator();
            while (itString.hasNext()) {
                String s = itString.next();
                concatString = concatString.concat(s);
            }
            System.out.println("The concat String is:");
            System.out.println(concatString);
            return concatString;
        }

    public Integer getLangArr(ArrayList<String> arr) {
        System.out.println("We have the next input srting Array:");
        System.out.println(arr);
        System.out.println("Now we pick up the longest members:");
        int bufer = arr.getFirst().length();
        arr.remove(0);
        Iterator<String> itString = arr.iterator();
        while (itString.hasNext()) {
            String s = itString.next();
            if (bufer > s.length()) {
                itString.remove();
            }else {
                bufer = s.length();
            }
        }
        System.out.println("The langest member is long: "+bufer);
        return bufer;
    }

    public ArrayList<String> unitedTwoArr (ArrayList <String> str1,ArrayList <String> str2) {
        //ArrayList<String> unitedArr = new ArrayList<>();
        System.out.println("We have the next two string Arrays:");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("Now we will united them.");
        Iterator<String> itString = str2.iterator();
        while (itString.hasNext()) {
            String s = itString.next();
            str1.add(s);
        }
        System.out.println("The united string Array is:");
        System.out.println(str1);
        return str1;
    }

}

