package com.example.e_commerce.controller;

import com.example.e_commerce.dto.PagedResponse;
import com.example.e_commerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.e_commerce.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public PagedResponse<Product> getAllProducts(@RequestParam(defaultValue = "0") int page,
                                                 @RequestParam(defaultValue = "5") int size,
                                                 @RequestParam(required = false) String category,
                                                 @RequestParam(required = false) String brand){
        Pageable pageable = PageRequest.of(page, size);
        Page<Product> productsPage = productService.getAllProducts(category,brand, pageable);
        return new PagedResponse<Product>(
                productsPage.getContent(),
                productsPage.getNumber(),
                productsPage.getSize(),
                productsPage.getTotalElements(),
                productsPage.getTotalPages(),
                productsPage.isLast()
        );
    }
}
