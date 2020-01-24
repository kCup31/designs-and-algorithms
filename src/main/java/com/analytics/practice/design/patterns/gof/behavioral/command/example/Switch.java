package com.analytics.practice.design.patterns.gof.behavioral.command.example;

// Invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
