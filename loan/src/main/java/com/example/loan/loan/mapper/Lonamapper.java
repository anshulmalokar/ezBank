package com.example.loan.loan.mapper;

import com.example.loan.loan.dto.LoansDto;
import com.example.loan.loan.entity.*;
public class Lonamapper {
    public static Loans mapToLoans(LoansDto loansDto, Loans loans){
        loans.setLoanNumber(loansDto.getLoanNumber());
        loans.setLoanType(loansDto.getLoanType());
        loans.setMobileNumber(loansDto.getMobileNumber());
        loans.setTotalLoan(loansDto.getTotalLoan());
        loans.setAmountPaid(loansDto.getAmountPaid());
        loans.setOutStandingAmount(loansDto.getOutStandingAmount());
        return loans;
    }

    public static LoansDto mapToLoansDto(LoansDto loansDto,Loans loans){
        loansDto.setLoanNumber(loans.getLoanNumber());
        loansDto.setLoanType(loans.getLoanType());
        loansDto.setMobileNumber(loans.getMobileNumber());
        loansDto.setTotalLoan(loans.getTotalLoan());
        loansDto.setAmountPaid(loans.getAmountPaid());
        loansDto.setOutStandingAmount(loans.getOutStandingAmount());
        return loansDto;
    }

}
