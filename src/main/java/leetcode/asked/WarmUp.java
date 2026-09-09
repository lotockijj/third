package leetcode.asked;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

public class WarmUp {

    public static String findFirstNotRepeatable(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Map<Character, Integer> results = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            results.put(str.charAt(i), results.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> c : results.entrySet()) {
            if (c.getValue() == 1) {
                return c.getKey().toString();
            }
        }
        return null;
    }

    public static int[] findNumbersThatSumTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr == null || arr.length == 0 || arr[start] > target) {
            return null;
        }
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum > target) {
                end -= 1;
            } else if (sum < target) {
                start += 1;
            } else {
                return new int[]{start, end};
            }
        }
        return null;
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return null;
    }

    public static boolean areParenthesesValid(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (Character c : str.toCharArray()) {
            if(c == '(' || c == '[' || c == '{'){
                deque.push(c);
            } else {
                if (deque.isEmpty()) return false;
                char top = deque.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return deque.isEmpty();
    }

    public static int[] removeDuplicates(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int tempIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[tempIndex]) {
                tempIndex++;
                arr[tempIndex] = arr[i];
            }
        }
        return Arrays.copyOf(arr, tempIndex + 1);
    }

    public static int fibonacci(int n) {
        int start = 0;
        int end = 1;
        for (int i = 1; i < n; i++) {
            int temp = end;
            end = start + end;
            start = temp;
        }
        return end;
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        ListIterator fwd = list.listIterator();
        ListIterator rev = list.listIterator(list.size());
        for (int i=0, mid=list.size()>>1; i<mid; i++) {
            Object tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }
        return list;
    }
}
