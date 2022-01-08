package com.teachmeskills.lesson_9.task1.DocumentNumber.task1;

public class DocumentNumber  {

    String documentNumber;

    public static  String replace(String documentNumber) {
        String result = documentNumber.substring(0, 13);//
        String str = result.replace("-asw-", "");
        return str;
        }
    public static String blocsReplace(String documentNumber) {
        String str1 = documentNumber.replace("asw", "   ");
        String str2 = str1.replace("htf", "   ");
        return str2;
        }
    public static String blocsToLowerCase(String documentNumber) {
        String str3 = documentNumber.replace("1221-", "");
        String str4 = str3.replace("-4434-", "/");
        String str5 = str4.replace("-1", "/");
        String str6 = str5.replace("2", "/");
        return str6.toLowerCase();
        }
    public static StringBuilder blocsToUpperCase(String documentNumber) {
        StringBuilder sss = new StringBuilder();
        String str3 = documentNumber.replace("1221-", "");
        String str4 = str3.replace("-4434-", "/");
        String str5 = str4.replace("-1", "/");
        String str6 = str5.replace("2", "/");
        sss.append("LETTERS:");
        sss.append(str6.toUpperCase());
        return sss;
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

