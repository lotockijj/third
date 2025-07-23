package org.example.warmup;

public class CartesianProduct {

    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        int k = 3;
        int n = values.length;
        int[] indices = new int[k];

        while (true) {
            for (int i = 0; i < values.length; i++) { //print current combination
                System.out.print(values[indices[i]] + " ");
            }
            System.out.println();
            int pos = k - 1; //Increase the combination (like base-n counter)
            while (pos >= 0) {
                indices[pos]++;
                if (indices[pos] < n) {
                    break;
                } else {
                    indices[pos] = 0;
                    pos--;
                }
            }
            if (pos < 0) {
                break;
            }
        }
    }
}
