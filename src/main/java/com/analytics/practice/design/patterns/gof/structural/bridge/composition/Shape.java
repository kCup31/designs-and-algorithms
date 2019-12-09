package com.analytics.practice.design.patterns.gof.structural.bridge.composition;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
