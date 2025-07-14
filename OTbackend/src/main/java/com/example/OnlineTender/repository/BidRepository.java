package com.example.OnlineTender.repository;

import com.example.OnlineTender.model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface BidRepository extends JpaRepository<Bid, Long> {
    // Option 1: Use query method naming convention
    List<Bid> findByProductIdOrderByAmountDesc(Long productId);

    // OR Option 2: Use explicit JPQL query
    @Query("SELECT b FROM Bid b WHERE b.product.id = :productId ORDER BY b.amount DESC")
    List<Bid> findBidsByProductIdSorted(@Param("productId") Long productId);

}
