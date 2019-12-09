package com.analytics.practice.design.patterns.function;

// Added a default method in functional interface
// Chain functional interface . In this example we chained two consumers
// should not forget to fail fast
public class PlayWithConsumers {

    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println("c1 = " + s);
        Consumer<String> c2 = s -> System.out.println("c2 = " + s);
        // Option 1
//        Consumer<String> c3 = s -> {
//            c1.accept(s);
//            c2.accept(s);
//        };

        // Option 2
        Consumer<String> c3 = c1.andThen(c2);

//        c3.accept("hello");
    }
}
