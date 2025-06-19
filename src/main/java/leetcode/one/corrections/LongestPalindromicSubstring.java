package leetcode.one.corrections;

public class LongestPalindromicSubstring {

    //142 testcases passed
    public String longestPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder tempResult = getPalindromeSubstringForIndex(s, i - 1, i + 1);
            StringBuilder tempResult2 = getPalindromeSubstringForIndex(s, i, i + 1);
            if(result.length() < tempResult.length()){
                result = tempResult;
            }
            if(result.length() < tempResult2.length()){
                result = tempResult2;
            }
        }
        return result.toString();
    }

    private StringBuilder getPalindromeSubstringForIndex(String s, int start, int end){
        StringBuilder tempResult = new StringBuilder();
        if(start + 1 != end && start + 1 >= 0 && start + 1 < s.length()) {
            tempResult.append(s.charAt(start + 1));
        }
        while(start >= 0 && end < s.length()){
            if(s.charAt(start) == s.charAt(end)){
                tempResult.insert(0, s.charAt(start)).append(s.charAt(end));
            } else {
                break;
            }
            start--;
            end++;
        }
        return tempResult;
    }
}
