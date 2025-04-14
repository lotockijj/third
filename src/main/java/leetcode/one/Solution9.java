package leetcode.one;

public class Solution9 {

    public boolean isPalindrome(int example) {
        String s = String.valueOf(example);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
