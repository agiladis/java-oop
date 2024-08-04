package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
class Product {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Product {name='" + name + "', price=" + price + "}";
    }
}
public class StreamOrder {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1500),
                new Product("Phone", 800),
                new Product("Tablet", 1200),
                new Product("Headphones", 200),
                new Product("Monitor", 300)
        );

        List<Product> sortedProductDesc = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .collect(Collectors.toList());
        sortedProductDesc.forEach(System.out::println);

        System.out.println("---------------------------");

        List<Product> sortedProductAsc = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
        sortedProductAsc.forEach(System.out::println);
    }
}
