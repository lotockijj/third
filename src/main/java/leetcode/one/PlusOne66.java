package leetcode.one;

public class PlusOne66 {

    public int[] plusOne(int[] digits) { // 8, 9, 9, 9
        int[] result = new int[digits.length + 1];
        int tens = 0;
        int one = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if (digit + one + tens < 10) {
                digits[i] = digit + 1;
                return digits;
            } else {
                digits[i] = 0;
                tens = 1;
                one = 0;
            }
        }
        if (result[0] + tens < 10) {
            result[0] = 1;
        } else {
            int[] shortResult = new int[digits.length];
            System.arraycopy(result, 1, shortResult, 0, shortResult.length);
            return shortResult;
        }
        return result;
    }
}
