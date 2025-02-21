package com.example.question3_4.controller;

import com.example.question3_4.entity.CUST_CI;
import com.example.question3_4.service.CUST_CIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CUST_CIController {

    @Autowired
    private CUST_CIService custCIService;

    @GetMapping("/getallcust_ci")
    public List<CUST_CI> getAllCUST_CI() {
        return custCIService.getAllCUST_CI();
    }

    @PostMapping("/addcust_ci")
    public CUST_CI createCUST_CI(@RequestBody CUST_CI custCI) {
        return custCIService.saveCUST_CI(custCI);
    }
}
