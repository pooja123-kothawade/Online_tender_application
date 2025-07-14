package com.example.OnlineTender.controller;

import com.example.OnlineTender.model.Bid;
import com.example.OnlineTender.model.Product;
import com.example.OnlineTender.repository.BidRepository;
import com.example.OnlineTender.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List; // Add this import

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BidRepository bidRepository; // Added missing repository

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);

    }

    // In ProductController.java
    @GetMapping("/{productId}/bids")
    public List<Bid> getProductBids(@PathVariable Long productId) {
        // Use either:
        return bidRepository.findByProductIdOrderByAmountDesc(productId);
    }
}
