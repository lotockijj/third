package leetcode.one;

import java.util.regex.Pattern;

public class RegularExpressionMatching {

    /*
    "aa", "a" false
    "aa", "a*" true
    "ab", ".*" true
    '.' Matches any single character .
    '*' Matches zero or more of the preceding element.
     */
    public boolean isMatch(String s, String p) {
        java.util.regex.Pattern pattern = Pattern.compile(p);
        return pattern.matcher(s).matches();
    }
}
