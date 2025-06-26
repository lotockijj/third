package org.example.codilitty.algorithmic.skills;

public class TreeHeight {

    // 100% from first triel ; Hooray !!!
    public int solution(Tree T){
        // Implement your solution here
        if(T.l == null && T.r == null) return 0;
        return  Math.max(getHightOfTree(T.l, 0),  getHightOfTree(T.r, 0));
    }

    private int getHightOfTree(Tree l, Integer temp) {
        if(l == null){
            return temp;
        } else {
            temp = Math.max(getHightOfTree(l.l, temp + 1), getHightOfTree(l.r, temp + 1));
        }
        return temp;
    }
}
