package com.analytics.practice.design.patterns.gof.creational.singleton;

public class SingletonExampleBasic {

    public static void main(String[] args) {

        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);

        if (singletonRuntime == anotherInstance) {
            System.out.println("They are same instance");
        }
    }

}

// TODO:

// Create a singleton
// Demonstrate only one instance is created
// Lazy Loaded
// Thread safe operation
