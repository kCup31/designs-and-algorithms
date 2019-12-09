package com.analytics.practice.design.patterns.gof.structural.bridge.composition;

public  class Circle extends Shape  {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
