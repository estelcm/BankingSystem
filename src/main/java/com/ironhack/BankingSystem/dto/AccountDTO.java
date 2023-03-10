package com.ironhack.BankingSystem.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ironhack.BankingSystem.utils.LocalDateDeserializer;
import com.ironhack.BankingSystem.utils.LocalDateSerializer;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountDTO {
    private BigDecimal newBalance;

    private String newSecretKey;

    private Integer newPrimaryOwnerId;

    private Integer newSecondaryOwnerId;

    //interestRate needed for SavingsAccount && CreditCard
    private Double newInterestRate;

     //creditLimit just needed for CreditCard
    private BigDecimal newCreditLimit;

    //Account
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate lastPenaltyFee;



  //Savings && CreditCard
  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate lasYearInterestRate;


    public AccountDTO(BigDecimal newBalance, String newSecretKey, Integer newPrimaryOwnerId, Integer newSecondaryOwnerId, Double newInterestRate, BigDecimal newCreditLimit, LocalDate lastPenaltyFee,  LocalDate lasYearInterestRate) {
        this.newBalance = newBalance;
        this.newSecretKey = newSecretKey;
        this.newPrimaryOwnerId = newPrimaryOwnerId;
        this.newSecondaryOwnerId = newSecondaryOwnerId;
        this.newInterestRate = newInterestRate;
        this.newCreditLimit = newCreditLimit;
        this.lastPenaltyFee = lastPenaltyFee;
        this.lasYearInterestRate = lasYearInterestRate;
    }

    public BigDecimal getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(BigDecimal newBalance) {
        this.newBalance = newBalance;
    }

    public String getNewSecretKey() {
        return newSecretKey;
    }

    public void setNewSecretKey(String newSecretKey) {
        this.newSecretKey = newSecretKey;
    }

    public Integer getNewPrimaryOwnerId() {
        return newPrimaryOwnerId;
    }

    public void setNewPrimaryOwnerId(Integer newPrimaryOwnerId) {
        this.newPrimaryOwnerId = newPrimaryOwnerId;
    }

    public Integer getNewSecondaryOwnerId() {
        return newSecondaryOwnerId;
    }

    public void setNewSecondaryOwnerId(Integer newSecondaryOwnerId) {
        this.newSecondaryOwnerId = newSecondaryOwnerId;
    }



    public Double getNewInterestRate() {
        return newInterestRate;
    }

    public void setNewInterestRate(Double interestRate) {
        this.newInterestRate = interestRate;
    }

    public BigDecimal getNewCreditLimit() {
        return newCreditLimit;
    }

    public void setNewCreditLimit(BigDecimal creditLimit) {
        this.newCreditLimit = creditLimit;
    }

    public LocalDate getLastPenaltyFee() {
        return lastPenaltyFee;
    }

    public void setLastPenaltyFee(LocalDate lastPenaltyFee) {
        this.lastPenaltyFee = lastPenaltyFee;
    }


    public LocalDate getLasYearInterestRate() {
        return lasYearInterestRate;
    }

    public void setLasYearInterestRate(LocalDate lasYearInterestRate) {
        this.lasYearInterestRate = lasYearInterestRate;
    }
}


