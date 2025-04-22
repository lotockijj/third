package org.example.codility.stacks.and.queues;

import java.util.Stack;

public class Nesting {

    public int solution(String S){
        if(S.isEmpty()) return 1;
        char openedBrace = '(';
        char closedBrace = ')';
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char current = S.charAt(i);
            if(characters.isEmpty()){
                characters.push(current);
            } else if(current == closedBrace && characters.peek() == openedBrace){
                characters.pop();
            } else {
                characters.push(current);
            }
        }
        return characters.isEmpty() ? 1 : 0;
    }
}
