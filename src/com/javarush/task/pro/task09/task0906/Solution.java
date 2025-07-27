package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if(decimalNumber>0){
            String b = "";
            while (decimalNumber!=0){
                b = decimalNumber%2 + b;
                decimalNumber = decimalNumber/2;
            }
        return b;
        }
        else
        return "";
    }

    public static int toDecimal(String binaryNumber) {
        double b = 0;
        if (binaryNumber == null)
        {  return (int)b; }

        if(binaryNumber != null) {

            for (int i = 0; i < binaryNumber.length(); i++) {
                b = b + Character.getNumericValue(binaryNumber.charAt(binaryNumber.length()-1-i)) * Math.pow(2.0, i);
            }}
        return (int)b;
    }
}
