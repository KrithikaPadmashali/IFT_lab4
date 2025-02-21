package com.example.question3_4.service;

import com.example.question3_4.entity.CUST_CI;
import com.example.question3_4.repository.CUST_CIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CUST_CIService {

    @Autowired
    private CUST_CIRepository custCIRepository;

    public List<CUST_CI> getAllCUST_CI() {
        return custCIRepository.findAll();
    }

    public CUST_CI saveCUST_CI(CUST_CI custCI) {
        return custCIRepository.save(custCI);
    }
}
