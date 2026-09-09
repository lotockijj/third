package org.example.training;

public class Testick {

    public static int factorial(int n) {
        return getFactorial(n);
    }

    private static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
