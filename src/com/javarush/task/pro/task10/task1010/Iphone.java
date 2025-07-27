package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone extends Object {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    //@Override
    public  boolean equals (Object obj){
        if(obj == null){
            return false;
        }

        Iphone iphone = (Iphone) obj;
        return this.price == iphone.price && this.model== iphone.model && this.color == iphone.color;
    }
    //напишите тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
