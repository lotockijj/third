package org.example.codilitty.algorithmic.skills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeHeightTest {

    private TreeHeight treeHeight;

    @BeforeEach
    void setUp() {
        treeHeight = new TreeHeight();
    }

    @Test
    void solution() {
        Tree tree = getTestTree();

        int result = treeHeight.solution(tree);

        assertEquals(2, result);
    }

    private Tree getTestTree() {
        Tree tree = new Tree();
        tree.x = 5;
        Tree firstSubTree = new Tree();
        firstSubTree.x = 3;
        tree.l = firstSubTree;
        Tree secondSubTree = new Tree();
        secondSubTree.x = 10;
        tree.r = secondSubTree;
        Tree thirdSubTree = new Tree();
        thirdSubTree.x = 20;
        firstSubTree.l = thirdSubTree;
        Tree fourthSubTree = new Tree();
        fourthSubTree.x = 21;
        firstSubTree.r = fourthSubTree;
        Tree fifthSubTree = new Tree();
        fifthSubTree.x = 1;
        secondSubTree.l = fifthSubTree;
        return tree;
    }
}