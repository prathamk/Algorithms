package src.com.learning.test.algos.trees;

import com.learning.algos.binarysearchtrees.operations.TreeOperations;
import com.learning.algos.binarysearchtrees.operations.impl.BinarySearchTreeOperations;
import com.learning.algos.binarysearchtrees.treestructure.BinarySearchTree;
import com.learning.algos.trees.BinaryTree;
import com.learning.algos.trees.BinaryTreeType;
import com.learning.model.BinaryTreeNode;

public class BinaryTreeOperationsTest<T extends Comparable<T>> {

    TreeOperations<T> treeOperations;

    BinaryTreeType treeType;

    public BinaryTreeOperationsTest(BinaryTreeType treeType) {
        this.treeOperations = getTreeOperations(treeType);
    }

    public BinaryTree<T> createBinaryTree(T[] dataArr) {
        BinaryTree binaryTree = new BinarySearchTree();
        for (int i = 0; i < dataArr.length; i++) {
            treeOperations.insert(binaryTree, new BinaryTreeNode(dataArr[i]));
        }
        return binaryTree;
    }

    public TreeOperations<T> getTreeOperations(BinaryTreeType treeType) {
        if(treeType == BinaryTreeType.BINARY_SEARCH_TREE) {
            return new BinarySearchTreeOperations<>();
        }
        return null;
    }
}
