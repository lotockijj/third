package leetcode;

public class Solution35 {

    public static int searchInsertPosition(int[] arr, int target){
        int lowest = 0;
        int highest = arr.length - 1;
        int mid = -1;
        if(arr[0] > target) return 0;
        if(arr[arr.length - 1] < target) return arr.length;
        while (lowest < highest){
            mid = lowest + (highest - lowest)/2;
            if(arr[mid] > target){
                highest = mid;
            } else if(arr[mid] < target){
                lowest = mid;
            }
            if(arr[mid] == target){
                break;
            }
            if(lowest == highest - 1){
                if(highest == arr.length - 1){
                    mid = highest + 1;
                    break;
                } else {
                    mid = highest;
                    break;
                }
            }
        }
        return mid;
    }
}
/*
35. Search Insert Position
Easy
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:
Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:
Input: nums = [1], target = 0
Output: 0
Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
To solve the "Search Insert Position" problem in Java with a Solution class, we can follow these steps:
Define a Solution class.
Define a method named searchInsert that takes an integer array nums and an integer target as input and returns an integer representing the index where target would be inserted in order.
Implement binary search to find the insertion position of target.
Set the left pointer left to 0 and the right pointer right to the length of nums minus 1.
While left is less than or equal to right:
Calculate the middle index mid as (left + right) / 2.
If nums[mid] is equal to target, return mid.
If target is less than nums[mid], update right = mid - 1.
If target is greater than nums[mid], update left = mid + 1.
If target is not found in nums, return the value of left, which represents the index where target would be inserted in order.
 */
