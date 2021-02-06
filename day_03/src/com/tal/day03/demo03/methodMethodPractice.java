package com.tal.day03.demo03;

public class methodMethodPractice {
    public static void main(String[] args) {

    }
    public static boolean same(int a, int b){
        return a==b;
    }
    public static int add(){
        int sum = 0;
        for(int i = 0; i <= 100;i++){
            sum += i;
        }
        return sum;
    }
    public static void printHelloW(int num){
        for(int i = 0;i < num;num++){
            System.out.println("HelloWorld!!");
        }
    }
}
