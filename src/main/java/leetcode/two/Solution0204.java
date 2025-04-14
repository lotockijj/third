package leetcode.two;

public class Solution0204 {

    public static int countPrimes(int n){
        int count = n <= 3 ? 0 : 2;
        for (int i = 4; i < n; i++) {
            boolean isPrime = true;
            for (int j = i/2; j > 1; j--) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        return count;
    }
}
