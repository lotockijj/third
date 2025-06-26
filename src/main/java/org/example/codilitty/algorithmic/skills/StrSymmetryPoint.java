package org.example.codilitty.algorithmic.skills;

public class StrSymmetryPoint {

    public int solution(String S) {
        // Implement your solution here
        int result = -1;
        if (S.length() == 1) return 0;
        if (S.length() % 2 == 0) return result;
        for (int i = 0; i <= S.length() / 2; i++) {
            if (S.charAt(i) == S.charAt(S.length() - i - 1)) {
                result++;
            } else {
                result = -1;
                break;
            }
        }
        return result;
    }
}
