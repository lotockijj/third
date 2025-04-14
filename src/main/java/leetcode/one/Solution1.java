package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://github.com/javadev/LeetCode-in-Java/blob/main/src/main/java/g0001_0100/s0002_add_two_numbers/readme.md

public class Solution1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(9,9,9,9));
        printSolution(l1, l2);
        LinkedList<Integer> l4 = new LinkedList<>(Arrays.asList(2,4,3));
        LinkedList<Integer> l5 = new LinkedList<>(Arrays.asList(5,6,4));
        printSolution(l4, l5);
    }

    private static void printSolution(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        List<Integer> l3 = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < l1.size(); i++) {
            int sum = getSum(l2, l1, i);
            temp = addNumber(l3, sum, temp);
        }
        if(temp == 1) {
            l3.add(temp);
        }
        System.out.println(l3);
    }

    private static int getSum(LinkedList<Integer> l1, LinkedList<Integer> l2, int i) {
        int sum = 0;
        if(l1.size() > i && l2.size() > i){
            sum = l1.get(i) + l2.get(i);
        }
        if(l1.size() > i && l2.size() <= i){
            sum = l1.get(i);
        }
        if(l1.size() <= i && l2.size() > i){
            sum = l2.get(i);
        }
        return sum;
    }

    private static int addNumber(List<Integer> l3, int sum, int temp) {
        int result = 0;
        if(sum + temp < 10){
            l3.add(sum + temp);
        } else {
            l3.add((sum + temp)%10);
            result = 1;
        }
        return result;
    }

}
