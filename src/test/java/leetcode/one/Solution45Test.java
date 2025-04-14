package leetcode.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {

    @Test
    void getJumpGameTwo() {
        assertEquals(2, Solution45.getJumpGameTwo(new int[]{2,3,1,1,4}));
        assertEquals(2, Solution45.getJumpGameTwo(new int[]{2,3,0,1,4}));
        assertEquals(4, Solution45.getJumpGameTwo(new int[]{2,3,0,5,6,0,0,2,1,7}));
    }
}
/*
45. Jump Game II
Medium
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Your goal is to reach the last index in the minimum number of jumps.
You can assume that you can always reach the last index.
Example 1:
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:
Input: nums = [2,3,0,1,4]
Output: 2
Constraints:
1 <= nums.length <= 104
0 <= nums[i] <= 1000
To solve the "Jump Game II" problem in Java with a Solution class, we can follow these steps:

Define a Solution class.
Define a method named jump that takes an array of non-negative integers nums as input and returns the minimum number of jumps required to reach the last index.
Initialize variables maxReach, steps, and end to keep track of the maximum reachable position, the number of steps taken, and the end position respectively. Initialize maxReach to 0 and end to 0.
Iterate through the array from index 0 to nums.length - 2:
Update maxReach as the maximum of maxReach and i + nums[i].
If the current index i equals end, update end to maxReach and increment steps.
Return steps.
 */