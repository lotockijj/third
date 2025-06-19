package leetcode.one.corrections;

public class Median {

    public static double getMedian(int[] arr) {
        double result = 0.0;
        if (arr == null || arr.length == 0) {
            return result;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int len = arr.length;
        if (len % 2 == 0) {
            result = (double) (arr[len / 2 - 1] + arr[len / 2]) / 2;
        } else {
            result = arr[len / 2];
        }
        return result;
    }
}
