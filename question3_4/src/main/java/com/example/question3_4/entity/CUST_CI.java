package com.example.question3_4.entity;


import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "CUST_CI")
public class CUST_CI {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cstId;

    @Column(length = 50)
    private String cstdetContactT;
    
    @Column(length = 100)
    private String cstdetContactV;
    
    private LocalDate cstclEfctvDate;
    private LocalDate startDate;
    private LocalDate endDate;

    // Getters and Setters
   
   
    public Long getCstId() {
        return cstId;
    }

    public void setCstId(Long cstId) {
        this.cstId = cstId;
    }

    public String getCstdetContactT() {
        return cstdetContactT;
    }

    public void setCstdetContactT(String cstdetContactT) {
        this.cstdetContactT = cstdetContactT;
    }

    public String getCstdetContactV() {
        return cstdetContactV;
    }

    public void setCstdetContactV(String cstdetContactV) {
        this.cstdetContactV = cstdetContactV;
    }

    public LocalDate getCstclEfctvDate() {
        return cstclEfctvDate;
    }

    public void setCstclEfctvDate(LocalDate cstclEfctvDate) {
        this.cstclEfctvDate = cstclEfctvDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
