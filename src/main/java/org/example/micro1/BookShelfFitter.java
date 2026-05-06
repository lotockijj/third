package org.example.micro1;

import java.util.ArrayList;
import java.util.List;

public class BookShelfFitter {

    public static List<Integer> fitBooks(int[] books, int shelfWidth) {
        return findBest(books, shelfWidth, 0, new ArrayList<>(), 0, new ArrayList<>(), 0);
    }

    private static List<Integer> findBest(
            int[] books,
            int shelfWidth,
            int index,
            List<Integer> current,
            int currentSum,
            List<Integer> best,
            int bestSum
    ) {
        if (currentSum > shelfWidth) {
            return best;
        }
        if (currentSum > bestSum) {
            best = new ArrayList<>(current);
            bestSum = currentSum;
        }
        if (index == books.length) {
            return best;
        }
        current.add(books[index]);
        best = findBest(books, shelfWidth, index + 1, current, currentSum + books[index], best, bestSum);
        int newBestSum = best.stream().mapToInt(Integer::intValue).sum();
        current.remove(current.size() - 1);
        best = findBest(books, shelfWidth, index + 1, current, currentSum, best, newBestSum);

        return best;
    }
}
