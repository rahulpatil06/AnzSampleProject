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
import com.anz.repository.AccountDetailsRepository;
import com.anz.repository.TransactionHistoryRepository;

@RestController
@RequestMapping(path = "/anz")
public class AnzController {

	@Autowired
	AccountDetailsRepository accountRepository;
	@Autowired
	TransactionHistoryRepository transactionRepository;

	/*  Account List
	 */
	@GetMapping(path = "/accountList", produces = "application/json")
	@ResponseBody
	public List<AccountDetails> getAccountDetails() {
		return accountRepository.getAccountDetais();
	}

	/*
	 * Transaction History
	 */
	@PostMapping(path = "/transaction/{acc_No}", produces = "application/json")
	public List<TransactionDetails> getTransactionHistory(@PathVariable("acc_No") int accountNum) {
		return transactionRepository.getTransactionHistory(accountNum);
	}
}
