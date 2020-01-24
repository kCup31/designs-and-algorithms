package com.analytics.practice.ds.queue;

import java.util.Objects;

public class BasicQueue<X> {

    private X[] data;
    private int front;
    private int end;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        this.data = (X[]) new Objects[size];
        this.end = -1;
        this.front = -1;
    }

    public int size() {
        if (front == -1 && end == -1) {
            return 0;
        } else {
            return (end - front + 1);
        }
    }

    public void enqueue(X item) {
        // check if total size of the queue is full
        if ((end + 1 ) % data.length == front) {
            throw  new IllegalStateException(" The Queue is full");
        }
        else if (size() == 0) {
            front++;
            end++;
            data[front] = item;
        }
        else {
            end++;
            data[end] = item;
        }
    }

    public X dequeue() {
        X item = null;

        // if Queue is empty we cant qdequeue
        if (size() == 0) {
            throw new IllegalStateException("Cant dequeue as the queue is empty");
        }
        // if this is the last item on the queus, we need to reset pointer
        else if(front == end) {
            item = data[front];
            front = -1;
            end = -1;
        }
       else {
            item = data[front];
            front++;
        }
        return item;
    }

    public boolean contains(X item) {
        boolean found = false;

        if (size() == 0) {
            return found;
        }
        for(X i : data) {
            if (i.equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(int position) {
        if (size() == 0 || position > size()) {
            throw new IllegalStateException("Empty Queue");
        }
        int trueIndex = 0;
        for (int i = front; i< end; i++) {
            if (trueIndex == position) {
                return data[i];
            }
            trueIndex++;
        }
        throw new IllegalArgumentException("Could not get item in queue at this position");
    }
}
