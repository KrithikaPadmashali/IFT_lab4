package com.example.question2_4.entity;


import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "CUST_ID")
public class CUST_ID {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CST_ID")
    private Long cstId;

    @Column(name = "CUSTID_TYPE", length = 100)
    private String custIdType;

    @Column(name = "CUSTID_ITEM", length = 100, unique = true)
    private String custIdItem;

    @Column(name = "CSTID_EFCTV_DATE")
    private LocalDate cstidEfctvDate;

    @Column(name = "CSTID_CRUD_VALUE", length = 1)
    private char cstidCrudValue;

    @Column(name = "CSTID_USER_ID", length = 100)
    private String cstidUserId;

    @Column(name = "CSTID_WS_ID", length = 100)
    private String cstidWsId;

    @Column(name = "CSTID_PRGM_ID", length = 100)
    private String cstidPrgmId;

    @Column(name = "CSTID_HOST_TS")
    private LocalDateTime cstidHostTs;

    @Column(name = "CSTID_LOCAL_TS")
    private LocalDateTime cstidLocalTs;

    @Column(name = "CSTID_ACPT_TS")
    private LocalDateTime cstidAcptTs;

    @Column(name = "CSTID_ACPT_TS_UTC_OFST")
    private LocalDateTime cstidAcptTsUtcOfst;

    @Column(name = "CSTID_UUID", length = 100)
    private String cstidUuid;

    // Getters and Setters
    public Long getCstId() {
        return cstId;
    }

    public void setCstId(Long cstId) {
        this.cstId = cstId;
    }

    public String getCustIdType() {
        return custIdType;
    }

    public void setCustIdType(String custIdType) {
        this.custIdType = custIdType;
    }

    public String getCustIdItem() {
        return custIdItem;
    }

    public void setCustIdItem(String custIdItem) {
        this.custIdItem = custIdItem;
    }

    public LocalDate getCstidEfctvDate() {
        return cstidEfctvDate;
    }

    public void setCstidEfctvDate(LocalDate cstidEfctvDate) {
        this.cstidEfctvDate = cstidEfctvDate;
    }

    public char getCstidCrudValue() {
        return cstidCrudValue;
    }

    public void setCstidCrudValue(char cstidCrudValue) {
        this.cstidCrudValue = cstidCrudValue;
    }

    public String getCstidUserId() {
        return cstidUserId;
    }

    public void setCstidUserId(String cstidUserId) {
        this.cstidUserId = cstidUserId;
    }

    public String getCstidWsId() {
        return cstidWsId;
    }

    public void setCstidWsId(String cstidWsId) {
        this.cstidWsId = cstidWsId;
    }

    public String getCstidPrgmId() {
        return cstidPrgmId;
    }

    public void setCstidPrgmId(String cstidPrgmId) {
        this.cstidPrgmId = cstidPrgmId;
    }

    public LocalDateTime getCstidHostTs() {
        return cstidHostTs;
    }

    public void setCstidHostTs(LocalDateTime cstidHostTs) {
        this.cstidHostTs = cstidHostTs;
    }

    public LocalDateTime getCstidLocalTs() {
        return cstidLocalTs;
    }

    public void setCstidLocalTs(LocalDateTime cstidLocalTs) {
        this.cstidLocalTs = cstidLocalTs;
    }

    public LocalDateTime getCstidAcptTs() {
        return cstidAcptTs;
    }

    public void setCstidAcptTs(LocalDateTime cstidAcptTs) {
        this.cstidAcptTs = cstidAcptTs;
    }

    public LocalDateTime getCstidAcptTsUtcOfst() {
        return cstidAcptTsUtcOfst;
    }

    public void setCstidAcptTsUtcOfst(LocalDateTime cstidAcptTsUtcOfst) {
        this.cstidAcptTsUtcOfst = cstidAcptTsUtcOfst;
    }

    public String getCstidUuid() {
        return cstidUuid;
    }

    public void setCstidUuid(String cstidUuid) {
        this.cstidUuid = cstidUuid;
    }
}
