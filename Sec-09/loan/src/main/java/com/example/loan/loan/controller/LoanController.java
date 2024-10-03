package com.example.loan.loan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.example.loan.loan.constants.LoansConstants;
import com.example.loan.loan.dto.LoansDto;
import com.example.loan.loan.dto.LoansDtoInfo;
import com.example.loan.loan.dto.ResponseDto;
import com.example.loan.loan.service.iLoanService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping(path = "/api", produces = { MediaType.APPLICATION_JSON_VALUE })
@Validated
public class LoanController {

    private final iLoanService iLoanService;

    private static final Logger logger = LoggerFactory.getLogger(LoanController.class);

    public LoanController(iLoanService iLoanService){
        this.iLoanService = iLoanService;
    }

    @Value("${build.version}")
    private String build_version;

    @Autowired
    private LoansDtoInfo dtoInfo;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createLoan(
            @RequestParam @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String mobileNumber) {
                iLoanService.createLoan(mobileNumber);
                return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(LoansConstants.STATUS_200,LoansConstants.MESSAGE_200));
    }

    @GetMapping("/fetch")
    public ResponseEntity<LoansDto> fetchLoanDetails(
            @RequestHeader("eazybank-correlation-id")
            String correlationId,
            @RequestParam @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String mobileNumber) {
        logger.debug("eazyBank-correlation-id found: {} ", correlationId);
        LoansDto dto = iLoanService.fetchLoan(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateLoanDetails(@Valid @RequestBody LoansDto loansDto) {
        boolean isUpdated = iLoanService.updateLoan(loansDto);
        if(isUpdated){
            return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseDto(LoansConstants.STATUS_200, LoansConstants.MESSAGE_200)
            );
        }else{
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(
                new ResponseDto(LoansConstants.STATUS_417, LoansConstants.MESSAGE_417_UPDATE)
            );
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> deleteLoanDetails(@RequestParam @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber) {
        boolean isDeleted = iLoanService.deleteLoan(mobileNumber);
        if(isDeleted){
            return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseDto(LoansConstants.STATUS_200, LoansConstants.MESSAGE_200)
            );
        }else{
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(
                new ResponseDto(LoansConstants.STATUS_417, LoansConstants.MESSAGE_417_DELETE)
            );
        }
    }

    @GetMapping("/build-info")
    public ResponseEntity<String> getBuildInfo(){
        return ResponseEntity.status(HttpStatus.OK).body(build_version);
    }

    @GetMapping("/contact-info")
    public ResponseEntity<LoansDtoInfo> getAccountsInformation(){
        return ResponseEntity.status(HttpStatus.OK).body(dtoInfo);   
    }

}
