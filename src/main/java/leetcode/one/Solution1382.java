package leetcode.one;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public boolean isBalanced(TreeNode root) {
        return innerIsBalanced(root);
    }

    //          1
    //       2         2
    //    3     3
    //  4   4
    public boolean innerIsBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left == null && (root.right == null || root.right.right == null && root.right.left == null)){
            return true;
        }
        if(root.right == null && (root.left == null || root.left.left == null && root.left.right == null)){
            return true;
        }
        if(root.right.left == null && root.right.right == null && (root.left != null && (root.left.left != null && root.left.right != null))){
            return false;
        }
        return innerIsBalanced(root.left) && innerIsBalanced(root.right);
    }
}
