package leetcode.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isBalanced() {
    }

    public static TreeNode create(Integer[] nodes){
        TreeNode root = null;
        for (int i = 0; i < nodes.length; ) {
            TreeNode temp = getNode(nodes, i);
            if(temp != null) i++;
            TreeNode left = getNode(nodes, i);
            if(left != null) i++;
            TreeNode right = getNode(nodes, i);
            if(right != null) i++;
        }
        return root;
    }

    private static TreeNode getNode(Integer[] nodes, int i) {
        if(i < nodes.length){
            if(nodes[i] == null) {
                return null;
            }
            return new TreeNode(nodes[i]);
        }
        return null;
    }
}