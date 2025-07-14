package com.example.OnlineTender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.OnlineTender.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Remove the class declaration, keep only interface
}