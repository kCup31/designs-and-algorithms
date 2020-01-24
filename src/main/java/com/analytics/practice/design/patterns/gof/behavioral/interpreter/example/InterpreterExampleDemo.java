package com.analytics.practice.design.patterns.gof.behavioral.interpreter.example;


public class InterpreterExampleDemo {

    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        return terminal1;
    }

    public static void main(String[] args) {

        String context = "Lions";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context) );
    }
}
