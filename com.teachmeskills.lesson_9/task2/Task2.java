package com.teachmeskills.lesson_9.task1.DocumentNumber.task1;

public class Task2 {
    public static void main(String[] args) {

        String str = "Bad student Dmitriy ";
        String[] array = str.split(" ");
        String maxword = array[0];
        String minword = array[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].length() > maxword.length())
                maxword = array[i];
            if (array[i].length() < minword.length())
                minword = array[i];
        }
            System.out.println("Maxword " + maxword);
            System.out.println("Minword " + minword);
        }
    }


