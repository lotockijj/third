package leetcode.one;

public class Solution65 {

    public boolean isNumber(String s) {
        int numberOfSigns = 0;
        int previousChar = '0';
        int moreThanOneDot = 0;
        boolean isExpEncountered = false;
        boolean anyNumbersPresent = false;
        int indexOfSign = 0;
        boolean numberAfterExp = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c) && c != 'E' && c != 'e') {
                return false;
            } else if (Character.isDigit(c)) {
                anyNumbersPresent = true;
                if (isExpEncountered && !numberAfterExp) {
                    numberAfterExp = true;
                }
            } else if (c == '-' || c == '+') {
                if (numberAfterExp) {
                    return false;
                }
                numberOfSigns++;
                if (numberOfSigns > 1 && (previousChar != 'e' && previousChar != 'E')) {
                    return false;
                }
            } else if (c == '.') {
                moreThanOneDot++;
                if (moreThanOneDot > 1) {
                    return false;
                }
            } else if (i == 0 && (c == 'e' || c == 'E')) {
                return false;
            } else if (i == s.length() - 1 && (c == 'e' || c == 'E')) {
                return false;
            }
            if (isExpEncountered && c == '.') {
                return false;
            } else if (c == 'e' || c == 'E') {
                if (isExpEncountered) {
                    return false;
                }
                isExpEncountered = true;
            } else if (anyNumbersPresent &&
                    numberOfSigns >= 1 &&
                    !isExpEncountered &&
                    Character.isDigit(c) && indexOfSign > 0) {
                return false;
            } else if (c == '-' || c == '+') {
                indexOfSign = i;
                if (i == s.length() - 1) {
                    return false;
                }
            } else if ((previousChar == '+' || previousChar == '-') && c == '.' && anyNumbersPresent) {
                return false;
            }
            if ((previousChar == '-' || previousChar == '+') && c == 'e') {
                return false;
            }
            previousChar = c;
            if (isExpEncountered && !anyNumbersPresent) {
                return false;
            }
        }
        return anyNumbersPresent;
    }
}
