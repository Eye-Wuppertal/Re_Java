package com.tal.day03.demo03;

public class methodOverload {
    public static void main(String[] args) {

    }
    public static boolean isSame(int a,int b){
        return a==b;
    }
    public static boolean isSame(short a,short b){
        boolean same = a==b?true:false;
        return same;
    }
}
