package leetcode;

import java.util.Arrays;

public class Solution34 {

    public static int[] findFirstLastPositionOfElement(int[] arr, int target){
        int[] result = initializeArrayValuesToMinusOne(2);
        int first = 0;
        int last = arr.length - 1;
        while(first < last){
            int mid = first + (last - first)/2;
            if(arr[mid] < target){
                first = mid + 1;
            } else if(arr[mid] > target){
                last = mid - 1;
            } else if(arr[mid] == target){
                result[0] = mid;
                break;
            }
        }
        return result;
    }

    private static int[] initializeArrayValuesToMinusOne(int size) {
        int[] result = new int[size];
        Arrays.fill(result, -1);
        return result;
    }
}

/*
34. Find First and Last Position of Element in Sorted Array
Medium
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
To solve the "Find First and Last Position of Element in Sorted Array" problem in Java with a Solution class, we can follow these steps:
Define a Solution class.
Define a method named searchRange that takes an integer array nums and an integer target as input and returns an integer array representing the starting and ending positions of target in nums. If target is not found, return [-1, -1].
Implement binary search to find the first and last occurrences of target.
Set the left pointer left to 0 and the right pointer right to the length of nums minus 1.
Initialize two variables firstOccurrence and lastOccurrence to -1.
Perform two binary search operations:
First, find the first occurrence of target:
While left is less than or equal to right:
Calculate the middle index mid as (left + right) / 2.
If nums[mid] is equal to target, update firstOccurrence = mid and continue searching on the left half by updating right = mid - 1.
Otherwise, if target is less than nums[mid], update right = mid - 1.
Otherwise, update left = mid + 1.
Second, find the last occurrence of target:
Reset left to 0 and right to the length of nums minus 1.
While left is less than or equal to right:
Calculate the middle index mid as (left + right) / 2.
If nums[mid] is equal to target, update lastOccurrence = mid and continue searching on the right half by updating left = mid + 1.
Otherwise, if target is greater than nums[mid], update left = mid + 1.
Otherwise, update right = mid - 1.
Return the array [firstOccurrence, lastOccurrence].
 */
