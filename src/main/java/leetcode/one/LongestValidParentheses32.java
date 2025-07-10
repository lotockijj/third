package leetcode.one;

import java.util.Map;
import java.util.Stack;

public class LongestValidParentheses32 {
    private final static Map<Character, Character> PARENTHESES_AS_MAP = Map.of(
            '(', ')',
            ')', '('
    );

    public int longestValidParentheses2(String s) {
        int result = 0;
        int startIndex = getStartOpenParenthesesIndex(s, 0);
        if (startIndex == -1) {
            return 0;
        }
        for (int i = startIndex; i < s.length(); i++) {
            int maxValid = getMaxValidParentheses(i, s);
            result = Math.max(result, maxValid);
        }
        return result;
    }

    private int getMaxValidParentheses(int i, String s) {
        int result = 0;
        Stack<Character> parentheses = new Stack<>();
        int startOpenParenthesesIndex = getStartOpenParenthesesIndex(s, i);
        int maxValue = 0;
        boolean wasLastParenthesesClosed = false;
        int openParenthesesCount = 0;
        int closedParenthesesCount = 0;
        for (int j = startOpenParenthesesIndex; j < s.length() && j >= 0; j++) {
            char c = s.charAt(j);
            if (!parentheses.isEmpty() && PARENTHESES_AS_MAP.get(c).equals(parentheses.peek())) {
                wasLastParenthesesClosed = parentheses.pop() == '(';
                maxValue++;
            } else {
                parentheses.push(c);
                maxValue++;
            }
            if (c == '(') {
                openParenthesesCount++;
            } else {
                closedParenthesesCount++;
            }
            if (closedParenthesesCount > openParenthesesCount) break;
            if (parentheses.isEmpty()
                    && wasLastParenthesesClosed
                    && openParenthesesCount == closedParenthesesCount) {
                result = Math.max(result, maxValue);
            }
        }
        return result;
    }

    private int getStartOpenParenthesesIndex(String s, int startIndex) {
        for (int i = startIndex; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public int longestValidParentheses(String s) {
        char[] sAsChar = s.toCharArray();
        int[] results = new int[sAsChar.length];
        int open = 0;
        int max = 0;
        for (int i = 0; i < sAsChar.length; i++) {
            if (sAsChar[i] == '(') open++;
            if (sAsChar[i] == ')' && open > 0) {
                // matches found
                results[i] = 2 + results[i - 1];
                // add matches from previous
                if (i - results[i] > 0)
                    results[i] += results[i - results[i]];
                open--;
            }
            if (results[i] > max) max = results[i];
        }
        return max;
    }
}
