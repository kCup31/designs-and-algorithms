package com.analytics.practice.design.patterns.gof.structural.bridge.exampleone;

public class ShapeOneBridgeDemo {
    public static void main(String[] args) {

        Circle circle = new BlueCircle();
        Square square = new RedSquare();
        circle.applyColor();
        square.applyColor();
    }
}
