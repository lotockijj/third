package org.example.ukees;

import java.util.HashSet;
import java.util.Set;

public class NGramTokenization {

    public static int countDistinctNGrams(String[] tokens, int n) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < tokens.length; i++) {
            String temp = getNGram(tokens, i, n);
            if (!temp.isBlank()) {
                result.add(temp);
            }
        }
        return result.size();
    }

    private static String getNGram(String[] tokens, int i, int n) {
        if (i + n > tokens.length) return "";
        StringBuilder res = new StringBuilder();
        for (int j = i; j < i + n && j < tokens.length; j++) {
            res.append(tokens[j]).append(" ");
        }
        return res.toString();
    }
}
