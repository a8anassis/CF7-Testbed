package gr.aueb.cf.ch19.streams;

import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Apples", 10.5, 45),
                new Product("Oranges", 8.5, 20),
                new Product("Mangoes", 18.5, 50),
                new Product("Strawberries", 12.4, 30),
                new Product("Oranges", 10.5, 80));

        var sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getName));

        sortedProducts.forEach(System.out::println);
    }
}
