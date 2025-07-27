package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int N = scanner.nextInt();
       if(N>0) {
           int[] mass = new int [N];
           for (int i = 0; i <mass.length; i++) {
               mass[i] = scanner.nextInt();
           }
           if(N%2 == 0){
               for (int i = mass.length-1; i >=0 ; i--) {
                   System.out .println(mass[i]);
               }
           }
           else{
               for (int i = 0; i < mass.length ; i++) {
                   System.out.println(mass[i]);
               }
           }
       }
       else  {
           System.out.println("N меньше 0");
       }


        //напишите тут ваш код
    }
}
