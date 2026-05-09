package com.example.e_commerce.service;

import org.springframework.data.domain.*;
import com.example.e_commerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.e_commerce.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<Product> getAllProducts(String category, String brand, Pageable pageable){
        if(category != null  && !category.isEmpty()){
            return productRepository.findByCategoryContainingIgnoreCase(category, pageable);
        }else if(brand != null && !brand.isEmpty()){
            return productRepository.findByBrandContainingIgnoreCase(brand, pageable);
        }else{
            return productRepository.findAll(pageable);
        }
    }

}
