package org.example.codilitty.contest;

public class LongestPassword {

    public int solution(String S){
        // Implement your solution here
        int result = 0;
        String[] passwords = S.split(" ");
        for (int i = 0; i < passwords.length; i++) {
            String password = passwords[i];
            if(isValidAlphanumericPattern(password)){
                result = Math.max(result, password.length());
            }
        }
        return result == 0 ? -1 : result;
    }

    /**
     * Checks if the input string meets the following criteria:
     * <ul>
     *   <li>Contains only alphanumeric characters</li>
     *   <li>Has an odd number of digits</li>
     *   <li>Has an even number of letters</li>
     * </ul>
     *
     * @param password the string to validate
     * @return {@code true} if the string meets all criteria; {@code false} otherwise
     */
    private boolean isValidAlphanumericPattern(String password) {
        int digitsCount = 0;
        int letterCount = 0;
        boolean isNotOnlyAlpanumerical = true;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isDigit(c)){
                digitsCount++;
            }
            if(Character.isLetter(c)){
                letterCount++;
            }
            if(!(Character.isDigit(c) || Character.isLetter(c))){
                isNotOnlyAlpanumerical = false;
                break;
            }
        }
        return digitsCount % 2 != 0 && letterCount % 2 == 0 && isNotOnlyAlpanumerical;
    }
}
