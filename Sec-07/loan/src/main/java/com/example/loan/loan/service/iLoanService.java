package com.example.loan.loan.service;

import com.example.loan.loan.dto.LoansDto;

public interface iLoanService{
    void createLoan(String mobileNumber);
    LoansDto fetchLoan(String mobileNumber);
    boolean updateLoan(LoansDto loansDto);
    boolean deleteLoan(String mobileNumber);
}