package leetcode.one;

public class SpiralMatrix59 {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int row = 0;
        int column = 0;

        int upIndex = 0;
        int downIndex = n;
        int leftIndex = -2;
        int rightIndex = n;

        boolean right = true;
        boolean down = false;
        boolean left = false;
        boolean up = false;

        for (int i = 1; i < n * n + 1; i++) {
            result[row][column] = i;
            if (right) {
                column++;
                if (column == rightIndex) {
                    column--;
                    row++;
                    upIndex++;
                    right = false;
                    down = true;
                }
            } else if (down) {
                row++;
                if (row == downIndex) {
                    row--;
                    column--;
                    leftIndex++;
                    down = false;
                    left = true;
                }
            } else if (left) {
                column--;
                if (column == leftIndex) {
                    column++;
                    row--;
                    downIndex--;
                    left = false;
                    up = true;
                }
            } else if (up) {
                row--;
                if (row == upIndex - 1) {
                    row++;
                    column++;
                    rightIndex--;
                    up = false;
                    right = true;
                }
            }

        }
        return result;
    }
}
