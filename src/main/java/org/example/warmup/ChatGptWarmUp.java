package org.example.warmup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ChatGptWarmUp {

    public String findFirstNotRepeatedCharacters(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey().toString();
            }
        }
        return null;
    }

    //["eat","tea","tan","ate","nat","bat"] -> [[eat,tea,ate],[tan,nat],[bat]]
    public List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            putOrPlace(s, result);
        }
        return result;
    }

    private void putOrPlace(String s, List<List<String>> result) {
        if (result.isEmpty()) {
            putOrCreateNewList(s, result);
        } else {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<String> strings = result.get(i);
                String str = result.get(i).stream().findFirst().get();
                if (containsSameChars(s, str)) {
                    strings.add(s);
                    return;
                }
            }
            putOrCreateNewList(s, result);
        }
    }

    private static void putOrCreateNewList(String s, List<List<String>> result) {
        List<String> list = new ArrayList<>();
        list.add(s);
        result.add(list);
    }

    private boolean containsSameChars(String str, String s) {
        if (str.length() != s.length() || str.equals(s)) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!set.add(str.charAt(i))) {
                set.remove(str.charAt(i));
            }
            if (!set.add(s.charAt(i))) {
                set.remove(s.charAt(i));
            }
        }
        return set.isEmpty();
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[1] = i;
                result[0] = map.get(nums[i]);
            }
            map.put(target - nums[i], i);
        }
        return result;
    }

    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
}
