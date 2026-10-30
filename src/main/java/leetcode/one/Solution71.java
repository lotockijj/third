package leetcode.one;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Solution71 {

    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        for (String t : path.split("/")) {
            if (t.isEmpty() || t.equals(".")) {
                continue;
            }
            if (t.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(t);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = stack.descendingIterator();
        while (it.hasNext()) {
            sb.append('/').append(it.next());
        }
        return sb.toString();
    }
}
