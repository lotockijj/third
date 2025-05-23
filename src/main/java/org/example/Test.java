package org.example;

public class Test {

    public static void main(String[] args) {
        printFibonacci();
        findAndPrintFactorial(5);
        swapAndPrintNumbers(3, 11);
        int[] arr = {10, 4, 8, 5, 2, 1, 1};
        bubleSortAndPrint(arr);
    }

    private static void bubleSortAndPrint(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    private static void swapAndPrintNumbers(int a, int b) {
        System.out.println("a=" + a + ", b=" + b);
        a = 2 * a + b;
        b = (a - b) / 2;
        a = a - 2 * b;
        System.out.println("a=" + a + ", b=" + b);
    }

    private static void findAndPrintFactorial(int i) {
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result *= j;
        }
        System.out.println(result + "\n");
    }

    private static void printFibonacci() {
        int temp1 = 0;
        int temp2 = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(temp1 + temp2 + ", ");
            int temp = temp1;
            temp1 = temp2;
            temp2 = temp + temp2;
        }
        System.out.println();
    }
}
