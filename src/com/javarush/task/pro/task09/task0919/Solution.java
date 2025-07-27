package com.javarush.task.pro.task09.task0919;

/* 
Разворот строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        String[] newStr = string.split(" ");
        String[] retmas = new String[newStr.length];
        for(int i = 0; i<newStr.length ; i++){
            retmas[i]= newStr[newStr.length-1-i];
        }
        String newStrRet = String.join(" ", retmas);
        return newStrRet;
    }
}
