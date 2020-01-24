package com.analytics.practice.algorithms;

public class ReverseNumber {

    public static void main(String[] args) {

        int res = 1234;
        System.out.println(reverse(res));
    }

    public static int reverseUsingString(int x) {


        String str = Integer.toString(x);
        StringBuilder strbuilder = new StringBuilder(str);
        String rev = strbuilder.reverse().toString();
        return Integer.parseInt(rev);
    }

    public static int reverse(int x) {

        long res = 0;
        while(x != 0) {
            res = res * 10 + x % 10;

            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) res;
        }
    }

    public int reverseFromInternet(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }
}
