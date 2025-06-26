package leetcode.one;

//https://leetcode.com/problems/string-to-integer-atoi/description/
public class StringToInteger8 {

    //todo It needs to be refactored. It seems that a simpler solution exists.
    public int myAtoi(String s) {
        if(s.endsWith("++")){

        } else {
            if (s.contains("+-") || s.contains("-+") || (s.contains("++"))) return 0;
        }
        StringBuilder resultAsString = new StringBuilder();
        int result;
        boolean isWhiteSpaceAfterZero = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (' ' == c && resultAsString.isEmpty() ||
                    ("-".contentEquals(resultAsString) && '0' == c) ||
                    (resultAsString.isEmpty() && ('+' == c || c == '0'))) {
                if(isWhiteSpaceAfterZero && (' ' == c || '+' == c)) break;
                if('0' == c || '+' == c) isWhiteSpaceAfterZero = true;
            } else if ('-' == c && resultAsString.isEmpty()) {
                resultAsString.append('-');
                if (i >= 1 && s.charAt(i - 1) == '0') {
                    break;
                }
            } else if (Character.isDigit(c)) {
                resultAsString.append(c);
            } else {
                break;
            }
        }
        int maxValue = 2147483647;
        int minValue = -2147483648;
        if (("-".contentEquals(resultAsString) && resultAsString.length() == 1) || resultAsString.toString().isEmpty()) return 0;
        long resultAsLong = resultAsString.isEmpty() || resultAsString.length() > 11 ? 0 : Long.parseLong(resultAsString.toString());
        if((!s.contains(" ") || s.contains("-") && !resultAsString.isEmpty())){
            resultAsLong = resultAsString.length() > 12 ? 2147483647 : Long.parseLong(resultAsString.toString());
            if(resultAsString.length() > 11 && resultAsString.toString().contains("-")){
                resultAsLong = -2147483648;
            }
        }
        if (resultAsLong >= maxValue) {
            result = maxValue;
        } else if (resultAsLong <= minValue) {
            result = minValue;
        } else {
            result = (int) resultAsLong;
        }
        return result;
    }
}
