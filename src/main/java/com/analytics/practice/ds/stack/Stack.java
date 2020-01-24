package com.analytics.practice.ds.stack;

public interface Stack<X> {
    void push(X item);
    X pop();
    boolean contains(X item);
    public X access(X item);
    int size();
}
