package org.example.training;

public class SpiralNumber {

    public static void printSpiral(int rows, int columns) {
        int[][] res = new int[rows][columns];
        boolean right = true;
        boolean left = false;
        boolean down = false;
        boolean up = false;
        boolean nextRound = true;
        int startRight = 0;
        int startDown = 0;
        int count = 0;
        int count2 = 1;
       try {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                res[startDown][startRight] = count2++;
                if (!down && startRight == columns - 1 - count) {
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
                if (startDown > rows - 1 - count) {
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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuck");
        }
        printMultiArray(res);
    }

    private static void copyMyArray(int[][] res, int[][] arr) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                arr[i][j] = res[i][j];
            }
        }
    }

    public static void main(String[] args) {
        printSpiral(3, 5);
        System.out.println();
        printSpiral(2, 5);
        System.out.println();
        printSpiral(4, 7);
        System.out.println();
        printSpiral(5, 8);

    }

    private static void printMultiArray(int[][] res) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
