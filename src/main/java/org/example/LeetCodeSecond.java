package org.example;

/*
Problem: Given a string s, find the length of the longest substring without repeating characters.
Example:
Input: "abcabcbb"
Output: 3  // The longest substring is "abc"
 */

public class LeetCodeSecond {
    public static void main(String[] args) {
        System.out.println(function("abcabcbbfgqlmklspwvijroe"));
    }

    private static int function(String str) {
        StringBuilder res = new StringBuilder();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if(!res.toString().contains(String.valueOf(str.charAt(i)))){
                res.append(str.charAt(i));
            } else {
                result = Math.max(result, res.length());
                res = new StringBuilder();
            }
        }
        result = Math.max(result, res.length());
        res = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if(!res.toString().contains(String.valueOf(str.charAt(i)))){
                res.append(str.charAt(i));
            } else {
                result = Math.max(result, res.length());
                res = new StringBuilder();
            }
        }
        result = Math.max(result, res.length());
        return result;
    }
}
