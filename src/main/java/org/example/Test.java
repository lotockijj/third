package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

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
        System.out.println(stringBuilder);
        //System.out.println(joiner);
    }

}
