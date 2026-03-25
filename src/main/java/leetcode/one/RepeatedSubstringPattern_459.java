package leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class RepeatedSubstringPattern_459 {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() <= 1) {
            return false;
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return true;
        }
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (isRepeatedSubstringPattern(s, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isRepeatedSubstringPattern(String s, int i) {
        if(s.length() % i != 0) {
            return false;
        }
        List<String> substrings = new ArrayList<>();
        String substring = s.substring(0, i);
        for (int j = 0; j < s.length(); j = j + i) {
            String sub = s.substring(j, j + i);
            substrings.add(sub);
        }
        return substrings.stream().allMatch(substring::equals);
    }
}
