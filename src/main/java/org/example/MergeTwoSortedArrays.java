package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MergeTwoSortedArrays {

    public static int[] mergeArrays(int[] firstArr, int[] secondArr) {
        int[] result = new int[firstArr.length + secondArr.length];
        int indexOfFirstArray = 0;
        int indexOfSecondArray = 0;
        for (int i = 0; i < result.length; i++) {
            if (indexOfFirstArray == firstArr.length) {
                fillToTheEnd(result, secondArr, i, indexOfSecondArray);
                break;
            } else if (indexOfSecondArray == secondArr.length) {
                fillToTheEnd(result, firstArr, i, indexOfSecondArray);
                break;
            } else if (firstArr[indexOfFirstArray] < secondArr[indexOfSecondArray]) {
                result[i] = firstArr[indexOfFirstArray++];
            } else {
                result[i] = secondArr[indexOfSecondArray++];
            }
        }
        return result;
    }

    private static void fillToTheEnd(int[] result, int[] secondArr, int j, int indexOfSecondArray) {
        for (int i = indexOfSecondArray; i < secondArr.length; i++) {
            result[j++] = secondArr[i];
        }
    }

    // one more task Given two arrays, find common elements (optimize for time).
    public static Set<Integer> findCommonArrays(int[] firstArr, int[] secondArr) {
        Map<Integer, Boolean> countCommons = new HashMap<>();
        for (int i = 0; i < firstArr.length; i++) {
            countCommons.put(firstArr[i], false);
        }

        for (int i = 0; i < secondArr.length; i++) {
            int n = secondArr[i];
            if (countCommons.containsKey(n)) {
                countCommons.put(n, true);
            }
        }
        return countCommons
                .entrySet()
                .stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
