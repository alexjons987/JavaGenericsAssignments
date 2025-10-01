package assignment.one;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product("Generic Product A", 100, 199),
                new Product("Generic Product B", 50, 89),
                new Product("Generic Product C", 66, 499),
                new Product("Generic Product D", 0, 19),
                new Product("Generic Product E", 99, 49)
        );

        // 1.
        List<Product> productsUnderOneHundred = filterList(productList, (product -> product.getCost() < 100));

        System.out.println("The following products cost less than 100kr:");
        for (Product p : productsUnderOneHundred) {
            System.out.printf("- %s %d:-%n", p.getName(), p.getCost());
        }

        // 2.
        List<Product> productsInStock = filterList(productList, (product -> product.getQuantity() > 1));

        System.out.println("The following products are in stock:");
        for (Product p : productsInStock) {
            System.out.printf("- %s, %d in stock%n", p.getName(), p.getQuantity());
        }

        // 3.
        Predicate<Product> outOfStock = (product -> product.getQuantity() < 1);
        List<Product> productsOutOfStockAndUnderFifty = filterList(productList, outOfStock.and(product -> product.getCost() < 50));

        System.out.println("The following products are out of stock and under 50kr:");
        for (Product p : productsOutOfStockAndUnderFifty) {
            System.out.printf("- %s, %d in stock, %d:-%n", p.getName(), p.getQuantity(), p.getCost());
        }
    }

    public static <T> List<T> filterList(List<T> list, Predicate<T> condition) {
        return list.stream()
                .filter(condition)
                .toList();
    }
}
