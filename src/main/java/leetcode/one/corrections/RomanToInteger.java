package leetcode.one.corrections;

import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> ROMAN_TO_INT_S = Map.of(
            'I', 1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D', 500,
            'M', 1000
    );
    public int romanToInt(String s) { //M CM XCIV 1994
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer value = ROMAN_TO_INT_S.get(c);
            if (nextCharIsGreater(s, i + 1, c)) {
                result += ROMAN_TO_INT_S.get(s.charAt(i + 1)) - ROMAN_TO_INT_S.get(s.charAt(i));
                i++;
            } else{
                result += value;
            }
        }
        return result;
    }

    private boolean nextCharIsGreater(String s, int index, char c) {
        if(index < s.length()){
            return ROMAN_TO_INT_S.get(s.charAt(index)) > ROMAN_TO_INT_S.get(c);
        }
        return false;
    }
}
