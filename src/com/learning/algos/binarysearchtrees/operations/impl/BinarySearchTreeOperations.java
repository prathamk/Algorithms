package com.learning.algos.binarysearchtrees.operations.impl;

import com.learning.algos.binarysearchtrees.operations.TreeOperations;
import com.learning.algos.trees.BinaryTree;
import com.learning.model.BinaryTreeNode;

public class BinarySearchTreeOperations<T extends Comparable<T>> implements TreeOperations<T> {

    @Override
    public void insert(BinaryTree<T> tree, BinaryTreeNode<T> nodeToBeInserted) {
        BinaryTreeNode<T> treeNode = tree.getRootNode();
        BinaryTreeNode<T> tmpNode = null;
        if(treeNode == null) {
            tree.setRootNode(nodeToBeInserted);
            return;
        }
        while(treeNode != null) {
            tmpNode = treeNode;
            if(nodeToBeInserted.compareTo(treeNode) <= 0) {
                treeNode = treeNode.getLeftNode();
            }
            else {
                treeNode = treeNode.getRightNode();
            }
        }
        if(nodeToBeInserted.compareTo(tmpNode) <= 0) {
            tmpNode.setLeftNode(nodeToBeInserted);
        }
        else {
            tmpNode.setRightNode(nodeToBeInserted);
        }
        nodeToBeInserted.setParent(tmpNode);
    }
}