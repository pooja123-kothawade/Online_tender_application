package com.example.OnlineTender.controller;

import com.example.OnlineTender.model.Bid;
import com.example.OnlineTender.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bids")
public class BidController {
    @Autowired
    private BidRepository bidRepository;

    @PostMapping("/place")
    public ResponseEntity<Bid> placeBid(@RequestBody Bid bid) {
        Bid savedBid = bidRepository.save(bid);
        return ResponseEntity.ok(savedBid);
    }

}
