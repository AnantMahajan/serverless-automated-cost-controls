# Binary Tree Height Calculation in Java

This implementation provides a complete solution for calculating the height of a binary tree in Java.

## Overview

The height of a binary tree is defined as the number of edges on the longest path from the root node to a leaf node.
- An empty tree has a height of **-1**
- A tree with only a root node has a height of **0**
- A tree with a root and at least one child has a height of **1** or more

## Implementation Details

### Classes

1. **TreeNode.java** (`src/main/java/com/binarytree/TreeNode.java`)
   - Represents a single node in the binary tree
   - Contains: value, left child, right child
   - Provides constructors for easy node creation

2. **BinaryTree.java** (`src/main/java/com/binarytree/BinaryTree.java`)
   - Main binary tree class
   - Implements two methods for height calculation:
     - `height()`: Recursive approach (more intuitive)
     - `heightIterative()`: Iterative approach using level-order traversal

3. **BinaryTreeDemo.java** (`src/main/java/com/binarytree/BinaryTreeDemo.java`)
   - Demonstration class with multiple examples
   - Shows various tree structures and their heights

## Algorithm Explanation

### Recursive Approach

```java
private int calculateHeight(TreeNode node) {
    if (node == null) {
        return -1;  // Base case: empty tree
    }

    int leftHeight = calculateHeight(node.left);
    int rightHeight = calculateHeight(node.right);

    return 1 + Math.max(leftHeight, rightHeight);
}
```

**Time Complexity**: O(n) - visits each node once
**Space Complexity**: O(h) - recursion stack, where h is the height

### Iterative Approach

Uses level-order traversal (BFS) with a queue to count levels.

**Time Complexity**: O(n) - visits each node once
**Space Complexity**: O(w) - queue size, where w is the maximum width

## Usage Example

```java
// Create a binary tree
TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);

BinaryTree tree = new BinaryTree(root);

// Calculate height
int height = tree.height();  // Returns 2
```

## Compilation and Execution

```bash
# Compile all Java files
javac src/main/java/com/binarytree/*.java

# Run the demo
java -cp src/main/java com.binarytree.BinaryTreeDemo
```

## Test Cases

The demo includes 6 test cases:
1. Empty tree (height: -1)
2. Single node (height: 0)
3. Balanced tree with 3 nodes (height: 1)
4. Unbalanced tree (height: 2)
5. Left-skewed tree (height: 2)
6. Complex tree (height: 3)

## Key Points

- The implementation provides both recursive and iterative solutions
- Height is calculated as the number of edges, not nodes
- Null/empty trees return -1 as height
- Both methods produce the same result; choose based on preference:
  - Recursive: More elegant and easier to understand
  - Iterative: Avoids stack overflow for very deep trees
