package leetcode.two;

import java.util.LinkedList;

public class Solution0206 {

    public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> numbers){
        LinkedList<Integer> reserved = new LinkedList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reserved.add(numbers.get(i));
        }
        return reserved;
    }
}
