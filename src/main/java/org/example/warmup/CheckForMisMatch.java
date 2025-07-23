package org.example.warmup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckForMisMatch {
    private static final String FIRST_ARRAY_AS_STRING = "[6,6,6,6,4],[6,6,6,4,3,3],[6,6,6,10],[6,6,4,4,4,4],[6,6,4,3,3,3,3],[6,6,4,12],[6,6,3,3,10],[6,4,4,4,4,3,3],[6,4,4,4,10],[6,4,3,3,3,3,3,3],[6,4,3,3,12],[6,3,3,3,3,10],[6,10,12],[4,4,4,4,4,4,4],[4,4,4,4,3,3,3,3],[4,4,4,4,12],[4,4,4,3,3,10],[4,4,10,10],[4,3,3,3,3,3,3,3,3],[4,3,3,3,3,12],[4,12,12],[3,3,3,3,3,3,10],[3,3,10,12]";
    private static final String SECOND_ARRAY_AS_STRING = "[4,12,12],[3,3,3,3,4,4,4,4],[4,4,4,4,12],[3,3,3,3,3,3,4,6],[6,10,12],[4,4,4,6,10],[3,3,4,6,12],[3,3,6,6,10],[3,3,4,4,4,4,6],[3,3,10,12],[4,4,10,10],[4,4,4,4,6,6],[3,3,4,6,6,6],[4,6,6,6,6],[3,3,3,3,3,3,3,3,4],[3,3,3,3,6,10],[6,6,6,10],[3,3,3,3,3,3,10],[3,3,4,4,4,10],[3,3,3,3,4,12],[4,6,6,12],[3,3,3,3,4,6,6]";

    public static void main(String[] args) {
        Set<List<Integer>> firstUnique = getUniqueSets(FIRST_ARRAY_AS_STRING);
        Set<List<Integer>> secondUnique = getUniqueSets(SECOND_ARRAY_AS_STRING);
        System.out.println(firstUnique.size());
        System.out.println(secondUnique.size());
        firstUnique.removeAll(secondUnique);
        System.out.println(firstUnique.stream().findFirst().get());
    }

    private static Set<List<Integer>> getUniqueSets(String arrayAsString) {
        Set<List<Integer>> unique = new HashSet<>();
        String[] split = arrayAsString.split("],\\[");
        for (int i = 0; i < split.length; i++) {
            List<Integer> list = Arrays.stream(split[i].replace("[", "").replace("]", "")
                    .split(","))
                    .map(Integer::valueOf)
                    .sorted()
                    .toList();
            unique.add(list);
        }
        return unique;
    }
}
