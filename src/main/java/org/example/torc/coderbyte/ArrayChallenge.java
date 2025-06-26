package org.example.torc.coderbyte;

/*
www.torc.coderbyte.com https://www.codealike.com/pricing
ArrayChallenge
Have the function ArrayChallenge(strArr) take the strArr parameter being passed
which will be an array of numbers and letters representing blackjack cards.
Number in the array will be written out.
So for example strArr may be ["two", "three", "ace", "king"].
The full list of possibilities for strArr is: two, three, four, five,
six, seven, eight, nine, ten, jack, queen, king, ace. Face cards such as jack, queen,
and king are worth 10.
Your program should output below, above, or blackjack signifying
if you have blackjack (numbers add up to 21) or not and the highest card in you hand
in relation to whether or not you have blackjack.
If the array contains an ace but you hand will go above 21,
you must count the ace as a 1. You must always try and stay below the 21 mark.
So using the array mentioned above, the output should be "below king".
The ace is counted as a 1 in this example because if it wasn't you would be above the 21 mark.

Another example would be if strArr was ["four", "ten", "king"], the output should be "above king".
If you have a tie between a ten and a face card in your hand, return the face card as the "highest card".
If you have multiple face cards, the order of importance is jack, queen, king.

Examples

Input: new String[]{"four", "ace", "ten"}
Output: below ten

Input: new String[]{"ace", "queen"}
Output: blackjack ace
 */

import java.util.HashMap;
import java.util.Map;

public class ArrayChallenge {
    private static final String[] cards = {"two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
    private static final Map<String, Integer> cardRanks = getCardsWithRanks(cards);

    public static String getArrayChallenge(String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        int acesCount = 0;
        for (int i = 0; i < strArr.length; i++) {
            String card = strArr[i];
            if ("ace".equals(card)) {
                acesCount++;
            }
            int value = cardRanks.get(card);
            sum += value;
        }
        if (sum > 21) {
            sum = sum - 10 * acesCount;
        }
        if (sum < 21) {
            stringBuilder.append("below ");
        } else {
            stringBuilder.append("blackjack ");
        }
        stringBuilder.append(getHighestCard(strArr, acesCount, sum));
        return stringBuilder.toString();
    }

    private static String getHighestCard(String[] strArr, int acesCount, int sum) {
        String highestCard = strArr[0];
        for (int i = 0; i < strArr.length; i++) {
            String tempCard = strArr[i];
            int tempIndex = getIndex(strArr, tempCard, acesCount, sum);
            int highestIndex = getIndex(strArr, highestCard, acesCount, sum);
            if (sum > 21 && acesCount > 0 && !tempCard.equals("ace")) {
                highestCard = tempIndex > highestIndex ? tempCard : highestCard;
            } else if (sum < 21 && acesCount > 0) {
                highestCard = tempIndex > highestIndex ? tempCard : highestCard;
            }
        }
        return highestCard;
    }

    private static int getIndex(String[] strArr, String tempCard, int acesCount, int sum) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(tempCard)) {
                if (getSumOfAllCards(strArr) > 21 && acesCount > 0 && cards[i].equals("ace")) {
                    return 1;
                }
                return i;
            }
        }
        return 0;
    }

    private static int getSumOfAllCards(String[] strArr) {
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            String card = strArr[i];
            int value = cardRanks.get(card);
            sum += value;
        }
        return sum;
    }


    public static void main(String[] args) {
        String[] strAcc = {"two", "three", "ace", "king"};
        String result = getArrayChallenge(strAcc);
        System.out.println("Result should equals to: \"below king\" = " + result);

        String[] strAcc2 = {"four", "ace", "ten"};
        result = getArrayChallenge(strAcc2);
        System.out.println("Result should equals to: \"below ten\" = " + result);

        String[] strAcc3 = {"ace", "queen"};
        result = getArrayChallenge(strAcc3);
        System.out.println("Result should equals to: \"blackjack ace\" = " + result);

    }

    private static Map<String, Integer> getCardsWithRanks(String[] cards) {
        Map<String, Integer> cardRanks = new HashMap<>();
        cardRanks.put("two", 2);
        cardRanks.put("three", 3);
        cardRanks.put("four", 4);
        cardRanks.put("five", 5);
        cardRanks.put("six", 6);
        cardRanks.put("seven", 7);
        cardRanks.put("eight", 8);
        cardRanks.put("nine", 9);
        cardRanks.put("ten", 10);
        cardRanks.put("jack", 10);
        cardRanks.put("queen", 10);
        cardRanks.put("king", 10);
        cardRanks.put("ace", 11);
        return cardRanks;
    }

}
