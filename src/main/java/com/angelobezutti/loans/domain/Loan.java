package com.angelobezutti.loans.domain;

import com.angelobezutti.loans.controller.dto.CustomerLoanResponse;

public class Loan {

    private Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }


}
