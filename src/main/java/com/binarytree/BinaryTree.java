package com.binarytree;

/**
 * Binary Tree implementation with height calculation functionality.
 */
public class BinaryTree {
    private TreeNode root;

    /**
     * Constructor to create an empty binary tree.
     */
    public BinaryTree() {
        this.root = null;
    }

    /**
     * Constructor to create a binary tree with a root node.
     *
     * @param root The root node of the tree
     */
    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    /**
     * Get the root of the binary tree.
     *
     * @return The root node
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * Set the root of the binary tree.
     *
     * @param root The root node to set
     */
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * Calculate the height of the binary tree.
     * The height is defined as the number of edges on the longest path from the root to a leaf.
     * An empty tree has a height of -1.
     * A tree with only a root node has a height of 0.
     *
     * @return The height of the tree
     */
    public int height() {
        return calculateHeight(root);
    }

    /**
     * Recursive helper method to calculate the height of a tree rooted at a given node.
     *
     * @param node The root of the subtree
     * @return The height of the subtree
     */
    private int calculateHeight(TreeNode node) {
        // Base case: empty tree has height -1
        if (node == null) {
            return -1;
        }

        // Recursive case: height is 1 + max of left and right subtree heights
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    /**
     * Alternative implementation using iterative approach with level-order traversal.
     * This method calculates height without recursion.
     *
     * @return The height of the tree
     */
    public int heightIterative() {
        if (root == null) {
            return -1;
        }

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        int height = -1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            height++;

            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }

        return height;
    }

    /**
     * Check if the tree is empty.
     *
     * @return true if the tree is empty, false otherwise
     */
    public boolean isEmpty() {
        return root == null;
    }
}
