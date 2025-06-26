package leetcode.one;

public class Solution4 {

    public static double function(int[] nums1, int[] nums2) {
        int[] addArrays = new int[nums1.length + nums2.length];
        int indexOfNum1 = 0;
        int indexOfNum2 = 0;
        for (int i = 0; i < addArrays.length; i++) {
            if (indexOfNum1 < nums1.length && indexOfNum2 < nums2.length) {
                if (nums1[indexOfNum1] > nums2[indexOfNum2]) {
                    addArrays[i] = nums2[indexOfNum2];
                    indexOfNum2++;
                } else {
                    addArrays[i] = nums1[indexOfNum1];
                    indexOfNum1++;
                }
            } else if (indexOfNum1 < nums1.length) {
                addArrays[i] = nums1[indexOfNum1];
                indexOfNum1++;
            } else if (indexOfNum2 < nums2.length) {
                addArrays[i] = nums2[indexOfNum2];
                indexOfNum2++;
            }
        }
        double result;
        int mid = addArrays.length / 2;
        if (addArrays.length == 0) {
            result = 0.0;
        } else if (addArrays.length == 1) {
            result = addArrays[0];
        } else if (addArrays.length % 2 == 0) {
            result = ((double) addArrays[mid - 1] + addArrays[mid]) / 2;
        } else {
            result = addArrays[mid];
        }
        return result;
//        System.out.printf("%.4f",result);
//        System.out.println();
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
