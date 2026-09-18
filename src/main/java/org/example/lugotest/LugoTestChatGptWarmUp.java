package org.example.lugotest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class LugoTestChatGptWarmUp {

    public List<Integer> findDuplicates(int[] arr) {
        Set<Integer> temp = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (temp.contains(arr[i]) && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
            } else {
                temp.add(arr[i]);
            }
        }
        return duplicates;
    }

    public int[] getTwoSum(int[] arr, int target) {
        Map<Integer, Integer> tempRes = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (tempRes.containsKey(target - arr[i])) {
                return new int[]{i, tempRes.get(target - arr[i])};
            } else {
                tempRes.put(arr[i], i);
            }
        }
        return null;
    }

    public int getMaximumNumberOfNonOverlappingIntervals(int[][] arr) {
        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr, Comparator.comparing(a -> a[1]));
        int last = arr[0][1];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (last <= arr[i][0]) {
                last = arr[i][1];
                count++;
            }
        }
        return count;
    }

    public int[][] mergeOverlappingIntervals(int[][] arr) {
        if (arr.length == 0) {
            return new int[][]{};
        }
        Arrays.sort(arr, Comparator.comparing(a -> a[1]));
        List<int[]> tempResult = new ArrayList<>();
        tempResult.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int[] last = tempResult.get(tempResult.size() - 1);
            int[] current = arr[i];
            if (last[1] <= current[1]) {
                if (last[1] >= current[0]) {
                    last[1] = current[1];
                    if (last[0] > current[0]) {
                        last[0] = current[0];
                    }
                } else {
                    tempResult.add(current);
                }
            }
        }
        return tempResult.toArray(new int[tempResult.size()][]);
    }

    public char getFirstNonRepeatingChar(String input) {
        Map<Character, Integer> tempRes = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            tempRes.merge(input.charAt(i), 1, Integer::sum);
        }
        return tempRes.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseGet(() -> '0');
    }

    public boolean isValidParentheses(String input) {
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '{' || current == '[' || current == '(') {
                parentheses.add(current);
            } else {
                if (
                        (current == ')' && parentheses.peek() != '(') ||
                                (current == ']' && parentheses.peek() != '[') ||
                                (current == '}' && parentheses.peek() != '{')) {
                    return false;
                }
                parentheses.pop();
            }
        }
        return parentheses.isEmpty();
    }

    public int[] findIntersection(int[] arr1, int[] arr2){
        if(arr1.length == 0 || arr2.length == 0){
            return  new int[]{};
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Set<Integer> result = new HashSet<>();
        int index1 = 0;
        int index2 = 0;
        while(index1 != arr1.length && index2 != arr2.length){
            if(arr1[index1] < arr2[index2]){
                index1++;
            } else if(arr2[index2] < arr1[index1]){
                index2++;
            } else if(arr1[index1] == arr2[index2]){
                result.add(arr1[index1]);
                index1++;
                index2++;
            }
        }
        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

}
