package com.learning.algos.binarysearchtrees;

import com.learning.model.BinaryTreeNode;
import com.learning.util.PrettyPrint;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTreeWalk<T extends Comparable<T>> {

    public List<T> levelOrderTraversal_BinaryTree_Iterative(BinaryTreeNode<T> rootNode) {
        if(rootNode == null) {
            return null;
        }
        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        List<T> nodeWalkList = new ArrayList<>();
        queue.add(rootNode);
        while(!queue.isEmpty()) {
            BinaryTreeNode<T> node = queue.poll();
            nodeWalkList.add(node.getData());
            if(node.getLeftNode() != null) {
                queue.add(node.getLeftNode());
            }
            if(node.getRightNode() != null) {
                queue.add(node.getRightNode());
            }
        }
        System.out.println("Tree Structure:");
        PrettyPrint.print2DTreeStructure(rootNode, 0);
        System.out.println("Level Order Traversal:");
        PrettyPrint.printSpaceSeparated(nodeWalkList.toArray());
        return nodeWalkList;
    }

    public void levelOrderTraversal_BinaryTree_Recursive(BinaryTreeNode<T> rootNode) {}
}
