package leetcode.asked;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class FirstUnique {
    private Map<Integer, Integer> count = new HashMap<>();
    private Queue<Integer> queue = new LinkedList<>();

    public void add(int num) {
        count.put(num, count.getOrDefault(num, 0) + 1);

        if (count.get(num) == 1) {
            queue.offer(num);
        }

        while (!queue.isEmpty() && count.get(queue.peek()) > 1) {
            queue.poll();
        }
    }

    public Integer getFirstUnique() {
        return queue.isEmpty() ? null : queue.peek();
    }
}