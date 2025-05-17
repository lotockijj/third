package org.example.codility.stacks.and.queues;

import java.util.Map;

public class Brackets2 {
    private static final Map<Character, Character> brackets = Map.of(
            '(', ')',
            '[', ']',
            '{', '}');

    public static boolean isBalanced(String input){
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
        System.out.println(isBalanced("({[]})"));
        System.out.println(isBalanced("([)]"));
    }
}
