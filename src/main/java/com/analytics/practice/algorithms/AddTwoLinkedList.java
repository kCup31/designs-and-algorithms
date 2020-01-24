package com.analytics.practice.algorithms;

import java.util.Arrays;
import java.util.List;

public class AddTwoLinkedList {

    public static void main(String[] args) {
        List<Integer> num1 = Arrays.asList(1,3, 6, 7 , 9);
        List<Integer> num2 = Arrays.asList(3,6, 7, 8 , 9);

        int size = num1.size() > num2.size() ? num1.size(): num2.size();

        for(int i=0, j=0; i< num1.size() && j<num2.size(); i++, j++) {
            System.out.println(num1.get(i) + num2.get(j));
        }
    }
}

class ListNode {

    private int val;
    private ListNode next;

    public ListNode(int x) {
        this.val = x;
        this.next = null;
    }
}