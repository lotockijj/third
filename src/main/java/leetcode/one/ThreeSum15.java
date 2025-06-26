package leetcode.one;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

public class ThreeSum15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> threeSums = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    threeSums.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(threeSums);
    }
}
