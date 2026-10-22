package org.example.ciklum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Requirements:
- Calculate the total amount spent by each customer.
- Return the IDs of the top limit customers by total spending.
- Sort by total spending descending.
- If two customers spent the same amount, sort by customer ID alphabetically.
- Each customer must appear only once.
- Return an empty list if orders is empty or limit <= 0.
- You may use Java Streams or ordinary loops.

And one more from deepseek
You are given a list of orders. Each order has a customer ID (a string) and an amount (an integer).
Write a program that reads the orders and prints the total amount spent by each customer,
sorted by customer ID in ascending order.

 */
public class CustomerService {

    public static List<String> topCustomers(List<Order> orders, int limit) {
        Map<String, Integer> collect = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::customerId,
                        HashMap::new,
                        Collectors.summingInt(Order::amount)));
        return collect.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(Math.max(0, limit))
                .map(Map.Entry::getKey)
                .toList();
    }

    public static void printCustomers(List<Order> orders) {
        orders.stream()
                .collect(Collectors.groupingBy(
                        Order::customerId,
                        Collectors.summingInt(Order::amount)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }

        public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Alice", 100),
                new Order("Bob", 200),
                new Order("Alice", 150),
                new Order("Charlie", 300),
                new Order("Bob", 50)
        );

        List<String> strings = topCustomers(orders, 2);
        strings.forEach(System.out::println);
    }

    record Order(String customerId, int amount) {}
}
