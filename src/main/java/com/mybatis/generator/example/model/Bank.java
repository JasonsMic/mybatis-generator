package com.mybatis.generator.example.model;

public class Bank {
    private Integer id;

    private String bankName;

    private String bankId;

    private String bankDesc;

    private String bankAddress;

    private Integer bankState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getBankDesc() {
        return bankDesc;
    }

    public void setBankDesc(String bankDesc) {
        this.bankDesc = bankDesc == null ? null : bankDesc.trim();
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    public Integer getBankState() {
        return bankState;
    }

    public void setBankState(Integer bankState) {
        this.bankState = bankState;
    }
}