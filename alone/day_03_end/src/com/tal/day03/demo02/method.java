package com.tal.day03.demo02;

public class method {
    public static void main(String[] args) {
        fun("*");
    }
    public static void fun(String s){
        for(int i = 0;i <= 5;i++){
            for (int j = 0; j <= 10; j++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
