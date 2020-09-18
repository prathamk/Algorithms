package com.learning.algos.binarysearchtrees.operations;

import com.learning.algos.trees.BinaryTree;
import com.learning.model.BinaryTreeNode;

public interface TreeOperations<T extends Comparable<T>> {

    public void insert(BinaryTree<T> binaryTree, BinaryTreeNode<T> node);
}
