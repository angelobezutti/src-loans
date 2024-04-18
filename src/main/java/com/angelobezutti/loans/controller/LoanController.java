package com.angelobezutti.loans.controller;

import com.angelobezutti.loans.controller.dto.CustomerLoanRequest;
import com.angelobezutti.loans.controller.dto.CustomerLoanResponse;
import com.angelobezutti.loans.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }


    @PostMapping(value = "/costumer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody CustomerLoanRequest loanRequest){

        var loanResponse = loanService.checkLoanAvailability(loanRequest);

        return ResponseEntity.ok(loanResponse);

    }


}
