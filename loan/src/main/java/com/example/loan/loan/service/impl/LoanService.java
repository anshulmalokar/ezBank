package com.example.loan.loan.service.impl;

import org.springframework.stereotype.Service;

import com.example.loan.loan.dto.LoansDto;
import com.example.loan.loan.service.iLoanService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoanService implements iLoanService{

    @Override
    public void createLoan(String mobileNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createLoan'");
    }

    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchLoan'");
    }

    @Override
    public boolean updateLoan(LoansDto loansDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateLoan'");
    }

    @Override
    public boolean deleteLoan(String mobileNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteLoan'");
    }
    
}
