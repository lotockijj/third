package leetcode.one;

public class LengthOfLastWord_58 {

    public int lengthOfLastWord(String s) {
        int result = 0;
        boolean end = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char current = s.charAt(i);
            if (Character.isAlphabetic(current)) {
                result++;
                end = true;
            } else if (end) {
                break;
            }
        }
        return result;
    }
}
