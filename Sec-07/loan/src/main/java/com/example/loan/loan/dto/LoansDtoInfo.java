package com.example.loan.loan.dto;
import java.util.*;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "loans")
@Getter
@Setter
public class LoansDtoInfo{
    private String message;
    private Map<String,String>contactDetails;
    private List<String> onCallSupport;
}
