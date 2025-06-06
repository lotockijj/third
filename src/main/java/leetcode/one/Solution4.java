package leetcode.one;

public class Solution4 {
    public static void main(String[] args) {
        function(new int[]{1,3}, new int[]{2});
        function(new int[]{1,2}, new int[]{3,4});
        function(new int[]{0, 0}, new int[]{0, 0});
        function(new int[]{}, new int[]{1});
    }

    private static void function(int[] num1, int[] num2) {
        double sum = 0;
        for (int i = 0; i < num1.length; i++) {
            sum += num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            sum += num2[i];
        }
        System.out.printf("%.4f",sum/(num1.length + num2.length));
        System.out.println();
    }
}

/*
4. Median of Two Sorted Arrays
Hard
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:
Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:
Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:
Input: nums1 = [2], nums2 = []
Output: 2.00000
 */
