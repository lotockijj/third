package org.example.codility.stacks.and.queues;

import java.util.Stack;

public class Backet {
    private static final char openBracket = '(';
    private static final char closeBracket = ')';
    private static final char openCurlyBracket = '{';
    private static final char closeCurlyBracket = '}';
    private static final char openSquareBracket = '[';
    private static final char closeSquareBracket = ']';

    public int solution(String S){
        // Implement your solution here
        Stack<Character> results = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if(results.isEmpty()){
                results.push(currentChar);
            } else {
                if(currentChar == closeBracket && results.peek() == openBracket){
                    results.pop();
                } else if(currentChar == closeCurlyBracket && results.peek() == openCurlyBracket){
                    results.pop();
                } else if(currentChar == closeSquareBracket && results.peek() == openSquareBracket){
                    results.pop();
                } else {
                    results.push(currentChar);
                }
            }
        }
        return results.isEmpty() ? 1 : 0;
    }
}
