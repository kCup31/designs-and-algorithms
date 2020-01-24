package com.analytics.practice.algorithms;

public class Atoi {

    public static void main(String[] args) {

        String str = "123";
        int result = 0;
        for (char a : str.toCharArray()) {
            int num =  (a - '0');
            System.out.println("num :" + num);
            result = result * 10 + num;
        }

        System.out.println(result);
    }
}
