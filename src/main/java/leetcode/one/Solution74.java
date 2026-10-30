package leetcode.one;

public class Solution74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = findRow(matrix, target);
        return findColumn(matrix, target, row);
    }

    private int findRow(int[][] arr, int target) {
        int res = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid][0] <= target && arr[mid][arr[0].length - 1] >= target) {
                return mid;
            } else if (arr[mid][0] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    private boolean findColumn(int[][] arr, int target, int row) {
        int start = 0;
        int end = arr[row].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[row][mid] == target) {
                return true;
            } else if (arr[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
