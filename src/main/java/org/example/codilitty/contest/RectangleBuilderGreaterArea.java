package org.example.codilitty.contest;

import java.util.*;

public class RectangleBuilderGreaterArea {

    //53% (76%/11% correctness/performance)
    public int solution(int[] A, int X) {
        // Implement your solution here
        int result = 0;
        int countOfSquares = 0;
        Map<Integer, Integer> pens = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int pen = A[i];
            if (pens.containsKey(pen)) {
                pens.put(pen, pens.get(pen) + 1);
            } else {
                pens.put(pen, 1);
            }
        }
        for (Map.Entry<Integer, Integer> pen : pens.entrySet()) {
            Integer key = pen.getKey();
            Integer value = pen.getValue();
            if (value >= 4 && key * key >= X) {
                countOfSquares++;
            }
            if(pens.get(key) > 1) {
                result += getResult(pens, key, X);
            }
            if (result > 1_000_000_000) {
                return -1;
            }
        }
        return result/2 + countOfSquares;
    }

    private int getResult(Map<Integer, Integer> pens, int key, int X) {
        int result = 0;
        for (Map.Entry<Integer, Integer> pen : pens.entrySet()) {
            if (pen.getKey() != key && pen.getValue() >= 2) {
                if (key * pen.getKey() >= X) {
                    result++;
                }
            }
        }
        return result;
    }
}
