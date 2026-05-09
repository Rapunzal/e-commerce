package com.example.e_commerce.repository;
import com.example.e_commerce.entity.Product;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryContainingIgnoreCase(String category, Pageable pageable);
    Page<Product> findByBrandContainingIgnoreCase(String brand, Pageable pageable);
   // Page<Product> findAll(Pageable pageable);
}
