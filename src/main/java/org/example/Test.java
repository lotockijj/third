package org.example;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        int result = 0;
        Set<Integer> number = new HashSet<>();
        for(int i = 500; i <= 543; i++){
            String value = String.valueOf(i);
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = 0; j < value.length(); j++){
                if(value.charAt(j) == '5' ||
                        value.charAt(j) == '4' ||
                        value.charAt(j) == '3' ||
                        value.charAt(j) == '2'){
                    stringBuilder.append(value.charAt(j));
                    if(stringBuilder.length() > 2){
                        number.add(Integer.valueOf(stringBuilder.toString()));
                    }
                }
            }
        }
        System.out.println(number.size());
    }

}
