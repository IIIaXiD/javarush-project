package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;
/* 
Второе минимальное число из введенных
*/
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int twomin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        //int n  = 0; //счетчик кол-во введенных чисел
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < min) {
               twomin = min;
               min = number;
            } else if (number < twomin && number != min) {
                twomin = number;
            }
        }
        System.out.println(twomin);
    }
}