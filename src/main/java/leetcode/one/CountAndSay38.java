package leetcode.one;

public class CountAndSay38 {

    /*
    Let’s build the first few terms to get the idea:
    n = 1 → "1" (this is the base)
    n = 2 → Read "1" → one 1 → "11"
    n = 3 → Read "11" → two 1s → "21"
    n = 4 → Read "21" → one 2, one 1 → "1211"
    n = 5 → Read "1211" → one 1, one 2, two 1s → "111221"
     */

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String result = "1";
        for (int i = 2; i <= n; i++) {
            result = getNextSequence(result);
        }
        return result;
    }

    private String getNextSequence(String result) {
        StringBuilder strBuilder = new StringBuilder();
        int count = 1;                              //"21" → one 2, one 1 → "1211"
        for (int i = 1; i < result.length(); i++) { //"1211"-> "111221"
            char c = result.charAt(i);
            if (c == result.charAt(i - 1)) {
                count++;
            } else {
                strBuilder.append(count).append(result.charAt(i - 1));
                count = 1;
            }
        }
        strBuilder.append(count).append(result.charAt(result.length() - 1));
        return strBuilder.toString();
    }

    //From Tips !?
    public String countAndDayBad(int n) {
        String res = String.valueOf(n);
        for (int i = 0; i < n - 1; i++) {
            int[][] integersToPairs = mapIntegersToPairs(res);
            res = integersToStringOfPairs(integersToPairs);
        }
        return res;
    }

    //"223314444411"
    public int[][] mapIntegersToPairs(String str) {
        int count = getCount(str);
        int[][] pairs = new int[count][2];
        int currentIndex = 0;
        int currentChar = str.isEmpty() ? -1 : str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int cAsInt = Character.getNumericValue(c);
            if (c == currentChar) {
                pairs[currentIndex][0] = cAsInt;
                pairs[currentIndex][1] = pairs[currentIndex][1] + 1;
            } else {
                currentChar = c;
                currentIndex++;
                pairs[currentIndex][0] = cAsInt;
                pairs[currentIndex][1] = 1;
            }
        }
        return pairs;
    }

    public String integersToStringOfPairs(int[][] pairs) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < pairs.length; i++) {
            strBuilder.append(pairs[i][1]).append(pairs[i][0]);
        }
        return strBuilder.toString();
    }

    public int getCount(String str) {
        int count = !str.isEmpty() ? 1 : 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) != str.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
