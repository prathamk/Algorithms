package com.learning.util;

import com.learning.model.BinaryTreeNode;

public class PrettyPrint {

    private static final int COUNT = 10;

    public static <T> void printSpaceSeparated(T[] t) {
        for(int i = 0; i < t.length-1; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.print(t[t.length-1]);
    }

    public static <T extends Comparable<T>> void print2DTreeStructure(BinaryTreeNode<T> node, int space) {
        if (node == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DTreeStructure(node.getRightNode(), space);

        // Print current node after space count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(node.getData() + "\n");

        // Process left child
        print2DTreeStructure(node.getLeftNode(), space);
    }
}
