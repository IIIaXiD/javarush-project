package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        int summ = 0 ;
        boolean b = false;
        while(!b){
        while(scanner.hasNextInt/*boolean*/()){
            summ = summ+scanner.nextInt();
        }
        String s = scanner.nextLine();
        b ="ENTER".equals(s);
        }
        System.out.println(summ);
        scanner.close();
    }
}