package com.microservices.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account type cannot be null or empty")
    private String account_type;

    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branch_address;

    @NotEmpty(message = "Account Number cannot be empty")
    @Pattern(regexp = "($|[0-9]{10})",message = "Account number must be 10 digits")
    private Long accountNumber;
    
}
