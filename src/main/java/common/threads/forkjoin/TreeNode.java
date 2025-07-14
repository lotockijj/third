package common.threads.forkjoin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TreeNode {
    public int value;

    public Set<TreeNode> children;

    public TreeNode(int value, TreeNode... children) {
        this.value = value;
        this.children = new HashSet<>(Arrays.asList(children));
    }
}
