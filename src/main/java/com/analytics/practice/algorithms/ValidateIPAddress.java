package com.analytics.practice.algorithms;

import java.util.Scanner;

public class ValidateIPAddress {

    public static void main(String[] args) {
        System.out.println("Enter an IP");
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();

        String[] tokens = ip.split("\\.");
        if (tokens.length != 4) {
            System.out.println(" Not a valid IP Length");
        } else {

            for (String i : tokens) {
                int a = Integer.parseInt(i);
                if (a < 0 || a > 255) {
                    System.out.println("Not a valid IP value");
                    return;
                }
            }

            System.out.println("good IP");
        }
    }
}
