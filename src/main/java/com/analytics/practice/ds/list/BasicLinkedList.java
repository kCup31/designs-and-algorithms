package com.analytics.practice.ds.list;

import javax.swing.plaf.IconUIResource;

public class BasicLinkedList<X> {

    private Node first;
    private Node last;
    private  int nodeCount;

    public BasicLinkedList() {
        first = null;
        last = null;
        nodeCount = 0;
    }

    private void add(X item){
        if (first == null) {
            first = new Node(item);
            first = last;
        }
        else {
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }

    public void insert(X item, int position) {

        Node currentNode = first;

        for(int i=1; i< position & currentNode != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }

    public X remove(int position) {
        Node currentNode = first;
        Node prevNode = first;
        for(int i =1; i<position && currentNode!= null; i++) {
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        X nodeItem = currentNode.getNodeItem();
        prevNode.setNextNode(currentNode.getNextNode());
        nodeCount--;
        return nodeItem;
    }

    private X remove() {
        if (first == null) {
            throw new IllegalArgumentException("Empty");
        }
        X nodeItem = first.getNodeItem();
        nodeCount--;
        return nodeItem;
    }

    public X get(int position) {

        if(first == null) {

        }
        Node currentNode = first;
        for (int i=1; i< size() && currentNode != null; i++) {
            if (i == position) {
                return currentNode.getNodeItem();
            }
            currentNode = currentNode.getNextNode();
        }
        return  null;
    }

    public int find(X item) {
        Node currentNode = first;
        for (int i=1; i< size() && currentNode != null; i++) {
            if (currentNode.getNodeItem().equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private int size() {
        return nodeCount;
    }

    private class Node {
        private Node nextNode;
        private X nodeItem;

        public Node(X item) {
            this.nodeItem = item;
            this.nextNode = null;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public X getNodeItem() {
            return nodeItem;
        }
    }
}
