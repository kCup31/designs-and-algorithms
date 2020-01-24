package com.analytics.practice.ds.stack;

public class BasicStack<X> {
    private X [] data;
    private int stackPointer;

    public BasicStack() {
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }

    public void push(X newItem) {
        data[stackPointer++] = newItem;
    }

    public X pop() {
        if(stackPointer == 0) {
            throw new IllegalStateException("No More items on the stock");
        }
        return data[--stackPointer];
    }

    public boolean contains(X item) {
        for (X i: data) {
            if (i == item) {
                return  true;
            }
        }
        return false;
    }

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

