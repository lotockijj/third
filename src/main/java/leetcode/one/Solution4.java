package leetcode.one;

public class Solution4 {
    public static void main(String[] args) {
        function(new int[]{1,3}, new int[]{2});
        function(new int[]{1,2}, new int[]{3,4});
        function(new int[]{0, 0}, new int[]{0, 0});
        function(new int[]{}, new int[]{1});
    }

    private static void function(int[] num1, int[] num2) {
        int[] addArrays = new int[num1.length + num2.length];
        int indexOfNum1 = 0;
        int indexOfNum2 = 0;
        for (int i = 0; i < addArrays.length; i++) {
            if(indexOfNum1 < num1.length && indexOfNum2 < num2.length){
                if(num1[indexOfNum1] > num2[indexOfNum2]){
                    addArrays[i] = num2[indexOfNum2];
                    indexOfNum2++;
                } else {
                    addArrays[i] = num1[indexOfNum1];
                    indexOfNum1++;
                }
            } else if(indexOfNum1 < num1.length){
                addArrays[i] = num1[indexOfNum1];
                indexOfNum1++;
            } else if(indexOfNum2 < num2.length){
                addArrays[i] = num2[indexOfNum2];
                indexOfNum2++;
            }
        }
        double result = 0;
        int mid = addArrays.length/2;
        if(addArrays.length == 0){
            result = 0.0;
        } else if (addArrays.length == 1){
            result = addArrays[0];
        } else if(mid %2 == 0){
            result = ((double) addArrays[mid - 1] + addArrays[mid])/2;
        } else {
            result = addArrays[mid];
        }
        System.out.printf("%.4f",result);
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
