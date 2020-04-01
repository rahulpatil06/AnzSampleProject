package com.anz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anz.model.TransactionDetails;
import com.anz.repository.TransactionHistoryRepository;

@Service
public class TransactionHistoryService {

	@Autowired
	TransactionHistoryRepository transactionRepository;

	public List<TransactionDetails> getTransactionList(int accountNumber) {
		return transactionRepository.getTransactionHistory(accountNumber);
	}
}
