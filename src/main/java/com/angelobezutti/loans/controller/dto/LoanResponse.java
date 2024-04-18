package com.angelobezutti.loans.controller.dto;

import com.angelobezutti.loans.domain.enums.LoanType;

public record LoanResponse(LoanType loanType, Double interestRate) {
}
