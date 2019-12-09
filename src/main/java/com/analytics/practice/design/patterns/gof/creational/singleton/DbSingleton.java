package com.analytics.practice.design.patterns.gof.creational.singleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    private DbSingleton() {

        // No body uses reflections
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create new instance");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
