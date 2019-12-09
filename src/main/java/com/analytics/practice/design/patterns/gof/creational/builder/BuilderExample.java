package com.analytics.practice.design.patterns.gof.creational.builder;

public class BuilderExample {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("Hello");
        builder.append("!!!");
        builder.append("\n");
        builder.append("how are you? ");
        builder.append("\n");
        builder.append("Diptanu");

        System.out.println(builder.toString());

    }
}
