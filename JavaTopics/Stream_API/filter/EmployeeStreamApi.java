package Stream_API.filter;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamApi {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Engineering", 90000, 28),
                new Employee(2, "Bob", "Sales", 75000, 32),
                new Employee(3, "Charlie", "Engineering", 120000, 45),
                new Employee(4, "David", "HR", 60000, 29),
                new Employee(5, "Eve", "Engineering", 95000, 26),
                new Employee(6, "Frank", "Sales", 80000, 35),
                new Employee(7, "Grace", "HR", 65000, 30)
        );

        //Filtered and Sorted Names in Engineering Department:
        employees.stream()
                .filter(e->e.getDepartment().equals("Engineering"))
                .map(Employee:: getName)
                .sorted()
                .forEach(System.out::println);

        //Average Salary of All Employees:
        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println(" average salary "+ avgSalary);

        //// 3. Find the employee with the highest salary
        Optional<Employee> highestSalary = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println("\nEmployee with the Highest Salary:");
        highestSalary.ifPresent(System.out::println);

        // 4. Group employees by department and print the count
        Map<String,Long> departmentCounts = employees.stream()
                .collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()));

        departmentCounts.forEach((dept, count) -> System.out.println(dept + ": " + count));

        // 5. Check if any employee has a salary greater than 100,000
        boolean anyHighSalary = employees.stream()
                .anyMatch(e -> e.getSalary()>100000);
        System.out.println("\nAny Employee with Salary > 100,000: " + anyHighSalary);

        // 6. Create a list of employees aged between 25 and 35
        List<Employee> employeesAged25To35 = employees.stream()
                .filter(e -> e.getAge() >= 25 && e.getAge() <= 35)
                .collect(Collectors.toList());
        System.out.println("\nEmployees Aged Between 25 and 35:");
        employeesAged25To35.forEach(System.out::println);

        // 7. Calculate the total salary of employees in the Sales department
        double totalSalesSalary = employees.stream()
                .filter(e -> e.getDepartment().equals("Sales"))
                .mapToDouble(Employee :: getSalary)
                .sum();
        System.out.printf("\nTotal Salary of Sales Department: %.2f\n", totalSalesSalary);
    }



}
