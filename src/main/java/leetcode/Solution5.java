package leetcode;

public class Solution5 {
    public static void main(String[] args) {
        String input = "babad";
        System.out.println(function5(input));
        System.out.println(function5("a"));
        System.out.println(function5("bb"));
        System.out.println(function5("aababaa"));

    }

    public static int function5(String input) {
        int res = 0;
        for (int i = 0; i < input.length(); i++) {
            int temp = 0;
            if(i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)){
                temp = findLongestPalindromicSubstring(input, i, i, 2);
            } else {
                temp = findLongestPalindromicSubstring(input, i, i, 1);
            }
            res = Math.max(res, temp);
        }
        return res - 2;
    }

    private static int findLongestPalindromicSubstring(String input, int i, int j, int res) {
        if(i < 0 || j > input.length() - 1){
            return res;
        } else {
            if(input.charAt(i) == input.charAt(j)){
                res += 2;
                i--;
                j++;
                return findLongestPalindromicSubstring(input, i, j, res);
            } else {
                return res;
            }
        }
    }
}

/*5. Longest Palindromic Substring

Medium

Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"

Output: "bab" Note: "aba" is also a valid answer.

Example 2:

Input: s = "cbbd"

Output: "bb"

Example 3:

Input: s = "a"

Output: "a"

Example 4:

Input: s = "ac"

Output: "a"

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
To solve the Longest Palindromic Substring problem in Java using a Solution class, we'll follow these steps:

Define a Solution class with a method named longestPalindrome.
Initialize variables to keep track of the start and end indices of the longest palindromic substring found so far (start and end).
Iterate through the string s:
For each character in the string, expand around it to check if it forms a palindrome.
Handle both odd-length and even-length palindromes separately.
Update start and end indices if a longer palindrome is found.
Return the substring from start to end.
Handle edge cases where the input string is empty or has a length of 1.

 */
