package com.teachmeskills.lesson_9.task1.DocumentNumber.task1;

import com.teachmeskills.lesson_9.task1.DocumentNumber.task1.DocumentNumber;

public class Runner extends DocumentNumber {
        public static void main(String[] args) {
                String documentNumber = "3232-sss-3443-gfg-1j1k";

                System.out.println(replace(documentNumber));
                System.out.println(blocsReplace(documentNumber));
                System.out.println(blocsToLowerCase(documentNumber));
                System.out.println(blocsToUpperCase(documentNumber));
                System.out.println(containsDocumentNumber(documentNumber));
                System.out.println(startDocumentNumber(documentNumber));
                System.out.println(endDocumentNumber(documentNumber));
        }
}