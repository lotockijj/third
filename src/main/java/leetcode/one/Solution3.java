package leetcode.one;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        int result = 0;
        int tempResult = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (deque.contains(current)) {
                removeAllUpToCurrent(deque, current);
            } else {
                deque.addFirst(current);
            }
            result = Math.max(result, deque.size());
        }
        return result;
    }

    private static void removeAllUpToCurrent(Deque<Character> deque, char current) {
        while (!deque.isEmpty()) {
            char last = deque.removeLast();
            if (last == current) {
                break;
            }
        }
        deque.addFirst(current);
    }
}
