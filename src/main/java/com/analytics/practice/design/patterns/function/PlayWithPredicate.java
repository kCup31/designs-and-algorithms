package com.analytics.practice.design.patterns.function;

public class PlayWithPredicate {

    public static void main(String[] args) {
        Predicate<String> p1 = s-> s != null;
        Predicate<String> p2 = s-> !s.isEmpty();

        Predicate<String> p3 = p1.and(p2);
        Predicate<String> notP2 = p2.negate();

        System.out.println(p3.test(null));
        System.out.println(p3.test(""));
        System.out.println(p3.test("hello"));
        System.out.println(notP2.test("hello"));


    }
}
