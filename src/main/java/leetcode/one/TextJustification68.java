package leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class TextJustification68 {

    /*
    Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int countMax = 0;
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(countMax + word.length() < maxWidth){
                countMax += word.length() + 1;
                temp.add(word);
            } else if(countMax + word.length() == maxWidth){
                temp.add(word);
                addLine(temp, result, maxWidth, false);
                temp.clear();
                countMax = 0;
            } else if(countMax + word.length() > maxWidth){
                addLine(temp, result, maxWidth, false);
                temp.clear();
                temp.add(word);
                countMax = word.length() + 1;
            }
        }
        if(!temp.isEmpty()){
            addLine(temp, result, maxWidth, true);
        }
        return result;
    }

    private static void addLine(List<String> temp, List<String> result, int maxWidth, boolean isLastLine) {
        String line = getFullLine(temp, maxWidth, isLastLine);
        result.add(line);
    }

    private static String getFullLine(List<String> temp, int maxWidth, boolean isLastLine) {
        int sum = temp.stream().map(String::length).mapToInt(Integer::intValue).sum();
        int rest = maxWidth - sum;
        if(isLastLine || temp.size() == 1){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < temp.size(); i++) {
                sb.append(temp.get(i));
                if(rest > 0) {
                    sb.append(" ");
                }
                rest--;
            }
            for (int i = 0; i < rest; i++) {
                sb.append(" ");
            }
            return  sb.toString();
        }
        List<String> resultWithSpaces = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            resultWithSpaces.add(temp.get(i));
            if(i < temp.size() - 1){
                resultWithSpaces.add(" ");
                rest--;
            }
        }
        int count = 0;
        while (rest > 0) {
            String s = resultWithSpaces.get(count);
            if (s.contains(" ")) {
                s = s + " ";
                resultWithSpaces.set(count, s);
                rest--;
            }
            count++;
            if(count == resultWithSpaces.size()){
                count = 0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < resultWithSpaces.size(); i++) {
            sb.append(resultWithSpaces.get(i));
        }
        return sb.toString();
    }
}
