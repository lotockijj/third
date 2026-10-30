package leetcode.one;

public class Solution72 {

    public int minDistance(String word1, String word2) {
        if (word1.isEmpty()) {
            return word2.length();
        } else if (word2.isEmpty()) {
            return word1.length();
        }
        int[][] res = new int[word1.length() + 1][word2.length() + 1];

        for (int i = word2.length(); i >= 0; i--) {
            res[word1.length()][i] = word2.length() - i;
        }

        for (int i = word1.length(); i >= 0; i--) {
            res[i][word2.length()] = word1.length() - i;
        }
        for (int i = word1.length() - 1; i >= 0; i--) {
            for (int j = word2.length() - 1; j >= 0; j--) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    res[i][j] = res[i + 1][j + 1];
                } else {
                    res[i][j] = 1 + min(res[i + 1][j], res[i][j + 1], res[i + 1][j + 1]);
                }
            }
        }
        return res[0][0];
    }

    private int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
