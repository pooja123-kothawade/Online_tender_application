//model>bid.java
package com.example.OnlineTender.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bids")
public class Bid {
    @Id
    @GeneratedValue
    private Long id;
    private Double amount;

    @ManyToOne
    private Product product; // Important: Must serialize to { id } in JSON

    @ManyToOne
    private User user; // Will serialize as { id }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    // ... rest of getters/setters
}