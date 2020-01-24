package com.analytics.practice.design.patterns.gof.behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterDemo {

    public static void main(String[] args) {
        String input = "Lions, and tigers, and bears! oh, my!";

        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|rabbit|Lion)");
        Matcher m = p.matcher(input);

        while(m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }

    }
}
