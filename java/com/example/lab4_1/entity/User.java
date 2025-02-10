package com.example.lab4_1.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "CUST_DETAILS")
public class 	User {

    @Id
    @Column(name = "CST_ID")
    private Long cstId;

    @Size(max = 100, message = "CSTDET_TYPE must not exceed 100 characters")
    @Column(name = "CSTDET_TYPE")
    private String cstDetType;

    @Column(name = "CSTDET_DOB")
    private LocalDate cstDetDob;

    @Size(max = 100, message = "CSTDET_STATUS must not exceed 100 characters")
    @Column(name = "CSTDET_STATUS")
    private String cstDetStatus;

    @Size(max = 100, message = "CSTDET_CONTACT must not exceed 100 characters")
    @Column(name = "CSTDET_CONTACT")
    private String cstDetContact;

    @Size(max = 100, message = "CSTDET_MOBILE must not exceed 100 characters")
    @Column(name = "CSTDET_MOBILE")
    private String cstDetMobile;

    @Size(max = 100, message = "CSTDET_EMAIL must not exceed 100 characters")
    @Column(name = "CSTDET_EMAIL")
    private String cstDetEmail;

    @Column(name = "CSTDET_EFCTV_DATE")
    private LocalDate cstDetEfctvDate;

    @Column(name = "CSTDET_CRUD_VALUE", length = 1)
    private String cstDetCrudValue;

    @Size(max = 100, message = "CSTDET_USER_ID must not exceed 100 characters")
    @Column(name = "CSTDET_USER_ID")
    private String cstDetUserId;

    @Size(max = 100, message = "CSTDET_WS_ID must not exceed 100 characters")
    @Column(name = "CSTDET_WS_ID")
    private String cstDetWsId;

    @Size(max = 100, message = "CSTDET_PRGM_ID must not exceed 100 characters")
    @Column(name = "CSTDET_PRGM_ID")
    private String cstDetPrgmId;

    @Column(name = "CSTDET_HOST_TS")
    private LocalDateTime cstDetHostTs;

    @Column(name = "CSTDET_LOCAL_TS")
    private LocalDateTime cstDetLocalTs;

    @Column(name = "CSTDET_ACPT_TS")
    private LocalDateTime cstDetAcptTs;

    @Column(name = "CSTDET_ACPT_TS_UTC_OFST")
    private LocalDateTime cstDetAcptTsUtcOfst;

    @Size(max = 100, message = "CSTDET_UUID must not exceed 100 characters")
    @Column(name = "CSTDET_UUID")
    private String cstDetUuid;

    
    // Getters and setters
    public Long getCstId() {
        return cstId;
    }

    public void setCstId(Long cstId) {
        this.cstId = cstId;
    }

    public String getCstDetType() {
        return cstDetType;
    }

    public void setCstDetType(String cstDetType) {
        this.cstDetType = cstDetType;
    }

    public LocalDate getCstDetDob() {
        return cstDetDob;
    }

    public void setCstDetDob(LocalDate cstDetDob) {
        this.cstDetDob = cstDetDob;
    }

    public String getCstDetStatus() {
        return cstDetStatus;
    }

    public void setCstDetStatus(String cstDetStatus) {
        this.cstDetStatus = cstDetStatus;
    }

    public String getCstDetContact() {
        return cstDetContact;
    }

    public void setCstDetContact(String cstDetContact) {
        this.cstDetContact = cstDetContact;
    }

    public String getCstDetMobile() {
        return cstDetMobile;
    }

    public void setCstDetMobile(String cstDetMobile) {
        this.cstDetMobile = cstDetMobile;
    }

    public String getCstDetEmail() {
        return cstDetEmail;
    }

    public void setCstDetEmail(String cstDetEmail) {
        this.cstDetEmail = cstDetEmail;
    }

    public LocalDate getCstDetEfctvDate() {
        return cstDetEfctvDate;
    }

    public void setCstDetEfctvDate(LocalDate cstDetEfctvDate) {
        this.cstDetEfctvDate = cstDetEfctvDate;
    }

    public String getCstDetCrudValue() {
        return cstDetCrudValue;
    }

    public void setCstDetCrudValue(String cstDetCrudValue) {
        this.cstDetCrudValue = cstDetCrudValue;
    }

    public String getCstDetUserId() {
        return cstDetUserId;
    }

    public void setCstDetUserId(String cstDetUserId) {
        this.cstDetUserId = cstDetUserId;
    }

    public String getCstDetWsId() {
        return cstDetWsId;
    }

    public void setCstDetWsId(String cstDetWsId) {
        this.cstDetWsId = cstDetWsId;
    }

    public String getCstDetPrgmId() {
        return cstDetPrgmId;
    }

    public void setCstDetPrgmId(String cstDetPrgmId) {
        this.cstDetPrgmId = cstDetPrgmId;
    }

    public LocalDateTime getCstDetHostTs() {
        return cstDetHostTs;
    }

    public void setCstDetHostTs(LocalDateTime cstDetHostTs) {
        this.cstDetHostTs = cstDetHostTs;
    }

    public LocalDateTime getCstDetLocalTs() {
        return cstDetLocalTs;
    }

    public void setCstDetLocalTs(LocalDateTime cstDetLocalTs) {
        this.cstDetLocalTs = cstDetLocalTs;
    }

    public LocalDateTime getCstDetAcptTs() {
        return cstDetAcptTs;
    }

    public void setCstDetAcptTs(LocalDateTime cstDetAcptTs) {
        this.cstDetAcptTs = cstDetAcptTs;
    }

    public LocalDateTime getCstDetAcptTsUtcOfst() {
        return cstDetAcptTsUtcOfst;
    }

    public void setCstDetAcptTsUtcOfst(LocalDateTime cstDetAcptTsUtcOfst) {
        this.cstDetAcptTsUtcOfst = cstDetAcptTsUtcOfst;
    }

    public String getCstDetUuid() {
        return cstDetUuid;
    }

    public void setCstDetUuid(String cstDetUuid) {
        this.cstDetUuid = cstDetUuid;
    }

    
}
