package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        int result = 0;
        Set<Integer> number = new HashSet<>();
        for (int i = 500; i <= 543; i++) {
            String value = String.valueOf(i);
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < value.length(); j++) {
                if (value.charAt(j) == '5' ||
                        value.charAt(j) == '4' ||
                        value.charAt(j) == '3' ||
                        value.charAt(j) == '2') {
                    stringBuilder.append(value.charAt(j));
                    if (stringBuilder.length() > 2) {
                        number.add(Integer.valueOf(stringBuilder.toString()));
                    }
                }
            }
        }
        //System.out.println(number.size());
        StringBuilder stringBuilder = new StringBuilder();
        StringJoiner joiner = new StringJoiner(",", "", ".");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                stringBuilder.append(i).append(" Fizz\n");
                joiner.add(String.valueOf(i)).add(" Fizz\n");
            } else if (i % 3 != 0 && i % 5 == 0) {
                stringBuilder.append(i).append(" Buzz\n");
                joiner.add(String.valueOf(i)).add(" Buzz\n");
            } else if (i % 3 == 0) {
                stringBuilder.append(i).append(" FizzBuzz\n");
                joiner.add(String.valueOf(i)).add(" FizzBuzz\n");
            } else {
                stringBuilder.append(i).append("\n");
                joiner.add(String.valueOf(i)).add("\n");
            }
        }
        //System.out.println(stringBuilder);
        //System.out.println(joiner);
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", String::length);
        System.out.println(value);
        nameMap.put("John", 100);
        //System.out.println(nameMap.computeIfAbsent("John", String::length));

        Function<Integer, String> intToString = Object::toString;
        Function<String, String> quote = s -> "'" + s + "'";
        Function<Integer, String> quoteIntToString = quote.compose(intToString);
        //System.out.println("'5'".equals(quoteIntToString.apply(5)));
        Map<Integer, Integer> sortedMap = new TreeMap<>();
        sortedMap.put(3, 1);
        sortedMap.put(1, 3);
        sortedMap.put(2, 2);
        sortedMap.put(100, 10);
        sortedMap.put(10, 100);
        //sortedMap.forEach((k, v) -> System.out.println(k + " " + v));
        String sentence = "LoopMe was the best experience for now !";
        List<String> sortedLetters = Arrays.stream(sentence.split(" "))
                .filter(s -> !s.isBlank())
                .sorted(Comparator.comparing(String::length))
                .toList();
        System.out.println(sortedLetters.get(sortedLetters.size() - 1));
    }

}
