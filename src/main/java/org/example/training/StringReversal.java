package org.example.training;

public class StringReversal {

    public static String reverseString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(str.length() - i - 1));
        }
        return result.toString();
    }
}
