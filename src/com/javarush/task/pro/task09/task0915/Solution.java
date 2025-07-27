package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer strtok = new StringTokenizer(query,delimiter);
        int token = strtok.countTokens();
        int i = 0;
        String [] str = new String[token];
        while (strtok.hasMoreTokens()){
            str[i] = strtok.nextToken();
        i++;}
        return str;
    }
}
