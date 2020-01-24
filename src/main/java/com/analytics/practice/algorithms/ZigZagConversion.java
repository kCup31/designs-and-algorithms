package com.analytics.practice.algorithms;

import java.util.HashMap;
import java.util.Map;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
//        And then read line by line: "PAHNAPLSIIGYIR"
public class ZigZagConversion {

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        System.out.println(convert(str, 3));
        System.out.println(convertToZigZag(str, 3));
//        convertToZigZag(str, 3);
    }


    public static String convertToZigZag(String str, int numRows) {

        Map<Integer, StringBuilder> map = new HashMap<>();
        int pos = 0; boolean incr = true;
        for (char c: str.toCharArray()) {
            if (pos == numRows) incr = false;
            if (pos == 1) incr = true;
            if (incr) pos++; else pos--;

            if (!map.containsKey(pos)) {
                map.put(pos, new StringBuilder());
            }

            map.get(pos).append(c);
        }
        StringBuilder res = new StringBuilder();
        for (int i: map.keySet()) {
            res.append(map.get(i));
        }
        return res.toString();
    }

    static String convert(String str, int numRows) {

        Map<Integer, StringBuilder> map = new HashMap<>();

        int pos = 0;
        boolean incr = true;
        for (char c: str.toCharArray()) {
            if (pos == numRows) incr=false;
            if(pos == 1) incr = true;
            if(incr) pos ++; else pos--;

            if(!map.containsKey(pos)) {
                map.put(pos, new StringBuilder());
            }
            map.get(pos).append(c);
        }

        StringBuilder res = new StringBuilder();
        for(int i: map.keySet()) {
            res.append(map.get(i));
        }
        return res.toString();
    }
}

