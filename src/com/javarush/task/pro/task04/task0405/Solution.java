package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
             int a =0 ;
             while (a<10){
                 int b = 0;
                 while (b<20){
                    if((a>0 && a<9)&&(b>0 && b<19) )
                        System.out.print(" ");
                    else
                        System.out.print("Б");
                    b++;
                 }
                 System.out.println("");
                 a++;
             }

    }
}