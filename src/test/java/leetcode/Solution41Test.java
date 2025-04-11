package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void findFirstMissingPositive() {
        assertEquals(3, Solution41.findFirstMissingPositive(new int[]{1,2,0}));
        assertEquals(2, Solution41.findFirstMissingPositive(new int[]{3,4,-1,1}));
        assertEquals(1, Solution41.findFirstMissingPositive(new int[]{7,8,9,11,12}));
    }
}
/*
41. First Missing Positive
Hard
Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
To solve the "First Missing Positive" problem in Java with a Solution class, we can follow these steps:
Define a Solution class.
Define a method named firstMissingPositive that takes an array of integers nums as input and returns the smallest missing positive integer.
Iterate through the array and mark the positive integers found by negating the value at the corresponding index.
Iterate through the modified array again and return the index of the first positive number (which is the smallest missing positive integer).
If no positive number is found, return nums.length + 1
 */