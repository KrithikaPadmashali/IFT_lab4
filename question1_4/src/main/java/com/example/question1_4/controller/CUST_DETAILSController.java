package com.example.question1_4.controller;



import com.example.question1_4.entity.CUST_DETAILS;
import com.example.question1_4.service.CUST_DETAILSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CUST_DETAILSController {

    @Autowired
    private CUST_DETAILSService custDetailsService;

    @GetMapping("/getallcust_details")
    public List<CUST_DETAILS> getAllCUST_DETAILS() {
        return custDetailsService.getAllCUST_DETAILS();
    }

    @PostMapping("/addcust_details")
    public CUST_DETAILS createCUST_DETAILS(@RequestBody CUST_DETAILS custDetails) {
        return custDetailsService.saveCUST_DETAILS(custDetails);
    }
}
