package com.analytics.practice.design.patterns.gof.structural.adapter;

import java.util.Arrays;
import java.util.List;

// Example from JAVA api. Adapted array into the list using the asList. Only pitfall is only one adapter of one type which is
// array we are passin and converting to
public class AdapterExample {

    public static void main(String[] args) {

        Integer[] arrayOfInts = new Integer[] {42, 43, 45};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }
}
