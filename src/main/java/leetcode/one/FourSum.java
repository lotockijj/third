package leetcode.one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return List.of();
        }
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int l = k + 1;
                    int len = nums.length;
                    while (l < len) {
                        long first = nums[i];
                        long second = nums[j];
                        long third = nums[k];
                        long fourth = nums[l];
                        long sum = first + second + third + fourth;
                        if (sum > target) {
                            len--;
                        } else if (sum < target) {
                            l++;
                        } else {
                            List<Integer> res = Stream.of(first, second, third, fourth).map(Long::intValue).toList();
                            if (!result.add(res)) {
                                break;
                            }
                            len--;
                            l++;
                        }
                    }
                }
            }
        }
        return result.stream().toList();
    }
}
