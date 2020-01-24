package com.analytics.practice.algorithms;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

    public static void main(String[] args) {
        String str = "racecar";

//       String palindromes = getLongestPalindrome(str);
//        System.out.println(palindromes);
        System.out.println(longestPalindrome(str));
        // Ceentralization Approach

    }

    //o(n^3)
    public static String getLongestPalindrome(String str) {
        // O(n^3)
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i<= str.length(); i ++) {
            for (int j = i; j <= str.length(); j++) {
                if (isPalindrome(str.substring(i, j))) {
                    palindromes.add(str.substring(i, j));
                }
            }
        }
        String result = "";
        for ( String p: palindromes) {
           result =  (p.length() > result.length()) ? p : result;
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        StringBuilder plain = new StringBuilder(str);
        StringBuilder rev = plain.reverse();
        return (rev.toString().equals(str));
    }

    // O(n^2)
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, longestLength = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            if (((right - left) - 1) > longestLength) {
                longestLength = ((right - left) - 1);
                start = left + 1;
            }


        }
        return s.substring(start, longestLength + 1);
    }// racecar, //baab

//    private static int expandAroundCenter(String s, int left, int right) {
//        int L = left, R = right;
//        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
//            L--;
//            R++;
//        }
//        return R - L - 1;
//    }

}
