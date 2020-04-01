package com.anz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.model.AccountDetails;
import com.anz.repository.AccountDetailsRepository;

@Service
public class AccountDetailsService {

	@Autowired
	AccountDetailsRepository accountList;

	public List<AccountDetails> getAcountList() {
		return accountList.getAccountDetails();
	}

}
