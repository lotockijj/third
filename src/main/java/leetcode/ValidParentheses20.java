package leetcode;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses20 {
    private static final Set<Character> OPEN_PARENTHESES = Set.of('(', '{', '[');
    private static final Map<Character, Character> RELATIVE_PARENTHESES = Map.of(
            '(', ')',
            '[', ']',
            '{', '}',
            ')', '(',
            ']', '[',
            '}', '{'
    );

    public boolean isValid(String s) {
        if (OPEN_PARENTHESES.contains(s.charAt(s.length() - 1))) {
            return false;
        }
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char par = s.charAt(i);
            Character peek = parentheses.isEmpty() ? null : parentheses.peek();
            if(     peek != null &&
                    !OPEN_PARENTHESES.contains(peek) &&
                    OPEN_PARENTHESES.contains(RELATIVE_PARENTHESES.get(s.charAt(i - 1))) && //(}
                    s.charAt(i - 1) != RELATIVE_PARENTHESES.get(peek)
            ) {
                return false;
            }
            if (RELATIVE_PARENTHESES.get(par) == peek) {
                parentheses.pop();
            } else {
                parentheses.push(par);
            }
        }
        return parentheses.isEmpty();
    }
}
