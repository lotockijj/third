package org.example.rebbit;

//Goal: Return the top 3 categories by total quantity sold,
// but only consider products where quantity > 1 per sale.

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopNAggregator {

    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
                new Sale("Laptop", "Electronics", 4),
                new Sale("Mouse", "Electronics", 1), // Filtered out
                new Sale("Shirt", "Clothing", 5),
                new Sale("Ball", "Sport", 1),        // Filtered out
                new Sale("Shoes", "Boots", 2),
                new Sale("Cap", "White", 3)
        );

        Map<String, Integer> top3 = findTop3CategoriesByTotalQuantity(sales);
        top3.forEach((category, total) -> System.out.println(category + " : " + total));
    }

    private static Map<String, Integer> findTop3CategoriesByTotalQuantity(List<Sale> sales) {
        return sales.stream()
                // 1. Filter out single-item sales with quantity <= 1
                .filter(s -> s.quantity > 1)

                // 2. Group by Category and SUM the quantities (Critical step!)
                .collect(Collectors.groupingBy(
                        Sale::category,
                        Collectors.summingInt(Sale::quantity)
                ))

                // 3. Convert the Map to a Stream of Entries
                .entrySet().stream()

                // 4. Sort by Value (Total Quantity) in Descending order
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())

                // 5. Take the Top 3
                .limit(3)

                // 6. Collect into a LinkedHashMap to preserve sorted order
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // Merge function (not used here)
                        LinkedHashMap::new // Preserves insertion order
                ));
    }

    record Sale(String product, String category, int quantity) {
    }
}