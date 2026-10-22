package org.example.tieto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Prep {

    public static char firstNotRepeatingChar(String str) {
        Map<Character, Integer> all = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            all.put(str.charAt(i), all.getOrDefault(str.charAt(i), 0) + 1);
        }
        char res = '0';
        for (Map.Entry<Character, Integer> entry : all.entrySet()) {
            if (entry.getValue() == 1) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }

    public static boolean isValidParentheses(String str) {
        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                temp.push(c);
            } else {
                if (temp.isEmpty()) {
                    return false;
                }
                Character peek = temp.peek();
                if ((c == '}' && peek == '{') ||
                        (c == ']' && peek == '[') ||
                        (c == ')' && peek == '(')) {
                    temp.pop();
                }
            }

        }
        return temp.isEmpty();
    }

    public static List<Integer> mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        int firstIndex = 0;
        int secondIndex = 0;
        while (!(firstIndex == arr1.length && secondIndex == arr2.length)) {
            if (firstIndex == arr1.length) {
                res.add(arr2[secondIndex]);
                secondIndex++;
            } else if (secondIndex == arr2.length) {
                res.add(arr1[firstIndex]);
                firstIndex++;
            } else if (arr1[firstIndex] > arr2[secondIndex]) {
                res.add(arr2[secondIndex]);
                secondIndex++;
            } else if (arr1[firstIndex] < arr2[secondIndex]) {
                res.add(arr1[firstIndex]);
                firstIndex++;
            } else {
                res.add(arr1[firstIndex]);
                firstIndex++;
                secondIndex++;
            }
        }
        return res;
    }

    public static String longestSubstringWithoutRepeatingChar(String str) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = sb.indexOf(String.valueOf(c));
            if (index != -1) {
                sb.delete(0, index + 1);
            }
            sb.append(c);
            if (sb.length() > result.length()) {
                result = sb.toString();
            }
        }
        return result;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            boolean notFound = true;
            if (anagrams.isEmpty()) {
                anagrams.put(str, new ArrayList<>(List.of(str)));
            } else {
                for (Map.Entry<String, List<String>> e : anagrams.entrySet()) {
                    String key = e.getKey();
                    if (areAnagrams(key, str)) {
                        e.getValue().add(str);
                        notFound = false;
                    }
                }
            }
            if(notFound){
                anagrams.put(str, new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(anagrams.values());
    }

    private static boolean areAnagrams(String key, String str) {
        if (key.length() != str.length()) {
            return false;
        }
        List<String> first = Arrays.stream(key.split("")).sorted().toList();
        List<String> second = Arrays.stream(str.split("")).sorted().toList();
        for (int i = 0; i < first.size(); i++) {
            if (!first.get(i).equals(second.get(i))) {
                return false;
            }
        }
        return true;
    }
}
