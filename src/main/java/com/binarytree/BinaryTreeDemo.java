package com.binarytree;

/**
 * Demonstration class showing how to calculate the height of a binary tree.
 */
public class BinaryTreeDemo {

    public static void main(String[] args) {
        System.out.println("Binary Tree Height Calculation Examples");
        System.out.println("========================================\n");

        // Example 1: Empty tree
        BinaryTree emptyTree = new BinaryTree();
        System.out.println("Example 1: Empty Tree");
        System.out.println("Height: " + emptyTree.height());
        System.out.println("Expected: -1\n");

        // Example 2: Single node tree
        TreeNode singleNode = new TreeNode(1);
        BinaryTree singleNodeTree = new BinaryTree(singleNode);
        System.out.println("Example 2: Single Node Tree");
        System.out.println("Tree structure: 1");
        System.out.println("Height: " + singleNodeTree.height());
        System.out.println("Expected: 0\n");

        // Example 3: Tree with height 1
        //     1
        //    / \
        //   2   3
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        BinaryTree tree1 = new BinaryTree(root1);
        System.out.println("Example 3: Balanced Tree (Height 1)");
        System.out.println("Tree structure:");
        System.out.println("    1");
        System.out.println("   / \\");
        System.out.println("  2   3");
        System.out.println("Height (Recursive): " + tree1.height());
        System.out.println("Height (Iterative): " + tree1.heightIterative());
        System.out.println("Expected: 1\n");

        // Example 4: Tree with height 2
        //     1
        //    / \
        //   2   3
        //  /
        // 4
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        BinaryTree tree2 = new BinaryTree(root2);
        System.out.println("Example 4: Unbalanced Tree (Height 2)");
        System.out.println("Tree structure:");
        System.out.println("    1");
        System.out.println("   / \\");
        System.out.println("  2   3");
        System.out.println(" /");
        System.out.println("4");
        System.out.println("Height (Recursive): " + tree2.height());
        System.out.println("Height (Iterative): " + tree2.heightIterative());
        System.out.println("Expected: 2\n");

        // Example 5: Skewed tree (all left children)
        //     1
        //    /
        //   2
        //  /
        // 3
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.left.left = new TreeNode(3);
        BinaryTree tree3 = new BinaryTree(root3);
        System.out.println("Example 5: Left-Skewed Tree (Height 2)");
        System.out.println("Tree structure:");
        System.out.println("    1");
        System.out.println("   /");
        System.out.println("  2");
        System.out.println(" /");
        System.out.println("3");
        System.out.println("Height (Recursive): " + tree3.height());
        System.out.println("Height (Iterative): " + tree3.heightIterative());
        System.out.println("Expected: 2\n");

        // Example 6: Complex tree with height 3
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6
        //   /
        //  7
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.right.right = new TreeNode(6);
        root4.left.left.left = new TreeNode(7);
        BinaryTree tree4 = new BinaryTree(root4);
        System.out.println("Example 6: Complex Tree (Height 3)");
        System.out.println("Tree structure:");
        System.out.println("       1");
        System.out.println("      / \\");
        System.out.println("     2   3");
        System.out.println("    / \\   \\");
        System.out.println("   4   5   6");
        System.out.println("  /");
        System.out.println(" 7");
        System.out.println("Height (Recursive): " + tree4.height());
        System.out.println("Height (Iterative): " + tree4.heightIterative());
        System.out.println("Expected: 3\n");

        System.out.println("All examples completed!");
    }
}
