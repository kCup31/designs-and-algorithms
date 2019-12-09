package com.analytics.practice.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSortedArrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length of Array 1 : ");
        int arr1Length = in.nextInt();
        int num1[] = new int[arr1Length];
        System.out.println("Enter the elements of Array 1 : ");
        for (int i = 0; i < arr1Length; i ++ ) {
            num1[i] = in.nextInt();
        }

        System.out.println("Enter Length of Array 2 : ");
        int arr2Length = in.nextInt();
        int num2[] = new int[arr2Length];
        System.out.println("Enter the elements of Array 2 : ");
        for (int i = 0; i < arr2Length; i ++ ) {
            num2[i] = in.nextInt();
        }

        int[] result = new int[num1.length + num2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < num1.length -1 && j < num2.length -1) {

            if (num1[i] < num2[j])
                result[k++] = num1[i++];
            else
                result[k++] = num2[j++];
        }

        while (i < num1.length) {
            result[k++] = num1[i++];
        }

        while(j < num2.length) {
            result[k++] = num2[j++];
        }

        System.out.print(Arrays.toString(result));
    }
}
