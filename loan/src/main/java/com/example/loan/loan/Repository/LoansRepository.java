package com.example.loan.loan.Repository;

import org.springframework.stereotype.Repository;

import com.example.loan.loan.entity.Loans;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Long>{
    
}
