package com.learning.algos.trees;

import com.learning.model.BinaryTreeNode;

public interface BinaryTree<T extends Comparable<T>> {

    public BinaryTreeNode<T> getRootNode();

    public void setRootNode(BinaryTreeNode<T> rootNode);
}
