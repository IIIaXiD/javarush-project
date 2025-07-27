package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String newBinn = "";
//
        if(binaryNumber == null){
            return  newBinn;
        }
        StringBuilder temp = new StringBuilder();
        if (binaryNumber.length() % 4 == 1) {
            temp.append("000").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 2) {
            temp.append("00").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 3) {
            temp.append("0").append(binaryNumber);
        } else {
            temp.append(binaryNumber);
        }
        String newBin = "";
        if (binaryNumber!=null) {
            if(binaryNumber.length()%4==0)
                for (int i = 0; i < (binaryNumber.length()/4); i++) {
                    String str = binaryNumber.substring((0+4*i),4+(4*i));
                    switch (str){
                        case "0000" :
                            newBin = newBin+"0";
                            break;
                        case "0001":
                            newBin = newBin+"1";
                            break;
                        case "0010":
                            newBin =newBin+"2";
                            break;
                        case "0011":
                            newBin = newBin+"3";
                            break;
                        case "0100":
                            newBin = newBin+"4";
                            break;
                        case "0101":
                            newBin = newBin+"5";
                            break;
                        case "0110":
                            newBin =newBin+ "6";
                            break;
                        case "0111":
                            newBin = newBin+"7";
                            break;
                        case "1000":
                            newBin = newBin+"8";
                            break;
                        case "1001":
                            newBin =newBin+ "9";
                            break;
                        case "1010":
                            newBin = newBin+"a";
                            break;
                        case "1011":
                            newBin = newBin+"b";
                            break;
                        case "1100":
                            newBin = newBin+"c";
                            break;
                        case "1101":
                            newBin = newBin+"d";
                            break;
                        case "1110":
                            newBin = newBin+"e";
                            break;
                        case "1111":
                            newBin = newBin+"f" ;
                            break;


                    }
                }}
        return newBin;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        return null;
    }
}
