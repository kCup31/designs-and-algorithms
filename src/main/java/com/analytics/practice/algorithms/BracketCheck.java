package com.analytics.practice.algorithms;

import java.util.HashMap;
import java.util.Stack;

public class BracketCheck {

    public static void main(String[] args) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }

    public void solution(HashMap<Character, Character> map) {

        String brac = "[{()}]";
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<brac.length(); i++) {
            char c = brac.charAt(i);

            if(stack.contains(c)){

                Character topElement = stack.pop();
                if (topElement != map.get(c)) {
                    return;
                }

            } else {
                stack.push(c);
            }

        }
    }
}
