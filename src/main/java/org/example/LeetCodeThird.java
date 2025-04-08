package org.example;

/*
 Hard: Merge k Sorted Lists
Problem: You are given an array of k linked lists, each sorted in ascending order. Merge all the lists into one sorted linked list and return it.
Example:
Input: [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]

 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCodeThird {

    public static void main(String[] args) {

        LinkedList<Integer> first = new LinkedList<>(List.of(1, 4, 5));
        LinkedList<Integer> second = new LinkedList<>(List.of(1, 3, 4));
        LinkedList<Integer> third = new LinkedList<>(List.of(2, 6));
        LinkedList[] linkedLists = new LinkedList[]{first, second, third};
        List<Integer> collect = Arrays.stream(linkedLists)
                .flatMap(e -> e.stream())
                .sorted()
                .toList();
        collect.forEach(System.out::print);

    }
}
