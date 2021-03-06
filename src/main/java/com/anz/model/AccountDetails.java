package com.anz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_details")
public class AccountDetails {

	@Id
	@Column(name="acc_Number")
	private int accountNumber;
	@Column(name="acc_Name")
	private String accountName;
	@Column(name="acc_Type")
	private String accountType;
	@Column(name="balance_Date")
	private String balanceDate;
	@Column(name="currency")
	private String currency;
	@Column(name="opening_Balance")
	private float openingBalance;
    
	public AccountDetails() {
		
	}

	public AccountDetails(int accountNumber, String accountName, String accountType, String balanceDate,String currency, float openingBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.openingBalance = openingBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public float getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(float openingBalance) {
		this.openingBalance = openingBalance;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", balanceDate=" + balanceDate + ", currency=" + currency + ", openingBalance="
				+ openingBalance +  "]";
	}


}
