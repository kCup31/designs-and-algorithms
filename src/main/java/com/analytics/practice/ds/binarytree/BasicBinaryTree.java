package com.analytics.practice.ds.binarytree;

public class BasicBinaryTree<X extends Comparable<X>> {

    private Node root;
    private int size;

    public BasicBinaryTree() {
        this.root = null;
    }

    private void add(X item) {
        Node node = new Node(item);

        if(root == null) {
            this.root = node;
            System.out.println("ADDED root node");
            this.size++;
        }
        else {
            insert(this.root, node);
        }
    }

    public boolean contains(X item) {

        Node currentNode = getNode(item);
        if(currentNode == null) {
            return false;
        } else {
            return true;
        }
    }

    private Node getNode(X item) {
        Node currentNode = this.root;

        while(currentNode != null) {
            int val = item.compareTo(currentNode.getItem());
            if(val == 0) {
                return currentNode;
            }
            else if (val < 0) {
                currentNode = currentNode.getLeft();
            }
            else {
                currentNode = currentNode.getRight();
            }
        }
        return null;
    }

    private void insert(Node parent, Node child) {
        // comparator:
        // less than 0
        // greater than returns greater than 0
        // lesser than returns lesser than 0
        if (child.getItem().compareTo(parent.getItem()) < 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getLeft(), child);
            }
        }
        else if(child.getItem().compareTo(parent.getItem()) > 0) {
            if(parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                this.size++;
            }
            else {
                insert(parent.getRight(), child);
            }
        }
    }

    private int size() {
        return size;
    }

    private class Node {
        private Node left;
        private Node right;
        private Node parent;
        private X item;

        public Node(X item) {
            this.item = item;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public X getItem() {
            return item;
        }

        public void setItem(X item) {
            this.item = item;
        }
    }
}
