package com.tal.day03.demo03;

public class methodUse {
    public static void main(String[] args) {
        //单独调用
        add(1,2);
        System.out.println("**********");
        //打印调用
        System.out.println(add(2,3));
        System.out.println("**********");
        //赋值调用
        int num = add(1,4);
        System.out.println(num);
    }
    public static int add(int a,int b){
        System.out.println("Method has been run!");
        return a+b;
    }
}
