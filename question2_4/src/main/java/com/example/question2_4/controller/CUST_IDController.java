package com.example.question2_4.controller;


import com.example.question2_4.entity.CUST_ID;
import com.example.question2_4.service.CUST_IDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/custid")
public class CUST_IDController {

    private final CUST_IDService custIdService;

    @Autowired
    public CUST_IDController(CUST_IDService custIdService) {
        this.custIdService = custIdService;
    }

    @GetMapping("/getall")
    public List<CUST_ID> getAllCustIds() {
        return custIdService.getAllCustIds();
    }

    @PostMapping
    public CUST_ID createCustId(@RequestBody CUST_ID custId) {
        return custIdService.saveCustId(custId);
    }
}

