package leetcode.asked;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateFinder {

    public List<Integer> findDuplicate(int[] nums) {
        Set<Integer> alreadySeen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(alreadySeen.contains(nums[i]) && !result.contains(nums[i])) {
                result.add(nums[i]);
            } else {
                alreadySeen.add(nums[i]);
            }
        }

        return result;
    }

    public char findFirstNonDuplicateChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return ' ';
    }
}
