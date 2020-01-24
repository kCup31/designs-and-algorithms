package com.analytics.practice.ds.hashes;

public class BasicHashtable<X, Y> {
    private HashEntry[] data;
    private int capacity;
    private int size;

    public BasicHashtable(int capacity) {
        this.capacity = capacity;
        this.data = new HashEntry[this.capacity];
        this.size = 0;
    }

    public Y get(X key) {
        int hash = calculateHash(key);
        if (data[hash] == null) {
            return null;
        }
        else {
            return (Y)data[hash].getValue();
        }
    }

    public void put(X key, Y value) {
        int hash = calculateHash(key);
        data[hash] = new HashEntry<X, Y>(key, value);
        size++;
    }

//    public Y delete(X key) {
//        Y value = get(key);
//
//    }

    private int calculateHash(X key) {
        int hash = (key.hashCode() % this.capacity);
        while (data[hash] != null && !data[hash].getKey().equals(key)) {
            hash = (hash +1) % this.capacity;
        }
        return hash;
    }

    public int size() {
        return size;
    }

    private class HashEntry<X, Y> {
        private X key;
        private Y value;

        public HashEntry(X key, Y value) {
            this.key = key;
            this.value = value;
        }

        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }
    }
}
