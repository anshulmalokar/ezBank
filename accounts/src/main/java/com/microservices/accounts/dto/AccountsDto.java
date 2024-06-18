package com.microservices.accounts.dto;

import lombok.Data;

@Data
public class AccountsDto {

    private String account_type;

    private String branch_address;

    private Long accountNumber;
    
}
