package com.example.loan.loan.Repository;

import org.springframework.stereotype.Repository;

import com.example.loan.loan.entity.Loans;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Long>{
    Optional<Loans> findByMobileNumber(String mobileNumber);
    Optional<Loans> findByLoanNumber(String loanNumber);
}
