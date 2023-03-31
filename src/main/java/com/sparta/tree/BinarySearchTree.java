package com.sparta.tree;

import com.sparta.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(List<T> items) {
        for (T item : items) {
            insert(item);
        }
    }

    private static class Node<T> {
        private T value;
        private Node<T> left;
        private Node<T> right;

        public Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(T value) {
        root = insert(root, value);
    }

    private Node<T> insert(Node<T> node, T value) {
        if (node == null) {
            return new Node<>(value);
        }

        if (value.compareTo(node.value) < 0) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        return node;
    }

    public List<T> search(T value) {
        List<T> result = new ArrayList<>();
        search(root, value, result);
        return result;
    }

    private void search(Node<T> node, T value, List<T> result) {
        if (node == null) {
            return;
        }

        if (value.compareTo(node.value) == 0) {
            result.add(node.value);
            search(node.left, value, result);
            search(node.right, value, result);
        } else if (value.compareTo(node.value) < 0) {
            search(node.left, value, result);
        } else {
            search(node.right, value, result);
        }
    }
}
