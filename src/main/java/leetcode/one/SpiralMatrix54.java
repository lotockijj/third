package leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int currentRow = 0;
        int currentColumn = 0;
        boolean moveRight = true;
        boolean moveDown = false;
        boolean moveLeft = false;
        boolean moveUp = false;
        int leftMaxIndex = 0;
        int downMaxIndex = 0;
        int rightMaxIndex = 0;
        int upMaxIndex = 0;
        for (int i = 0; i < matrix.length * matrix[0].length; i++) {
            if (moveRight) {
                result.add(matrix[currentRow][currentColumn]);
                currentColumn++;
                if (currentColumn == matrix[0].length - leftMaxIndex) {
                    currentColumn--;
                    moveRight = false;
                    moveDown = true;
                    currentRow++;
                    leftMaxIndex++;
                    upMaxIndex--;
                }
            } else {
                if (moveDown) {
                    result.add(matrix[currentRow][currentColumn]);
                    currentRow++;
                    if (currentRow == matrix.length - downMaxIndex) {
                        currentColumn--;
                        moveDown = false;
                        moveLeft = true;
                        currentRow--;
                    }
                } else if (moveLeft) {
                    result.add(matrix[currentRow][currentColumn]);
                    currentColumn--;
                    if (currentColumn - rightMaxIndex == -1) {
                        currentRow--;
                        moveLeft = false;
                        moveUp = true;
                        currentColumn++;
                        rightMaxIndex++;
                        downMaxIndex++;
                    }
                } else if (moveUp) {
                    result.add(matrix[currentRow][currentColumn]);
                    currentRow--;
                    if (currentRow + upMaxIndex == -1) {
                        moveUp = false;
                        moveRight = true;
                        currentRow++;
                        currentColumn++;
                    }
                }
            }
        }

        return result;
    }
}
