package com.example.question1_4.service;



import com.example.question1_4.entity.CUST_DETAILS;
import com.example.question1_4.repository.CUST_DETAILSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CUST_DETAILSService {

    @Autowired
    private CUST_DETAILSRepository custDetailsRepository;

    public List<CUST_DETAILS> getAllCUST_DETAILS() {
        return custDetailsRepository.findAll();
    }

    public CUST_DETAILS saveCUST_DETAILS(CUST_DETAILS custDetails) {
        return custDetailsRepository.save(custDetails);
    }
}
