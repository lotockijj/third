package leetcode.asked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChatGpt {

    public static int[] result(int[] arr, int k){
        int[] result = new int[2];
        int first = 0;
        int second = arr.length - 1;
        while (first <= second){
            if(arr[first] + arr[second] > k){
                second--;
            } else if(arr[first] + arr[second] < k){
                first++;
            } else  if(arr[first] + arr[second] == k){
                result[0] = first;
                result[1] = second;
                break;
            }
        }
        return result;
    }

    public static int getLongestSubstring(String str){ //WithoutRepeatingCharacters
        StringBuilder result = new StringBuilder();
        Set<Character> map = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if(map.contains(key)){
                result.deleteCharAt(0);
                result.append(str.charAt(i));
            } else {
                map.add(key);
                result.append(str.charAt(i));
            }
        }
        return result.length();
    }

    public static List<int[]> mergeOverlappingIntervals(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int second = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= second){
                second = intervals[i][1];
            } else {
                start = intervals[i][0];
                second = intervals[i][1];
            }
            int[] temp = {start, second};
            result.add(temp);
        }
        return result;
    }

    public static int getFirstMissing(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i + 1 != arr[i]){
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}
