package com.example.e_commerce;

import com.example.e_commerce.entity.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import com.example.e_commerce.repository.ProductRepository;

@Component
public class DataInitializer implements CommandLineRunner {
    private final ProductRepository repository;
    public DataInitializer(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        System.out.println("running data");
        repository.save(new Product(null, "iPhone 15", "Mobile", "Apple", 999.99));
        repository.save(new Product(null, "Galaxy S23", "Mobile", "Samsung", 899.99));
        repository.save(new Product(null, "MacBook Air", "Laptop", "Apple", 1299.00));
        repository.save(new Product(null, "ThinkPad X1", "Laptop", "Lenovo", 1399.00));
        repository.save(new Product(null, "OnePlus 12", "Mobile", "OnePlus", 749.99));
        repository.save(new Product(null, "Sony Bravia 55\"", "TV", "Sony", 1099.00));
        repository.save(new Product(null, "iPad Air", "Tablet", "Apple", 599.00));
    }
}

