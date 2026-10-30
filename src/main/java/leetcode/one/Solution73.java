package leetcode.one;

import java.util.HashSet;
import java.util.Set;

public class Solution73 {

    public void setZeroes(int[][] matrix) {
        Set<Integer> nullColumns = new HashSet<>();
        Set<Integer> nullRows = new HashSet<>();
        int len = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = len; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    nullRows.add(i);
                    nullColumns.add(j);
                }
            }
        }
        for (Integer i : nullColumns) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = 0;
            }
        }
        for (Integer j : nullRows) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[j][i] = 0;
            }
        }
    }
}
