package com.analytics.practice.design.patterns.gof.behavioral.cor.example;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve anything");
    }
}
