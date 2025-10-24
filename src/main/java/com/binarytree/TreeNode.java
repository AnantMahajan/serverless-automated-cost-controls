package com.binarytree;

/**
 * Represents a node in a binary tree.
 */
public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    /**
     * Constructor to create a tree node with a value.
     *
     * @param value The value to store in the node
     */
    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    /**
     * Constructor to create a tree node with a value and children.
     *
     * @param value The value to store in the node
     * @param left The left child node
     * @param right The right child node
     */
    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
