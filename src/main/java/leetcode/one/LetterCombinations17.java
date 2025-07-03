package leetcode.one;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LetterCombinations17 {
    private static final Map<String, List<String>> PHONE_NUM_LETTER = Map.of(
            "2", List.of("a", "b", "c"),
            "3", List.of("d", "e", "f"),
            "4", List.of("g", "h", "i"),
            "5", List.of("j", "k", "l"),
            "6", List.of("m", "n", "o"),
            "7", List.of("p", "q", "r", "s"),
            "8", List.of("t", "u", "v"),
            "9", List.of("w", "x", "y", "z")
    );

    //"23" "ad","ae","af","bd","be","bf","cd","ce","cf"
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        String[] split = digits.split("");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            processString(combinations, PHONE_NUM_LETTER.get(s));
        }
        return combinations;
    }

    private void processString(List<String> combinations, List<String> letters) {
        if (combinations.isEmpty()) {
            if (letters != null) {
                combinations.addAll(letters);
            }
        } else {
            Set<String> additions = new HashSet<>();
            for (int i = 0; i < letters.size(); i++) { // a,b,c and d,e,f
                for (int j = 0; j < combinations.size(); j++) {
                    additions.add(combinations.get(j) + letters.get(i));
                }
            }
            combinations.clear();
            combinations.addAll(additions);
        }
    }
}
