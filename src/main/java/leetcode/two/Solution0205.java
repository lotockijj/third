package leetcode.two;

public class Solution0205 {

    public static boolean areIsomorphicStrings(final String first, String second){
        if(first.length() != second.length()){
            return false;
        }
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        for (int i = 0; i < first.length(); i++) {
            char f = firstChars[i];
            char s = secondChars[i];
            for (int j = 0; j < first.length(); j++) {
                if(f == first.charAt(j)){
                    if(s != second.charAt(j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
