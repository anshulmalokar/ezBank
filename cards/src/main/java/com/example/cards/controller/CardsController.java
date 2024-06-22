package com.example.cards.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cards.dto.CardsDto;
import com.example.cards.dto.ResponseDto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class CardsController {
    
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createCard(@Valid @RequestParam @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber){
        return null;
    }

    @GetMapping("/fetch")
    public ResponseEntity<CardsDto> fetchCardDetails(@RequestParam  @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber){
        return null;
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateCardDetails(@Valid @RequestBody CardsDto cardsDto){
        return null;
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> ddeleteCardDetails(@RequestParam @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber){
        return null;
    }

}
