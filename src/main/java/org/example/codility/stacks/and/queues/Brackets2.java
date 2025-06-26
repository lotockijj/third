package org.example.codility.stacks.and.queues;

import java.util.Map;

public class Brackets2 {
    private static final Map<Character, Character> brackets = Map.of(
            '(', ')',
            '[', ']',
            '{', '}',
            ')', '(',
            ']', '[',
            '}', '{');

    public boolean isBalanced(String input){
        boolean result = true;
        for (int i = 0; i < input.length()/2; i++) {
            char bracketFromBeggining = input.charAt(i);
            char bracketFromEnding = input.charAt(input.length() - i - 1);
            if(!(brackets.get(bracketFromBeggining) == bracketFromEnding)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Brackets2 brackets2 = new Brackets2();
        System.out.println(brackets2.isBalanced("({[]})"));
        System.out.println(brackets2.isBalanced("([)]"));
    }
}
