package src.com.learning.test.algos.binarysearchtrees.traversal;

import com.learning.algos.binarysearchtrees.LevelOrderTreeWalk;
import com.learning.algos.trees.BinaryTree;
import com.learning.algos.trees.BinaryTreeType;
import src.com.learning.test.algos.trees.BinaryTreeOperationsTest;

public class LevelOrderTreeWalkTest<T> extends BinaryTreeWalkTestBase {

    public static void main(String[] args) {
        LevelOrderTreeWalkTest<Integer> levelOrderTreeWalkTest = new LevelOrderTreeWalkTest<>();
        levelOrderTreeWalkTest.LevelOrderTreeWalk_Iterative_BinarySearchTree_Test();
    }

    public void LevelOrderTreeWalk_Iterative_BinarySearchTree_Test() {
        BinaryTree<Integer> binaryTree = operationsTest.createBinaryTree(new Integer[] {3, 9, 5, 4, 4, 6, 7, 8, 2});

        LevelOrderTreeWalk<Integer> lev = new LevelOrderTreeWalk();
        lev.levelOrderTraversal_BinaryTree_Iterative(binaryTree.getRootNode());
    }
}