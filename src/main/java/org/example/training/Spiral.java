package org.example.training;

public class Spiral {
    private static final int[][] MULTI_ARRAY_6 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
    };

    public static void printSpiral(int[][] arr) {
        int[][] res = new int[arr.length][arr[0].length];
        boolean right = true;
        boolean left = false;
        boolean down = false;
        boolean up = false;
        boolean nextRound = true;
        int startRight = 0;
        int startDown = 0;
        int count = 0;
//        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    res[startDown][startRight] = arr[i][j];
                    if (!down && startRight == arr[0].length - 1 - count) {
                        right = false;
                        down = true;
                        nextRound = true;
                    }
                    if (right) {
                        startRight++;
                    }
                    if (down) {
                        startDown++;
                    }
                    if (startDown > arr.length - 1 - count) {
                        down = false;
                        startDown--;
                        left = true;
                    }
                    if (left) {
                        startRight--;
                        if (startRight < count) {
                            startRight = count;
                            up = true;
                            left = false;
                        }
                    }
                    if (up) {
                        startDown--;
                        if (nextRound) {
                            count++;
                            nextRound = false;
                        }
                        if (startDown < count) {
                            up = false;
                            right = true;
                            startRight++;
                            startDown++;
                        }
                    }
                }
            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Fuck");
//        }
        printMultiArray(res);
        copyMyArray(res, arr);
        System.out.println();
        printMultiArray(arr);
    }

    private static void copyMyArray(int[][] res, int[][] arr) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                arr[i][j] = res[i][j];
            }
        }
    }

    public static void main(String[] args) {
        printSpiral(MULTI_ARRAY_6);
    }

    private static void printMultiArray(int[][] res) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static final int[][] MULTI_ARRAY_3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    private static final int[][] MULTI_ARRAY_4 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    private static final int[][] MULTI_ARRAY_5 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
    };
}
