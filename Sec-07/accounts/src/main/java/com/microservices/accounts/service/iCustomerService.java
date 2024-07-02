package com.microservices.accounts.service;

import com.microservices.accounts.dto.CustomerDetailsDto;

public interface iCustomerService {
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
