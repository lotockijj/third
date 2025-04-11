package leetcode;

public class Solution42 {

    //todo
    public static int getValueOfWater(int[] arr){
        int value = 0;
        int firstMaxValue = arr[0];
        int count = 0;
        int tempValue = 0;
        int secondMaxValue = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > firstMaxValue && firstMaxValue == 0){
                firstMaxValue = arr[i];
                count++;
            } else if(arr[i] < firstMaxValue){
                tempValue = firstMaxValue - arr[i];
            }
            if(secondMaxValue >= firstMaxValue){
                value = value + tempValue;
            }

        }
        return value;
    }
}

/*
Trapping Rain Water
Hard
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
To solve the "Trapping Rain Water" problem in Java with a Solution class, we can follow these steps:

Define a Solution class.
Define a method named trap that takes an array of integers height as input and returns the amount of water it can trap after raining.
Initialize two pointers left and right at the beginning and end of the array respectively.
Initialize two variables leftMax and rightMax to keep track of the maximum height of bars encountered from the left and right directions respectively.
Iterate through the array using the two pointers:
Update leftMax as the maximum of leftMax and height[left].
Update rightMax as the maximum of rightMax and height[right].
If height[left] < height[right], calculate the water trapped at the current position using leftMax and subtract the height of the current bar. Move left pointer to the right.
Otherwise, calculate the water trapped at the current position using rightMax and subtract the height of the current bar. Move right pointer to the left.
Continue this process until the two pointers meet.
Return the total amount of water trapped.

 */
