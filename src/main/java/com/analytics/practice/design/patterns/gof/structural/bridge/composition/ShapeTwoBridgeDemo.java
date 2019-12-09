package com.analytics.practice.design.patterns.gof.structural.bridge.composition;

public class ShapeTwoBridgeDemo {

    public static void main(String[] args) {
        Color blue = new Blue();

        Shape square = new Square(blue);
        square.applyColor();
    }
}
