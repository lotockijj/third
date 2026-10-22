package org.example.ciklum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class PrepHackerRank {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (temp.containsKey(arr[i])) {
                return new int[]{temp.get(arr[i]), i};
            } else {
                temp.put(target - arr[i], i);
            }
        }
        return null;
    }

    public static char firstNonRepeating(String str) {
        Map<Character, Integer> tempRes = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            tempRes.merge(c, 1, Integer::sum);
        }
        for (Map.Entry<Character, Integer> entry : tempRes.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '0';
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        List<String> f = Arrays.stream(str1.split("")).sorted().toList();
        List<String> s = Arrays.stream(str2.split("")).sorted().toList();
        for (int i = 0; i < f.size(); i++) {
            if (!f.get(i).equals(s.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static Map<Character, Integer> frequencyCount(String str) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            frequency.merge(str.charAt(i), 1, Integer::sum);
        }
        return frequency;
    }

    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (!duplicates.add(current)) {
                result.add(current);
            }
        }
        return result.stream().toList();
    }

    public static List<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int firstIndex = 0;
        int secondIndex = 0;
        while (!(firstIndex == arr1.length && secondIndex == arr2.length)) {
            if (firstIndex == arr1.length) {
                result.add(arr2[secondIndex]);
                secondIndex++;
            } else if (secondIndex == arr2.length) {
                result.add(arr1[firstIndex]);
                firstIndex++;
            } else if (arr1[firstIndex] < arr2[secondIndex]) {
                result.add(arr1[firstIndex]);
                firstIndex++;
            } else if (arr1[firstIndex] > arr2[secondIndex]) {
                result.add(arr2[secondIndex]);
                secondIndex++;
            } else if (arr1[firstIndex] == arr2[secondIndex]) {
                result.add(arr1[firstIndex]);
                firstIndex++;
                secondIndex++;
            }
        }
        return result;
    }

    public static boolean validParentheses(String s) {
        Stack<Character> result = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                result.push(c);
            } else {
                char last = result.peek();
                if ((c == '}' && last != '{') || (c == ']' && last != '[') || (c == ')' && last != '(')) {
                    return false;
                }
                result.pop();
            }
        }
        return result.isEmpty();
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length < 2) return nums.length;
        Arrays.sort(nums);
        int result = 0;
        int previous = nums[0];
        int tempRes = 1;
        for (int i = 1; i < nums.length; i++) {
            if (previous + 1 == nums[i]) {
                tempRes++;
            } else {
                result = Math.max(result, tempRes);
                tempRes = 1;
            }
            previous = nums[i];
        }
        result = Math.max(result, tempRes);
        return result;
    }

    public static int absoluteNumber(int[] arr, int k) {
        Set<Integer> temp = new HashSet<>();
        int result = 0;

        for (int num : arr) {
            if (temp.contains(num - k)) {
                result++;
            }

            if (temp.contains(num + k)) {
                result++;
            }

            temp.add(num);
        }

        return result;
    }

    public static String getSherlokAndArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int leftSum = 0;
        int rightSum = 0;
        while (left < right) {
            if (leftSum < rightSum) {
                leftSum = leftSum + arr[left];
                left++;
            } else if (leftSum > rightSum) {
                rightSum = rightSum + arr[right];
                right--;
            } else {
                leftSum = leftSum + arr[left];
                rightSum = rightSum + arr[right];
                if (left + right + 1 == arr.length && leftSum == rightSum) {
                    return "YES";
                }
                left++;
                right--;
            }
        }
        if (left + right == arr.length && leftSum == rightSum) {
            return "YES";
        }
        return "NO";
    }

    public static int minimumSwaps(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i + 1) {
                int correctPos = arr[i] - 1;
                int temp = arr[correctPos];
                arr[correctPos] = arr[i];
                arr[i] = temp;
                res++;
            }
        }
        return res;
    }

    /*
        There are n people standing in a queue, initially ordered:
        Each person can bribe the person directly in front of them to swap positions.
        Important rule: Each person can bribe at most 2 times.
        Given the final state of the queue, determine the minimum number of bribes that occurred.
        If anyone has bribed more than twice, return "Too chaotic".
    */
    public static String minimumBribes(int[] q) {
        int bribes = 0;

        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                return "Too chaotic";
            }

            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    bribes++;
                }
            }
        }

        return String.valueOf(bribes);
    }

    /*
        A string is considered valid if all characters appear the same number of times.
        You are allowed to remove at most one character occurrence to make the string valid.
        Return "YES" if it is possible, otherwise return "NO".
     */
    public static String sherlockAndValidString(String s) {
        Map<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            temp.merge(s.charAt(i), 1, Integer::sum);
        }
        Map<Integer, Integer> counts = new HashMap<>();
        for (Map.Entry<Character, Integer> e : temp.entrySet()) {
            Integer value = e.getValue();
            counts.merge(value, 1, Integer::sum);
        }
        if (counts.size() == 1) {
            return "YES";
        }

        if (counts.size() != 2) {
            return "NO";
        }
        List<Integer> values = new ArrayList<>(counts.keySet());
        Collections.sort(values);

        int low = values.get(0);
        int high = values.get(1);

        if (low == 1 && counts.get(low) == 1) {
            return "YES";
        }

        if (high == low + 1 && counts.get(high) == 1) {
            return "YES";
        }

        return "NO";
    }

    public static String checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < magazine.size(); i++) {
            wordCount.merge(magazine.get(i), 1, Integer::sum);
        }
        for (int i = 0; i < note.size(); i++) {
            int available = wordCount.getOrDefault(note.get(i), 0);
            if (available == 0) {
                return "NO";
            }
            wordCount.put(note.get(i), available - 1);
        }
        return "YES";
    }


    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long result = 0;
        long[] arr = new long[n];

        for (List<Integer> row : queries) {
            result = Math.max(result, addToArr(arr, row));
        }

        return result;
    }

    private static long addToArr(long[] arr, List<Integer> row) {
        int startIndex = row.get(0) - 1;
        int endIndex = row.get(1) - 1;
        int sumToAdd = row.get(2);

        long max = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            arr[i] += sumToAdd;
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static int countingValleys(String path) {
        int result = 0;
        int seaLevel = 0;
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'U') {
                seaLevel++;
                if (seaLevel == 0) {
                    result++;
                }
            } else {
                seaLevel--;
            }
        }
        return result;
    }
}
