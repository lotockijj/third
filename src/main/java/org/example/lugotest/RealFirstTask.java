package org.example.lugotest;

/*
Given a 2D integer matrix, find a rectangular submatrix with the maximum sum and return that submatrix.
If multiple submatrices have the same maximum sum, choose one according to its position — likely smallest starting row first, then smallest starting column.
Example:
int[][] matrix = {
        {1, -2, -1, 4},
        {-8, 3, 4, 2},
        {3, 8, 10, -8},
        {-4, -1, 1, 7}
};
One maximum-sum rectangle is:
3  4
8 10
 */

public class RealFirstTask {

    public int[][] maxSumSubmatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int bestSum = Integer.MIN_VALUE;

        int bestTop = 0;
        int bestBottom = 0;
        int bestLeft = 0;
        int bestRight = 0;

        for (int top = 0; top < rows; top++) {
            int[] colSums = new int[cols];

            for (int bottom = top; bottom < rows; bottom++) {

                for (int col = 0; col < cols; col++) {
                    colSums[col] += matrix[bottom][col];
                }

                int currentSum = 0;
                int currentLeft = 0;

                for (int right = 0; right < cols; right++) {

                    if (currentSum < 0) {
                        currentSum = colSums[right];
                        currentLeft = right;
                    } else {
                        currentSum += colSums[right];
                    }

                    if (currentSum > bestSum ||
                            (currentSum == bestSum &&
                                    (top < bestTop ||
                                            (top == bestTop && currentLeft < bestLeft)))) {

                        bestSum = currentSum;
                        bestTop = top;
                        bestBottom = bottom;
                        bestLeft = currentLeft;
                        bestRight = right;
                    }
                }
            }
        }

        int[][] result = new int[bestBottom - bestTop + 1][bestRight - bestLeft + 1];

        for (int i = bestTop; i <= bestBottom; i++) {
            for (int j = bestLeft; j <= bestRight; j++) {
                result[i - bestTop][j - bestLeft] = matrix[i][j];
            }
        }

        return result;
    }
}
