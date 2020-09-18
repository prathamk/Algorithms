package com.learning.algos.binarysearchtrees.treestructure;

import com.learning.algos.binarysearchtrees.operations.impl.BinarySearchTreeOperations;
import com.learning.algos.trees.BinaryTree;
import com.learning.model.BinaryTreeNode;
import com.learning.util.PrettyPrint;

public class BinarySearchTree<T extends Comparable<T>> implements BinaryTree<T> {

    BinaryTreeNode<T> rootNode = null;

    BinarySearchTreeOperations<T> treeOps;

    public BinarySearchTree() {}

    public BinarySearchTree(BinaryTreeNode<T> treeNode) {
        treeOps.insert(this, treeNode);
    }

    @Override
    public BinaryTreeNode<T> getRootNode() {
        return rootNode;
    }

    @Override
    public void setRootNode(BinaryTreeNode<T> rootNode) {
        this.rootNode = rootNode;
    }
}