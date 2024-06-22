package com.example.loan.loan.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.loan.dto.LoansDto;
import com.example.loan.loan.dto.ResponseDto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/api", produces = { MediaType.APPLICATION_JSON_VALUE })
public class LoanController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createLoan(
            @RequestParam @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String mobileNumber) {
        return null;
    }

    @GetMapping("path")
    public ResponseEntity<LoansDto> getMethodName(
            @RequestParam @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String param) {
        return null;
    }

    @PutMapping("path/{id}")
    public ResponseEntity<ResponseDto> putMethodName(@Valid @RequestBody LoansDto loansDto) {
        return null;
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> deleteLoanDetails(@RequestParam @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber) {
        return null;
    }

}
