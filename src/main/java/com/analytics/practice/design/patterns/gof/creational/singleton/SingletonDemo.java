package com.analytics.practice.design.patterns.gof.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(anotherInstance);
    }
}
