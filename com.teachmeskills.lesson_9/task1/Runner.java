package com.teachmeskills.lesson_9.task1.DocumentNumber.task1;

import com.teachmeskills.lesson_9.task1.DocumentNumber.task1.DocumentNumber;

public class Runner extends DocumentNumber {
        public static void main(String[] args) {
                String documentNumber = "1221-asw-4434-htf-1f2e";

                System.out.println(replace(documentNumber));
                System.out.println(blocsReplace(documentNumber));
                System.out.println(blocsToLowerCase(documentNumber));
                System.out.println(blocsToUpperCase(documentNumber));
                System.out.println(containsDocumentNumber(documentNumber));
                System.out.println(startDocumentNumber(documentNumber));
                System.out.println(endDocumentNumber(documentNumber));

        }
}