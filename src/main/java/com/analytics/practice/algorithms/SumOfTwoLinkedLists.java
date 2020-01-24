package com.analytics.practice.algorithms;


import java.util.List;

//  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//  Output: 7 -> 0 -> 8
//  Explanation: 342 + 465 = 807.
public class SumOfTwoLinkedLists {

    public static void main(String[] args) {

        ListNode ln11 = new ListNode(2);
        ListNode ln12 = new ListNode(4);
        ListNode ln13 = new ListNode(3);
        ln11.setNext(ln12);
        ln12.setNext(ln13);
        ln13.setNext(null);


        ListNode ln21 = new ListNode(5);
        ListNode ln22 = new ListNode(6);
        ListNode ln23 = new ListNode(4);
        ln21.setNext(ln22);
        ln22.setNext(ln23);
        ln23.setNext(null);

        ListNode resLn = addTwoNumbers(ln11, ln22);
        System.out.println(resLn);

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Head or first Node with default 0
        ListNode dummyHead = new ListNode(0);
        ListNode l11 = l1, l21 = l2, currentNode = dummyHead;
        int carry = 0;

        while (l11 != null || l21 != null) {

            int l11Val = (l11 != null) ? l11.val : 0;
            int l21Val = (l21 != null) ? l21.val : 0;

            int sum = carry + l11Val + l21Val;
            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            if (l11 != null) l11 = l11.next;
            if (l21 != null) l21 = l21.next;
        }

        if (carry > 0) {
            currentNode.next = new ListNode(carry);
        }
        System.out.println(currentNode);
        return dummyHead.next;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

//
//    public static  void addTwoNumbers(ListNode ln1, ListNode ln2) {
//
//        ListNode resLn = new ListNode(0, null);
//        int carry = 0;
//
//        while (ln1.getNext() != null || ln2.getNext() != null) {
//            int val = carry + ln1.getVal() + ln2.getVal();
//            carry = val/10;
//            resLn.setVal(val%10);
//            resLn.setNext(new ListNode(val%10, null));
//            ln1 = ln1.next;
//            ln2 = ln2.next;
//            resLn = resLn.next;
//        }
//
//        System.out.println(resLn);
//    }
//
//
//     // Definition for singly-linked list.
//      public static class ListNode {
//        int val;
//        ListNode next;
//        public ListNode(int x , ListNode listNode) {
//            val = x;
//            next = listNode;
//        }
//
//         public void setNext(ListNode next) {
//             this.next = next;
//         }
//
//         public int getVal() {
//             return val;
//         }
//
//         public ListNode getNext() {
//             return next;
//         }
//
//         public void setVal(int val) {
//             this.val = val;
//         }
//     }
}
