package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum39 {

    //Wrong Answer: 113 / 160 testcases passed
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(candidates);
        int[] example = new int[getLenOfPossibleValues(candidates, target)];
        int endCount = 0;
        for (int i = 0; i < example.length; i++) {
            if (i < candidates.length) {
                example[i] = candidates[i];
            } else {
                example[i] = candidates[0];
            }
        }
        int len = example.length;
        int[] indices = new int[len];
        while (true) {
            List<Integer> possibleValues = new ArrayList<>();
            for (int i = example.length - 1; i >= 0; i--) {
                possibleValues.add(example[indices[i]]);
                int sum = possibleValues.stream().reduce(0, Integer::sum);
                if (sum == target) {
                    result.add(possibleValues.stream().sorted().toList());
                } else if (sum > target) {
                    break;
                }
            }
            int pos = len - 1;
            while (pos >= 0) {
                indices[pos]++;
                if (indices[pos] < len) {
                    break;
                } else {
                    indices[pos] = 0;
                    pos--;
                }
            }
            if (pos < 0 || endCount > 100000) {
                break;
            }
            endCount++;
        }
        return result.stream().toList();
    }

    private int getLenOfPossibleValues(int[] candidates, int target) {
        int count = 0;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                count++;
            } else {
                break;
            }
        }
        int maxValue = target / candidates[0];
        return Math.max(maxValue, count);
    }
}
