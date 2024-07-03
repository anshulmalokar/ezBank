package com.microservices.accounts.mapper;

import com.microservices.accounts.dto.AccountsDto;
import com.microservices.accounts.entity.Accounts;

public class AccountsMapper {
    
    public static AccountsDto mapToAccountsDto(Accounts account, AccountsDto accountsDto){
        accountsDto.setAccount_type(account.getAccountType());
        accountsDto.setBranch_address(account.getBranchAddress());
        accountsDto.setAccountNumber(account.getAccountNumber());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto,Accounts account){
        account.setAccountNumber(accountsDto.getAccountNumber());
        account.setAccountType(accountsDto.getAccount_type());
        account.setBranchAddress(accountsDto.getBranch_address());
        return account;
    }

}
