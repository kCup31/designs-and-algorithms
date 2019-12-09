package com.analytics.practice.algorithms;

import java.util.Scanner;

public class ReverseString
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : " );
        String msg = in.nextLine();
        reverseOne(msg);
        reverseTwo(msg);
        reverseThree(msg);
        reverseFour(msg);
    }

    // Option 1
    // Solution one using string manipulation
    // Complexity of O(n)
    public static void reverseOne(String msg) {

        char[] msgArr = msg.toCharArray();
        String result = "";
        for (int i = msgArr.length-1; i >= 0; i--) {
            result =  result + msgArr[i] ;
        }
        System.out.println("1 using char[] :- " + result );
    }

    // Option2
    // Using regex split function provided by String
    // Complexity: O(n). Split() has lot of complexity on its own
    public static void reverseTwo(String msg) {

        String[] msgArr = msg.split("");
        String result = "";
        for(int i = 0; i < msgArr.length; i++) {
            result = msgArr[i] + result;
        }
        System.out.println("2 regex split() to get String[] :-  " + result);
    }

    // Option 3
    // Complexity O(n)
    public static void reverseThree(String msg) {

        byte[] msgArr = msg.getBytes();
        byte[] result = new byte[msg.length()];


        for (int i = 0; i <= msgArr.length - 1; i++ ) {
            result[i] = msgArr[(msgArr.length - 1) - i];
        }
        System.out.println("3 byte[] by using String's getBytes() :- " + new String(result));
    }

    // Option 4
    // Using StringBuilder's reverse method
    public static void reverseFour(String msg) {

        StringBuilder input = new StringBuilder(msg);
        System.out.print("4 String Builder's inbuilt reverse :- " + input.reverse() );
    }

}
