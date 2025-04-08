package org.example;

import java.util.Arrays;

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]  // Because nums[0] + nums[1] = 2 + 7 = 9

 */
public class LeetCodeOne {

    public static void main(String[] args){
        Arrays.stream(function(new int[]{2,7,11,15}, 9)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(function(new int[]{2, 7, 11, 15, -5}, 10)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(function(new int[]{1, 2, 7, 10, 25}, 17)).forEach(System.out::print);
    }

    private static int[] function(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
