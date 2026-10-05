package leetcode.asked;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChatGptTest {

    @Test
    void result() {
        int[] arr = {2, 7, 11, 15};

        int[] result = ChatGpt.result(arr, 9);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void getLongestSubstring1() {
        String s = "abcabcbb";

        assertEquals(3, ChatGpt.getLongestSubstring(s));
    }

    @Test
    void getLongestSubstring2() {
        String s = "bbbbb";

        assertEquals(1, ChatGpt.getLongestSubstring(s));
    }

    @Test
    void mergeOverlappingIntervals() {
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        printResult(intervals1);

        int[][] intervals2 = {{1, 4}, {4, 5}};

        printResult(intervals2);
    }

    private static void printResult(int[][] intervals) {
        List<int[]> ints = ChatGpt.mergeOverlappingIntervals(intervals);

        for (int i = 0; i < ints.size(); i++) {
            int[] arr = ints.get(i);
            System.out.println(arr[0] + " " + arr[1]);
        }
        System.out.println();
    }

    @Test
    void getFirstMissing1() {
        int[] arr = {1, 3, 4};

        assertEquals(2, ChatGpt.getFirstMissing(arr));
    }

    @Test
    void getFirstMissing2() {
        int[] arr = {1, 2, 3, 4, 5, 7};

        assertEquals(6, ChatGpt.getFirstMissing(arr));
    }

    @Test
    void getFirstMissing3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        assertEquals(9, ChatGpt.getFirstMissing(arr));
    }
}