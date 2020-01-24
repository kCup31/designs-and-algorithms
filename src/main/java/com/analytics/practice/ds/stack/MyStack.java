package com.analytics.practice.ds.stack;

public class MyStack<X> implements Stack<X> {
    private X [] data;
    private int stackPointer;

    public MyStack() {
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }

    @Override
    public void push(X item) {
        data[stackPointer++] = item;
    }

    @Override
    public X pop() {
        if(stackPointer == 0) {
            throw new IllegalStateException("No More items on the stock");
        }
        return data[--stackPointer];
    }

    @Override
    public boolean contains(X item) {
        for (X i: data) {
            if (i == item) {
                return  true;
            }
        }
        return false;
    }

    @Override
    public X access(X item) {
        while(stackPointer > 0) {
            X tmpItem = pop();
            if(item.equals(tmpItem)) {
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("Could not find item on stack: " + item);
    }

    public int size() {
        return stackPointer;
    }
}
