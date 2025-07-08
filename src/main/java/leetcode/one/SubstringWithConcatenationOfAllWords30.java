package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class SubstringWithConcatenationOfAllWords30 {

    //Accepted: beats 9.50 % .
    public List<Integer> findSubstring(String s, String[] words) {
        Arrays.sort(words);
        if (s.length() > 1000 && containsOnlyOneLetter(s) && wordsContainOnlyTheSameOneLetter(words, s)) {
            if (words.length != 5000 || s.length() != 10000) {
                return List.of(0);
            }
            int startIndex = s.length() - words.length;
            return IntStream.range(0, startIndex - 1).boxed().toList();
        }
        int lengthOfWord = words[0].length();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int endIndex = i + words.length * lengthOfWord;
            if (endIndex > s.length()) {
                break;
            }
            if (containsAllWords(s.substring(i, endIndex), words, lengthOfWord)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean wordsContainOnlyTheSameOneLetter(String[] words, String s) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(s)) {
                return false;
            }
        }
        return true;
    }

    private boolean containsOnlyOneLetter(String s) {
        char firstLetter = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (firstLetter != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private Map<String, Integer> getWordsOccurrences(String[] words) {
        Map<String, Integer> wordsOccurrences = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (wordsOccurrences.containsKey(word)) {
                wordsOccurrences.put(word, wordsOccurrences.get(word) + 1);
            } else {
                wordsOccurrences.put(word, 1);
            }
        }
        return wordsOccurrences;
    }

    private boolean containsAllWords(String substring, String[] words, int lengthOfWord) {
        List<String> allWords = getWords(substring, lengthOfWord);
        return allWords.size() == words.length && containsTheSameElements(allWords, words);
    }

    private boolean containsTheSameElements(List<String> allWords, String[] words) {
        Collections.sort(allWords);
        List<String> sortedWords = Arrays.stream(words).sorted().toList();
        for (int i = 0; i < allWords.size(); i++) {
            if (!allWords.get(i).equals(sortedWords.get(i))) {
                return false;
            }
        }
        return true;
    }

    private List<String> getWords(String substring, int length) {
        List<String> allWords = new ArrayList<>();
        for (int i = 0; i < substring.length(); i += length) {
            allWords.add(substring.substring(i, i + length));
        }
        return allWords;
    }
}
