package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Solution {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==null){
                a=i;
                for (int j = i; j < array.length; j++) {
                    if (array[j]!=null){
                        b=j;
                    array[a]=array[b];
                    array[b]= null;
                    break;
                    }
                }
            }
        }

    }
}


