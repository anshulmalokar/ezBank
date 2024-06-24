package com.example.loan.loan.dto;
import java.util.*;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "loans")
public record LoansDtoInfo(
    String message,
    Map<String,String>contactDetails,
    List<String> onCallSupport
) {
    
}
