package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

    //Time Limit Exceeded
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSums = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (
                            i != j &&
                            i != k &&
                            j != k &&
                            nums[i] + nums[j] + nums[k] == 0
                    ) {
                        if (isNonPresentYet(threeSums, nums[i], nums[j], nums[k])) {
                            threeSums.add(List.of(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
        }
        return threeSums;
    }

    private boolean isNonPresentYet(List<List<Integer>> threeSums, int num, int num1, int num2) {
        for (int i = 0; i < threeSums.size(); i++) {
            List<Integer> integers = threeSums.get(i);
            if (integers.get(0) == (num) &&
                    integers.get(1) == num1 &&
                    integers.get(2) == num2) {
                return false;
            }
        }
        return true;
    }


}
