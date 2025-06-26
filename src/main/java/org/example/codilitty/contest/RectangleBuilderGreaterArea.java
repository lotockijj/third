package org.example.codilitty.contest;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RectangleBuilderGreaterArea {

    //todo 53% (76%/11% correctness/performance)
    public int solution(int[] A, int X) {
        // Implement your solution here
        int result = 0;
        int countOfSquares = 0;
        TreeMap<Integer, Integer> pens = new TreeMap<>();
        for (int i = 0; i < A.length; i++) {
            int pen = A[i];
            if (pens.containsKey(pen)) {
                int countOfPens = pens.get(pen) + 1;
                pens.put(pen, countOfPens);
                if (countOfPens == 4 && pen * pen >= X) {
                    countOfSquares++;
                }
            } else {
                pens.put(pen, 1);
            }
        }
        result = countResult(pens, X);
        if (result > 1_000_000_000) {
            return -1;
        }
        return result + countOfSquares;
    }

    private int countResult(TreeMap<Integer, Integer> pens, int X) {
        List<Integer> filteredPens = pens.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        //1,3,5,7    10
        int len = filteredPens.size() - 1;
        for (int i = 0; i < filteredPens.size(); i++) {
            int first = filteredPens.get(i);
            int last = filteredPens.get(len);
            if(first == last) break;
            if(first * last >= X){
               len--;
            }
        }
        return 0;
    }

    private int fibonacci(int number) {
        int result = 0;
        for (int i = 2; i < number; i++) {
            result += i;
        }
        return result;
    }

    private int getResult(Map<Integer, Integer> pens, int key, int X) {
        int result = 0; //1,2,5,1,1,2,3,5,1   # 5 vs 7
        int countDown = pens.size() - 1;
        for (Map.Entry<Integer, Integer> pen : pens.entrySet()) {
            if (pen.getKey() != key && pen.getKey() >= 2 && key * pen.getValue() >= X) {
                result = countDown;
                break;
            } else {
                countDown--;
            }
        }
        return result;
    }
}
