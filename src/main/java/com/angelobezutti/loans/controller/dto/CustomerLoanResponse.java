package com.angelobezutti.loans.controller.dto;

import com.angelobezutti.loans.controller.LoanController;

import java.util.List;

public record CustomerLoanResponse(String customer, List<LoanResponse> loans) {
}
