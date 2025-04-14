package leetcode.one;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(function7(321));
        System.out.println(function7(-321));
        System.out.println(function7(120));
        System.out.println(function7(0));
    }

    private static int function7(int number) {
        if(number == 0) return 0;
        String s = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();
        boolean isZero = true;
        if (s.charAt(0) == '-') {
            stringBuilder.append('-');
        }
        for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '0' && isZero) {
                    continue;
                } else if(s.charAt(i) != '-') {
                    stringBuilder.append(s.charAt(i));
                    isZero = false;
                }
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
/*
7. Reverse Integer

Medium
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21
Example 4:
Input: x = 0
Output: 0
Constraints:
-231 <= x <= 231 - 1
 */