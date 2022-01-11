package com.teachmeskills.lesson_9.task1.DocumentNumber.task1;

import java.util.Locale;

public class DocumentNumber  {

    String documentNumber ;

    public static  String replace(String documentNumber) {
        String[] array = documentNumber.split("-");
        for (int i = 0; i < array.length; i++) {
        }
        return array[0]+array[2];
        }
    public static String blocsReplace(String documentNumber) {
        String[] array = documentNumber.split("-");
        String str = documentNumber.replace(array[1], "  ");
        String str1 = str.replace(array[3], "  ");
        return str1;
        }
    public static String blocsToLowerCase(String documentNumber) {
        String rrr = documentNumber.replaceAll("[^a-zA-Z ]", "");
        StringBuffer sb = new StringBuffer(rrr);
        sb.insert(3 , "/");
        sb.insert(7 , "/");
        sb.insert(9 , "/");
        String aaa = String.valueOf(sb);
        return  aaa.toLowerCase(Locale.ROOT);
        }
    public static StringBuilder blocsToUpperCase(String documentNumber) {
        String rrr = documentNumber.replaceAll("[^a-zA-Z ]", "");
        StringBuilder sb = new StringBuilder(rrr);
        sb.insert(3 , "/");
        sb.insert(7 , "/");
        sb.insert(9 , "/");
        String eee = "letters:" + String.valueOf(sb);
        return new StringBuilder(eee.toUpperCase());
        }
    public static boolean containsDocumentNumber(String documentNumber){
        if (documentNumber.contains("abc")) {
            return true;
        } else {
            return false;
        }
        }
    public static boolean startDocumentNumber(String documentNumber) {
        String result1 = documentNumber.substring(0, 3);
        if (result1.contains("555")) {
            return true;
        } else {
            return false;
        }
        }
    public static boolean endDocumentNumber(String documentNumber){
        String str8 = documentNumber.substring(18, 22);
        if (str8.contains("1a2b")) {
            return true;
        } else {
            return false;
        }
    }

}

