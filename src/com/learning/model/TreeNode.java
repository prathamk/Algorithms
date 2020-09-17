package com.learning.model;

public class TreeNode<T> {
    private TreeNode node;
    private T data;

    public TreeNode(TreeNode node, T data) {
        this.node = node;
        this.data = data;
    }

    public TreeNode getNode() {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
