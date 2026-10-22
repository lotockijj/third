package org.example.ciklum;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Requirements
Using Java Collections, Comparator, and Stream API:
1. Group employees by department.
2. Sort departments by average salary, descending.
3. Within each department, sort employees by:
   - Salary descending.
   - If salaries are equal, experience descending.
   - If both are equal, name alphabetically.
4. Keep only the top 2 employees in each department after sorting.
5. Return a LinkedHashMap<String, List<Employee>> that preserves the sorted department order.

IT:
  Emma   - 6000 - 10 years
  Bob    - 6000 - 8 years

Finance:
  Sarah  - 5500 - 9 years
  David  - 4500 - 6 years

HR:
  Alice  - 4000 - 7 years
  Mike   - 4000 - 4 years
 */

public class Department {

    record Employee(
            String name,
            String department,
            int salary,
            int experience
    ) {}

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "IT", 5000, 5),
                new Employee("Alice", "HR", 4000, 7),
                new Employee("Bob", "IT", 6000, 8),
                new Employee("David", "Finance", 4500, 6),
                new Employee("Emma", "IT", 6000, 10),
                new Employee("Mike", "HR", 4000, 4),
                new Employee("Sarah", "Finance", 5500, 9),
                new Employee("Tom", "IT", 5000, 7)
        );

        // 1. Group employees by department
        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::department));

        // 2. Employee sorting rules
        Comparator<Employee> employeeComparator =
                Comparator.comparingInt(Employee::salary).reversed()
                        .thenComparing(
                                Comparator.comparingInt(Employee::experience).reversed()
                        )
                        .thenComparing(Employee::name);

        // 3. Sort departments by average salary descending
        // 4. Sort employees and keep top 2
        Map<String, List<Employee>> result = grouped.entrySet()
                .stream()
                .sorted(
                        Comparator.comparingDouble(
                                        (Map.Entry<String, List<Employee>> entry) ->
                                                entry.getValue().stream()
                                                        .mapToInt(Employee::salary)
                                                        .average()
                                                        .orElse(0)
                                ).reversed()
                                .thenComparing(Map.Entry::getKey)
                )
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .sorted(employeeComparator)
                                .limit(2)
                                .toList(),
                        (a, b) -> a,
                        LinkedHashMap::new
                ));

        printEmployees(result);
    }

    private static void printEmployees(
            Map<String, List<Employee>> employeesByDepartment) {

        for (Map.Entry<String, List<Employee>> entry
                : employeesByDepartment.entrySet()) {

            System.out.println(entry.getKey() + ":");

            for (Employee employee : entry.getValue()) {
                System.out.println(
                        "  " + employee.name()
                                + " - " + employee.salary()
                                + " - " + employee.experience() + " years"
                );
            }
        }
    }
}

