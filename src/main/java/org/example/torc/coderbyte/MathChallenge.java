package org.example.torc.coderbyte;

/*
www.torc.coderbyte.com https://www.codealike.com/pricing
Math Challenge
Have the function MathChallenge(num) take the input, which will be an integer ranging from 1 to 250, and return an integer output that will specify the least number of coins, that when added, equal the input integer. Coins are based on a system as follows: there are coins representing the integers 1,5,7,9,11. So for example: if num is 16, then the output should be 2 because you can achieve the number 16 with the coins 9 and 7. If num is 25, then the output should be 3, because you can achieve 25 with either 11,9 and 5 coins or with 9,9 and 7 coins.
Examples:
Input: 6
Output: 2
Input: 16,
Output: 2.
 */
public class MathChallenge {
    private static final int[] coins = {1, 5, 7, 9, 11};

    public static int mathChallenge(int number) {
        int result = 0;
        int sum = 0;
        int startIndex = coins.length - 1;
        while (sum != number) {
            if (sum + coins[startIndex] <= number) {
                sum = sum + coins[startIndex];
                result++;
            } else {
                startIndex--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Should be 2: " + mathChallenge(6));
        System.out.println("Should be 2: " + mathChallenge(16));
        System.out.println("Should be 0: " + mathChallenge(0));
    }
}
