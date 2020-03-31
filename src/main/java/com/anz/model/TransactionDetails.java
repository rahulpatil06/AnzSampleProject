package com.anz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_details")
public class TransactionDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_id")
	private int transactionId;
	@Column(name="acc_Number")
	private int accountNumber;
	@Column(name="value_Date")
	private String value_date;
	@Column(name="debit_Amount")
	private int debitAmount;
	@Column(name="credit_Amount")
	private int creditAmount;
	@Column(name="debit_credit")
	private String dr_cr;
	@Column(name="narrative")
	private String narrative;
	@Column(name="acc_Name")
	private String acc_Name;
	@Column(name="currency")
	private String Currency;

	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getValue_date() {
		return value_date;
	}
	public void setValue_date(String value_date) {
		this.value_date = value_date;
	}
	public int getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(int debitAmount) {
		this.debitAmount = debitAmount;
	}
	public int getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(int creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getDr_cr() {
		return dr_cr;
	}
	public void setDr_cr(String dr_cr) {
		this.dr_cr = dr_cr;
	}
	public String getNarrative() {
		return narrative;
	}
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	
}
