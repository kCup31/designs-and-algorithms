package com.analytics.practice.algorithms;

import java.util.HashSet;
public class FirstRepeatedNum {

    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 2, 1, 6, 7, 3, 9};
        printFirstRepeatedNumOne(nums);
        printFirstRepeatedNumTwo(nums);
    }

    //O(n2)
    private static void printFirstRepeatedNumOne(int[] nums) {

        int found = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    found = nums[i];
                    break;
                }
            }
            if (found != 0) {
                break;
            }
        }
        System.out.println("Found the first repeated num : " + found);
    }

    // Time Complexity : O(n)
    private static void printFirstRepeatedNumTwo(int[] nums) {
        HashSet<Integer> map = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (map.contains(nums[i])) {
                System.out.println("Found Number from Func Two : " + nums[i]);
                break;
            } else {
                map.add(nums[i]);
            }
        }
    }
}
