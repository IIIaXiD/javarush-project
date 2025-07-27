package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
       String newStr = "";
       if (decimalNumber<=0)
        return newStr;
       else if(decimalNumber>0){
           while(decimalNumber!=0){
               int i = decimalNumber%16;
               newStr = HEX.charAt(i)+newStr;
               decimalNumber = decimalNumber/16;
           }
       }
       return  newStr;
    }

    public static int toDecimal(String hexNumber) {
        int newHex = 0 ;
        if(hexNumber == null)
        return 0;
        else {
            for (int i = 0; i < hexNumber.length() ; i++) {
                char prind = hexNumber.charAt(i);
                int ind = HEX.indexOf(prind);
                newHex = 16*newHex + ind;
            }
            return  newHex;
        }
    }
}
