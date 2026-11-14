package leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class Solution77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        int needed = k - current.size();
        int last = n - needed + 1;
        for (int i = start; i <= last; i++) {
            current.add(i);
            backtrack(i + 1, n, k, current, result);
            current.remove(current.size() - 1);
        }
    }


    public List<List<Integer>> combineWithRepetition(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackWithRepetition(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrackWithRepetition(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrackWithRepetition(i, n, k, current, result);
            current.remove(current.size() - 1);
        }
    }

}
