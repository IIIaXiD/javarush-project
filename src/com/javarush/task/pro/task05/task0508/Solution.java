package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            if(string==null){
                break;
            }
            for (int j = i+1; j < strings.length; j++) {
                 if(string.equals(strings[j])){
                    strings[i] = null;
                    strings[j] = null;
                }
        }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+ ",");
        }
    }
}