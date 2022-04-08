import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 226. Invert Binary Tree
 * Difficulty: Easy
 * Problem Link: https://leetcode.com/problems/invert-binary-tree/
 * 
 * Problem Question: Given the root of a binary tree, invert the tree, and return its root.

    Example 1:
    Input: root = [4,2,7,1,3,6,9]
    Output: [4,7,2,9,6,3,1]

    Example 2:
    Input: root = [2,1,3]
    Output: [2,3,1]

    Example 3:
    Input: root = []
    Output: []

    Constraints:
        The number of nodes in the tree is in the range [0, 100].
        -100 <= Node.val <= 100

 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution //Binary Tree | Non-Linear Structure where root has left and right nodes, left side always being less than the root, right side alays being greater than the root
{
    public TreeNode invertTree(TreeNode root) 
    {
        if (root==null)
        {
            return root;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}

/*
Time: O(n)
Space: O(1)
*/