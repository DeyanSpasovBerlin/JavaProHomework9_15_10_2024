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
        work.getArraySum(randArr);
        System.out.println("**********************");
        work.getMaxArr(randArr);
        System.out.println("**********************");
        System.out.println("We will split the next text:");
        System.out.println(work.getText1());
        ArrayList<String> splitTextArr1 = work.splitText(work.getText1());
        System.out.println("**********************");
        work.removeRepead(splitTextArr1);
        System.out.println("**********************");
        work.concatArrayString(splitTextArr1);
        System.out.println("**********************");
        work.getLangArr(splitTextArr1);
        System.out.println("**********************");
        System.out.println("**********************");
        System.out.println("We will split the next text:");
        System.out.println(work.getText2());
        ArrayList<String> splitTextArr2 = work.splitText(work.getText2());
        System.out.println("**********************");
        work.removeRepead(splitTextArr2);
        System.out.println("**********************");
        work.concatArrayString(splitTextArr2);
        System.out.println("**********************");
        work.getLangArr(splitTextArr2);
        System.out.println("**********************");
        work.unitedTwoArr(splitTextArr1,splitTextArr2);
    }
}