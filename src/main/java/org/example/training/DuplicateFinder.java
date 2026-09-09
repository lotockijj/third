package org.example.training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFinder {

    public static List<Integer> findDuplicates(int[] arr) {
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
}
