package com.anz.model;


import org.springframework.stereotype.Component;

@Component
public class AccountDetailsModel {

	private int accountNumber;
	private String accountName;
	private String accountType;
	private String balanceDate;
	private String currency;
	private float openingBalance;
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
	public AccountDetailsModel() {
		
	}
	public AccountDetailsModel(int accountNumber, String accountName, String accountType, String balanceDate,
			String currency, float openingBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.openingBalance = openingBalance;
	}
	@Override
	public String toString() {
		return "AccountDetailsModel [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", balanceDate=" + balanceDate + ", currency=" + currency + ", openingBalance="
				+ openingBalance + "]";
	}
	
}
