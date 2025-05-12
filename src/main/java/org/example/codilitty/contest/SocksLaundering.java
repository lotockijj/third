package org.example.codilitty.contest;

import java.util.HashMap;
import java.util.Map;

public class SocksLaundering {

    //todo 70% 
    public int solution(int K, int[] C, int[] D) {
        // Implement your solution here
        Map<Integer, Integer> cleanSocks = getSocksAsMap(C);
        Map<Integer, Integer> dirtySocks = getSocksAsMap(D);
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : cleanSocks.entrySet()) {
            Integer value = entry.getValue();
            if (value > 1) {
                result += value / 2;
                if (value % 2 != 0) {
                    if (K > 0 && dirtySocks.containsKey(entry.getKey()) && dirtySocks.get(entry.getKey()) > 0) {
                        result += 1;
                        dirtySocks.put(entry.getKey(), dirtySocks.get(entry.getKey()) - 1);
                        K--;
                    }
                }
            } else if (value == 1) {
                if (K > 0 && dirtySocks.containsKey(entry.getKey()) && dirtySocks.get(entry.getKey()) > 0) {
                    result += 1;
                    dirtySocks.put(entry.getKey(), dirtySocks.get(entry.getKey()) - 1);
                    K--;
                }
            }
        }
        if (K > 1) {
            for (Map.Entry<Integer, Integer> entry : dirtySocks.entrySet()) {
                Integer value = entry.getValue();
                if (value > 1) {
                    result++;
                    K -= 2;
                }
                if (K < 2) {
                    break;
                }
            }
        }
        return result;
    }

    private static Map<Integer, Integer> getSocksAsMap(int[] C) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int j : C) {
            if (result.containsKey(j)) {
                result.put(j, result.get(j) + 1);
            } else {
                result.put(j, 1);
            }
        }
        return result;
    }
}
