package com.anz.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.anz.model.AccountDetails;
import com.anz.model.TransactionDetails;
import com.anz.services.AccountDetailsService;
import com.anz.services.TransactionHistoryService;

@RestController
@RequestMapping(path = "/anz")
public class AnzController {

	@Autowired
	AccountDetailsService accountService;
	@Autowired
	TransactionHistoryService transactionService;

	/* 
	 *  AccountDetails List
	 */
	@GetMapping(path = "/accountList", produces = "application/json")
	@ResponseBody
	public List<AccountDetails> getAccountDetails() {
		return accountService.getAcountList();
	}

	/*
	 * Transaction History
	 */
	@PostMapping(path = "/transaction/{acc_No}", produces = "application/json")
	public List<TransactionDetails> getTransactionHistory(@PathVariable("acc_No") int accountNum) {
		return transactionService.getTransactionList(accountNum);
	}
}
