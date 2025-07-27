package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = Math.min(Math.min(Math.min(ints[0],ints[1]),Math.min(ints[2],ints[3])),Math.min(Math.min(ints[4],ints[5]),Math.min(Math.min(ints[6],ints[7]),Math.min(ints[8],ints[9])))) ;

        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int [] mass = new int [10];
        for (int i = 0; i < 10; i++) {
            mass[i] = scanner.nextInt();
        }
        return mass;
    }
}
