package leetcode.one;

public class Solution14 {

    public String getLongestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        StringBuilder result = new StringBuilder();
        boolean allMatch = false;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].length() > i && strs[0].charAt(i) == strs[j].charAt(i)){
                    allMatch = true;
                } else {
                    allMatch = false;
                    break;
                }
            }
            if(allMatch){
                result.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
/*
14. Longest Common Prefix
Easy1
Write a function to find the longest common prefix(!!!) string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
 */
