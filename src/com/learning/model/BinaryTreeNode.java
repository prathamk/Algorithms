package com.learning.model;

public class BinaryTreeNode<T extends Comparable<T>> implements Comparable<BinaryTreeNode<T>> {
    private BinaryTreeNode<T> parent;
    private BinaryTreeNode<T> leftNode;
    private BinaryTreeNode<T> rightNode;
    private T data;

    public BinaryTreeNode(BinaryTreeNode<T> parent, BinaryTreeNode<T> leftNode, BinaryTreeNode<T> rightNode, T data) {
        this(data);
        this.parent = parent;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public BinaryTreeNode(T data) {
        this.data = data;
    }

    public BinaryTreeNode<T> getParent() {
        return parent;
    }

    public void setParent(BinaryTreeNode<T> parent) {
        this.parent = parent;
    }

    public BinaryTreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public int compareTo(BinaryTreeNode<T> o) {
        return getData().compareTo(o.getData());
    }
}