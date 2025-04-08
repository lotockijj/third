package leetcode;

public class Solution3 {
    public static void main(String[] args) {
        String example = "abcabcbb";
        String example2 = "bbbbb";
        String example3 = "pwwkew";
        function(example);
        function(example2);
        function(example3);
    }

    private static void function(String example) {
        StringBuilder res = new StringBuilder();
        int result = 0;
        for (int i = 0; i < example.length(); i++) {
            if(!res.toString().contains(String.valueOf(example.charAt(i)))){
                res.append(example.charAt(i));
            } else {
                result = Math.max(result, res.length());
                res = new StringBuilder();
            }
        }
        result = Math.max(result, res.length());
        System.out.println(result);
    }
}
/*3. Longest Substring Without Repeating Characters

Medium

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"

Output: 3

Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"

Output: 1

Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"

Output: 3

Explanation: The answer is "wke", with the length of 3. Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:

Input: s = ""

Output: 0

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
To solve the Longest Substring Without Repeating Characters problem in Java using a Solution class, we'll follow these steps:

Define a Solution class with a method named lengthOfLongestSubstring.
Initialize variables to keep track of the starting index of the substring (start), the maximum length (maxLen), and a hashmap to store characters and their indices.
Iterate through the string s, and for each character:
Check if the character exists in the hashmap and its index is greater than or equal to the start index.
If found, update the start index to the index after the last occurrence of the character.
Update the maximum length if necessary.
Update the index of the current character in the hashmap.
Return the maximum length found.
Handle the edge case where the input string is empty.

 */
