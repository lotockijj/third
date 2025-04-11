package leetcode;

import org.springframework.util.NumberUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Solution41 {

    public static int findFirstMissingPositive(int[] arr){
        Stream<Integer> infiniteStream = Stream.iterate(1, i -> i + 1);
        List<Integer> arrayAsList = getAsList(arr);
        return infiniteStream.filter(e -> !arrayAsList.contains(e)).findFirst().orElse(arr.length + 1);
    }

    private static List<Integer> getAsList(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if(temp > 0) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
