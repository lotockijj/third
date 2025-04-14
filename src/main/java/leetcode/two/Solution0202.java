package leetcode.two;

import java.util.HashSet;
import java.util.Set;

public class Solution0202 {

    public static boolean isHappyNumber(int number){
        Set<Integer> tempResults = new HashSet<>();
        return checkForHappines(tempResults, number);
    }

    private static boolean checkForHappines(Set<Integer> tempResults, int number) {
        boolean result;
        String numberAsString = String.valueOf(number);
        int temp = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            int n = Character.getNumericValue(numberAsString.charAt(i));
            temp += n*n;
        }
        if(temp == 1){
            result = true;
        } else if(!tempResults.add(temp)){
            result = false;
        } else {
            result = checkForHappines(tempResults, temp);
        }
        return result;
    }
}
