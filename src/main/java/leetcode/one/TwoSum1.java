package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> numsWithIndexes = getNumsWithIndexes(nums);
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int[] result = new int[2];
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                result[0] = nums[i];
                result[1] = nums[j];
                break;
            }
        }
        if (result[0] == result[1]) {
            List<Integer> list = numsWithIndexes.entrySet()
                    .stream()
                    .filter(e -> e.getKey() == result[0])
                    .findFirst().map(Map.Entry::getValue)
                    .get();
            result[0] = list.get(0);
            result[1] = list.get(1);
        } else {
            result[0] = numsWithIndexes.entrySet().stream()
                    .filter(e -> e.getKey() == result[0])
                    .map(Map.Entry::getValue).findFirst().stream().findFirst()
                    .map(e -> e.get(0))
                    .get();
            result[1] = numsWithIndexes.entrySet().stream()
                    .filter(e -> e.getKey() == result[1])
                    .map(Map.Entry::getValue).findFirst().stream().findFirst()
                    .map(e -> e.get(0))
                    .get();
        }
        return result;
    }

    private Map<Integer, List<Integer>> getNumsWithIndexes(int[] nums) {
        Map<Integer, List<Integer>> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(nums[i])) {
                List<Integer> values = res.get(nums[i]);
                values.add(i);
            } else {
                List<Integer> values = new ArrayList<>();
                values.add(i);
                res.put(nums[i], values);
            }
        }
        return res;
    }
}
