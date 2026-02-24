package leetcode.one;

//43. Multiply Strings

import java.util.ArrayList;
import java.util.List;

public class Solution43 {

    public String multiply(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        List<StringBuilder> resultList = new ArrayList<>();
        int tensCount = 0;
        calculateMultiplicationRows(num1, num2, tensCount, resultList);

        for (int i = 0; i < resultList.size(); i++) {
            result = addToResult(result, resultList, i);
        }
        return result.toString();
    }

    private StringBuilder addToResult(StringBuilder result, List<StringBuilder> resultList, int i) {
        StringBuilder current = resultList.get(i);
        for (int j = 0; j < i; j++) {
            current.append('0');
        }
        return appendNext(current, result);
    }

    private StringBuilder appendNext(StringBuilder current, StringBuilder result) {
        StringBuilder temp = new StringBuilder();
        int tensCount = 0;
        int j = result.length() - 1;
        for (int i = current.length() - 1; i >= 0; i--) {
            int digit = current.charAt(i) - '0';
            int second = j >= 0 ? result.charAt(j) - '0' : 0;
            int tempTensCount = digit + second + tensCount;
            if (tempTensCount >= 10) {
                temp.insert(0, tempTensCount % 10);
                tensCount = tempTensCount / 10;
            } else {
                temp.insert(0, digit + second + tensCount);
                tensCount = 0;
            }
            j--;
        }
        if (tensCount > 0) {
            temp.insert(0, tensCount);
        }
        return temp;
    }

    private static void calculateMultiplicationRows(String num1, String num2, int tensCount, List<StringBuilder> resultList) {
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuilder tempResult = new StringBuilder();
            int num2Digit = num2.charAt(i) - '0';
            int tempTensCount = 0;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int num1Digit = num1.charAt(j) - '0';
                int temp = num1Digit * num2Digit + tempTensCount;
                if (temp >= 10) {
                    tempResult.insert(0, temp % 10);
                    tempTensCount = temp / 10;
                    tensCount = tempTensCount;
                } else {
                    tempResult.insert(0, num1Digit * num2Digit + tempTensCount);
                    tempTensCount = 0;
                    tensCount = 0;
                }
            }
            if (tempTensCount > 0) {
                tempResult.insert(0, tempTensCount);
                tensCount = 0;
            }
            resultList.add(tempResult);
        }
        if (tensCount > 0) {
            resultList.add(new StringBuilder(String.valueOf(tensCount)));
        }
    }
}
