package leetcode.asked;

/*
{
  "task": "Implement a method that takes a string and returns a new string where the order of words is reversed,
  but the characters within each word are in their original order. Words are separated by a single space.",
  "example": {
    "input": "Hello world from Java",
    "output": "Java from world Hello"
  }
}
 */
public class StringManipulation {

    public String reverseWordsOrder(String sentence){
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
