package leetcode.one;

import java.util.*;

//https://github.com/javadev/LeetCode-in-Java/blob/main/src/main/java/g0001_0100/s0002_add_two_numbers/readme.md

public class Solution1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(9, 9, 9, 9, 9, 9, 9));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(9, 9, 9, 9));
        printSolution(l1, l2);
        printSolution2(l1, l2);
        LinkedList<Integer> l4 = new LinkedList<>(Arrays.asList(2, 4, 3));
        LinkedList<Integer> l5 = new LinkedList<>(Arrays.asList(5, 6, 4));
        printSolution(l4, l5);
        printSolution2(l4, l5);
    }

    private static void printSolution2(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int sum = 0;
        StringJoiner result = new StringJoiner(", ");
        int tempL1;
        int tempL2;
        while (!(l1.isEmpty() && l2.isEmpty())) {
            tempL1 = Optional.ofNullable(l1.pollFirst()).orElse(0);
            tempL2 = Optional.ofNullable(l2.pollFirst()).orElse(0);
            int tempSum = tempL1 + tempL2 + sum;
            if (tempSum >= 10) {
                result.add(String.valueOf(tempSum - 10));
                sum = 1;
            } else {
                result.add(String.valueOf(tempSum));
                sum = 0;
            }
        }
        if (sum == 1) {
            result.add(String.valueOf(1));
        }
        System.out.println(result);
    }

    private static void printSolution(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        List<Integer> l3 = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < l1.size(); i++) {
            int sum = getSum(l2, l1, i);
            temp = addNumber(l3, sum, temp);
        }
        if (temp == 1) {
            l3.add(temp);
        }
        System.out.println(l3);
    }

    private static int getSum(LinkedList<Integer> l1, LinkedList<Integer> l2, int i) {
        int sum = 0;
        if (l1.size() > i && l2.size() > i) {
            sum = l1.get(i) + l2.get(i);
        }
        if (l1.size() > i && l2.size() <= i) {
            sum = l1.get(i);
        }
        if (l1.size() <= i && l2.size() > i) {
            sum = l2.get(i);
        }
        return sum;
    }

    private static int addNumber(List<Integer> l3, int sum, int temp) {
        int result = 0;
        if (sum + temp < 10) {
            l3.add(sum + temp);
        } else {
            l3.add((sum + temp) % 10);
            result = 1;
        }
        return result;
    }

}
