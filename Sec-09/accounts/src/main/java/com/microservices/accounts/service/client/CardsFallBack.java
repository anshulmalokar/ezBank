package com.microservices.accounts.service.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.microservices.accounts.dto.CardsDto;

@Component
public class CardsFallBack implements CardsFeignClient{

    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        return null;
    }

}