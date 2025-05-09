package org.example.codilitty.coding.skills;

public class ThreeLetters {

    public String solution(int A, int B) {
        // Implement your solution here
        String[] result = new String[A + B];
        for (int i = 0; i < result.length; i++) {
            String temp = "a";
            if (A > B) {
                temp = "a";
            } else if (B > A) {
                temp = "b";
            }
            temp = getOtherThanTwoLastOrAny(result, temp, i);
            if (temp.equals("a")) {
                A--;
            } else {
                B--;
            }
            result[i] = temp;
        }
        return String.join("", result);
    }

    private String getOtherThanTwoLastOrAny(String[] result, String temp, int i) {
        if (i >= 2) {
            if (result[i - 1].equals(result[i - 2]) && temp.equals(result[i - 1])) {
                return  "a".equals(result[i - 1]) ? "b" : "a";
            }
        }
        return temp;
    }
}
