package com.microservices.accounts.service.impl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservices.accounts.dto.AccountsDto;
import com.microservices.accounts.dto.CardsDto;
import com.microservices.accounts.dto.CustomerDetailsDto;
import com.microservices.accounts.dto.CustomerDto;
import com.microservices.accounts.dto.LoansDto;
import com.microservices.accounts.entity.Accounts;
import com.microservices.accounts.entity.Customer;
import com.microservices.accounts.exception.ResourceNotFoundException;
import com.microservices.accounts.mapper.AccountsMapper;
import com.microservices.accounts.mapper.CustomerMapper;
import com.microservices.accounts.repositories.AccountRepository;
import com.microservices.accounts.repositories.CustomerRepository;
import com.microservices.accounts.service.iCustomerService;
import com.microservices.accounts.service.client.CardsFeignClient;
import com.microservices.accounts.service.client.LoansFeignClient;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements iCustomerService {

    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        Customer optionalCustomer = customerRepository.findByMobileNumber(mobileNumber).
        orElseThrow(() -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber));

        Accounts accounts = accountRepository.findByCustomerId(optionalCustomer.getCustomerId()).
        orElseThrow(() -> new ResourceNotFoundException("Account", "Customer Id", optionalCustomer.getCustomerId().toString()));

        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(optionalCustomer, new CustomerDetailsDto());
        customerDetailsDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));

        ResponseEntity<LoansDto> loansResponseEntity =loansFeignClient.fetchLoanDetails(mobileNumber);
        customerDetailsDto.setLoansDto(loansResponseEntity.getBody());

        ResponseEntity<CardsDto> responseEntityCards = cardsFeignClient.fetchCardDetails(mobileNumber);
        customerDetailsDto.setCardsDto(responseEntityCards.getBody());

        return customerDetailsDto;
    }
    
}
