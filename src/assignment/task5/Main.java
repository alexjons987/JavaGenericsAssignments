package assignment.task5;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "Alice", 250, false),
                new Order(2, "Bob", 80, false),
                new Order(3, "Charlie", 500, true),
                new Order(4, "Diana", 130, false),
                new Order(5, "Ethan", 1000, true)
        );

        processItems(
                orders,
                (order -> !order.isCompleted()),                    // Filter out incomplete orders
                Comparator.comparing(Order::getAmount).reversed(),  // Sort by amount (largest first)
                System.out::println                                 // Print all using Consumer
        );
    }

    public static <T> void processItems(
            List<T> list,
            Predicate<T> filter,
            Comparator<T> sorter,
            Consumer<T> action
    ) {
        list.stream()
                .filter(filter)     // 1. Filter the list
                .sorted(sorter)     // 2. Sort the list
                .forEach(action);   // 3. Run action.accept() on each element
    }
}
