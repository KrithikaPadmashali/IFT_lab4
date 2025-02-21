package com.example.question1_4.entity;



import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="CUST_DETAILS")
public class CUST_DETAILS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cstId;

    @Column(length = 100)
    private String cstdetType;
    
    private LocalDate cstdetDob;
    
    @Column(length = 100)
    private String cstdetStatus;
    
    @Column(length = 100)
    private String cstdetContact;
    
    @Column(length = 100)
    private String cstdetMobile;
    
    @Column(length = 100)
    private String cstdetEmail;
    
    private LocalDate cstdetEfctvDate;
    
    @Column(length = 1)
    private char cstdetCrudValue;
    
    @Column(length = 100)
    private String cstdetUserId;
    
    @Column(length = 100)
    private String cstdetWsId;
    
    @Column(length = 100)
    private String cstdetPrgmId;
    
    private LocalDateTime cstdetHostTs;
    private LocalDateTime cstdetLocalTs;
    private LocalDateTime cstdetAcptTs;
    private LocalDateTime cstdetAcptTsUtcOfst;
    
    @Column(length = 100)
    private String cstdetUuid;

    // Getters and Setters
    public Long getCstId() {
        return cstId;
    }

    public void setCstId(Long cstId) {
        this.cstId = cstId;
    }

    public String getCstdetType() {
        return cstdetType;
    }

    public void setCstdetType(String cstdetType) {
        this.cstdetType = cstdetType;
    }

    public LocalDate getCstdetDob() {
        return cstdetDob;
    }

    public void setCstdetDob(LocalDate cstdetDob) {
        this.cstdetDob = cstdetDob;
    }

    public String getCstdetStatus() {
        return cstdetStatus;
    }

    public void setCstdetStatus(String cstdetStatus) {
        this.cstdetStatus = cstdetStatus;
    }

    public String getCstdetContact() {
        return cstdetContact;
    }

    public void setCstdetContact(String cstdetContact) {
        this.cstdetContact = cstdetContact;
    }

    public String getCstdetMobile() {
        return cstdetMobile;
    }

    public void setCstdetMobile(String cstdetMobile) {
        this.cstdetMobile = cstdetMobile;
    }

    public String getCstdetEmail() {
        return cstdetEmail;
    }

    public void setCstdetEmail(String cstdetEmail) {
        this.cstdetEmail = cstdetEmail;
    }

    public LocalDate getCstdetEfctvDate() {
        return cstdetEfctvDate;
    }

    public void setCstdetEfctvDate(LocalDate cstdetEfctvDate) {
        this.cstdetEfctvDate = cstdetEfctvDate;
    }

    public char getCstdetCrudValue() {
        return cstdetCrudValue;
    }

    public void setCstdetCrudValue(char cstdetCrudValue) {
        this.cstdetCrudValue = cstdetCrudValue;
    }

    public String getCstdetUserId() {
        return cstdetUserId;
    }

    public void setCstdetUserId(String cstdetUserId) {
        this.cstdetUserId = cstdetUserId;
    }

    public String getCstdetWsId() {
        return cstdetWsId;
    }

    public void setCstdetWsId(String cstdetWsId) {
        this.cstdetWsId = cstdetWsId;
    }

    public String getCstdetPrgmId() {
        return cstdetPrgmId;
    }

    public void setCstdetPrgmId(String cstdetPrgmId) {
        this.cstdetPrgmId = cstdetPrgmId;
    }

    public LocalDateTime getCstdetHostTs() {
        return cstdetHostTs;
    }

    public void setCstdetHostTs(LocalDateTime cstdetHostTs) {
        this.cstdetHostTs = cstdetHostTs;
    }

    public LocalDateTime getCstdetLocalTs() {
        return cstdetLocalTs;
    }

    public void setCstdetLocalTs(LocalDateTime cstdetLocalTs) {
        this.cstdetLocalTs = cstdetLocalTs;
    }

    public LocalDateTime getCstdetAcptTs() {
        return cstdetAcptTs;
    }

    public void setCstdetAcptTs(LocalDateTime cstdetAcptTs) {
        this.cstdetAcptTs = cstdetAcptTs;
    }

    public LocalDateTime getCstdetAcptTsUtcOfst() {
        return cstdetAcptTsUtcOfst;
    }

    public void setCstdetAcptTsUtcOfst(LocalDateTime cstdetAcptTsUtcOfst) {
        this.cstdetAcptTsUtcOfst = cstdetAcptTsUtcOfst;
    }

    public String getCstdetUuid() {
        return cstdetUuid;
    }

    public void setCstdetUuid(String cstdetUuid) {
        this.cstdetUuid = cstdetUuid;
    }
}
