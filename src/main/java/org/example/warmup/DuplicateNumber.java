package org.example.warmup;

import java.util.Arrays;

public class DuplicateNumber {

    public int findDuplicate(int[] arr) {
        if (arr.length <= 1) {
            return -1;
        }

        // Phase 1: Find the intersection point of the two pointers
        int slow = arr[0];
        int fast = arr[arr[0]];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        // Phase 2: Find the entrance to the cycle (the duplicate)
        slow = 0;
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow; // or fast
    }

    /*Violates O(n) time complexity (BIGGEST ISSUE) – Arrays.sort(arr)
    Violates the "may not modify"*/
    public int findDuplicate2(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
