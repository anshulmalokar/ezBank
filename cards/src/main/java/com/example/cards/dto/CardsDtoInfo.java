package com.example.cards.dto;
import java.util.*;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cards")
public record CardsDtoInfo(
    String message,
    Map<String,String> contactDetails,
    List<String> onCallSupport
){
    
}
