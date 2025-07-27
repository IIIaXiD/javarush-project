package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
       int fromIndex = path.indexOf("jdk");
       int lastIndex = path.indexOf("/",fromIndex+3);
       String newString = path.substring(0,fromIndex)+jdk+path.substring(lastIndex);
       return newString;
    }
}
