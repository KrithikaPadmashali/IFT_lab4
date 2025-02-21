package com.example.question2_4.service;



import com.example.question2_4.entity.CUST_ID;
import com.example.question2_4.repository.CUST_IDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CUST_IDService {

    private final CUST_IDRepository custIdRepository;

    @Autowired
    public CUST_IDService(CUST_IDRepository custIdRepository) {
        this.custIdRepository = custIdRepository;
    }

    public List<CUST_ID> getAllCustIds() {
        return custIdRepository.findAll();
    }

    public CUST_ID saveCustId(CUST_ID custId) {
        return custIdRepository.save(custId);
    }
}
