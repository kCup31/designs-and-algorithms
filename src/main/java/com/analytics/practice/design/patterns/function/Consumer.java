package com.analytics.practice.design.patterns.function;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);

    // Functional interface allows only one abstract method. So rest have to be concrete method. so it has to be default
    default Consumer<T> andThen(Consumer<T> other) {
        Objects.requireNonNull(other);
        // To return void...
//        return (T t) -> {};
        // returns
        return (T t) -> {
            this.accept(t);
            other.accept(t);
        };
    }
}
