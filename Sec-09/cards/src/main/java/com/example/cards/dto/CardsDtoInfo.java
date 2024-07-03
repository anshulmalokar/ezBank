package com.example.cards.dto;
import java.util.*;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "cards")
@Getter
@Setter
public class CardsDtoInfo{
    private String message;
    private Map<String,String> contactDetails;
    private List<String> onCallSupport;
}
