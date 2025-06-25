package leetcode.one;

import java.util.Map;

public class IntegerToRoman {
    private static final int[] ROMAN_INT_NOMINALS = {1, 5, 10, 50, 100, 500, 1000};
    private static final Map<Integer, String> ROMAN_TO_INT_S = Map.of(
            1, "I",
            5, "V",
            10, "X",
            50, "L",
            100, "C",
            500, "D",
            1000, "M"
    );

    public String intToRoman(int num) { // 3749  MMMDCCXLIX
        StringBuilder resBuilder = new StringBuilder();
        int rest = fillResult(num, 1000, resBuilder);
        rest = fillResult(rest, 500, resBuilder);
        rest = fillResult(rest, 100, resBuilder);
        rest = fillResult(rest, 50, resBuilder);
        rest = fillResult(rest, 10, resBuilder);
        rest = fillResult(rest, 5, resBuilder);
        fillResult(rest, 1, resBuilder);
        return resBuilder.toString();
    }

    private int fillResult(int num, int thousands, StringBuilder resBuilder) {
        int number = num / thousands;
        if (number > 0 && !String.valueOf(num).startsWith("9")) {
            for (int i = 0; i < number; i++) {
                ROMAN_TO_INT_S.entrySet()
                        .stream()
                        .filter(k -> k.getKey() == thousands)
                        .map(Map.Entry::getValue)
                        .forEach(resBuilder::append);

            }
            return num % thousands;
        } else if (String.valueOf(num).startsWith("4")) { //49
            resBuilder.append(getPrevious(num, 0)).append(getCurrents(num));
            return num + getValue(getPrevious(num, 0)) - getValue(getCurrents(num));
        } else if (String.valueOf(num).startsWith("9")) {
            resBuilder.append(getPrevious(num, 1)).append(getCurrents(num));
            return num - 9 * getValue(getPrevious(num, 1)); //MCMXCIV  9*getValue(getPrevious(num, 1))
        } else {
            return num;
        }
    }

    private String getCurrents(int num) {
        for (int i = 0; i < ROMAN_INT_NOMINALS.length; i++) {
            if (num < ROMAN_INT_NOMINALS[i]) {
                return ROMAN_TO_INT_S.get(ROMAN_INT_NOMINALS[i]);
            }
        }
        return "";
    }

    private String getPrevious(int num, int index) {
        for (int i = ROMAN_INT_NOMINALS.length - 1; i >= 0; i--) {
            if (num > ROMAN_INT_NOMINALS[i] && i - index >= 0) {
                return ROMAN_TO_INT_S.get(ROMAN_INT_NOMINALS[i - index]);
            }
        }
        return "";
    }

    private int getValue(String key) {
        return ROMAN_TO_INT_S.entrySet().stream()
                .filter(e -> e.getValue().equals(key))
                .findFirst()
                .map(Map.Entry::getKey).orElse(0);
    }

}

/*
Roman numerals are formed by appending the conversions of decimal place values from highest to lowest.
Converting a decimal place value into a Roman numeral has the following rules:

If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted
from the input, append that symbol to the result, subtract its value, and convert the remainder
to a Roman numeral.

If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from
the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I)
less than 10 (X): IX. Only the following subtractive forms are used:
4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).

Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10.
You cannot append 5 (V), 50 (L), or 500 (D) multiple times.
If you need to append a symbol 4 times use the subtractive form.

Given an integer, convert it to a Roman numeral.
 */
