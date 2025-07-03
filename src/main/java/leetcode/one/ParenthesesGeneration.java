package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
public class ParenthesesGeneration {
    private static final Set<Character> OPEN_PARENTHESES = Set.of('(');
    private static final Map<Character, Character> RELATIVE_PARENTHESES = Map.of(
            '(', ')',
            ')', '('
    );

    public List<String> generateParenthesis(int n) {
        List<String> uniqueResults = new ArrayList<>();
        String[] parenthesis = new String[n * 2];
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                parenthesis[i] = "(";
            } else {
                parenthesis[i] = ")";
            }
        }
        for (int i = 0; i < parenthesis.length; i++) {
            generateParenthesisFromParantheses(parenthesis, uniqueResults);
        }
        return uniqueResults.stream().filter(this::isValid).toList();
    }

    private void generateParenthesisFromParantheses(String[] letters, List<String> combinations) {
        if(combinations.isEmpty()){
            combinations.addAll(Arrays.asList(letters));
        } else {
            Set<String> additions = new HashSet<>();
            for (int i = 0; i < letters.length; i++) {
                for (int j = 0; j < combinations.size(); j++) {
                    additions.add(combinations.get(j) + letters[i]);
                }
            }
            combinations.clear();
            combinations.addAll(additions);
        }
    }

    private boolean isValid(String s) {
        if (OPEN_PARENTHESES.contains(s.charAt(s.length() - 1))) {
            return false;
        }
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char par = s.charAt(i);
            Character peek = parentheses.isEmpty() ? null : parentheses.peek();
            if (peek != null &&
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
