package com.analytics.practice.design.patterns.gof.behavioral.command.example;

public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.toggle();
    }
}
