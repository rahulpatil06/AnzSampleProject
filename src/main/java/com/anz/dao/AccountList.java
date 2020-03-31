package com.anz.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.anz.model.AccountDetailsModel;
import com.anz.model.TransactionHistory;

@Repository
public class AccountList {
	static ArrayList<AccountDetailsModel> list = new ArrayList<AccountDetailsModel>();
	static {
		list.add(new AccountDetailsModel(585309209, "SGSavings726", "Savings", "08/11/2018", "SGD", (float) 84327.50));
		list.add(new AccountDetailsModel(791066619, "AUSavings933", "Savings", "08/11/2018", "AUD", (float) 84327.50));
		list.add(new AccountDetailsModel(321143048, "AUCurrent433", "Current", "08/11/2018", "AUD", (float) 84327.50));
		list.add(new AccountDetailsModel(680168913, "SGCurrent166", "Current", "08/11/2018", "SGD", (float) 84327.50));
		list.add(new AccountDetailsModel(136056165, "AUCurrent374", "Current", "08/11/2018", "AUD", (float) 84327.50));
		list.add(new AccountDetailsModel(453963528, "AUSavings938", "Savings", "08/11/2018", "AUD", (float) 84327.50));
		list.add(new AccountDetailsModel(334666982, "AUSavings938", "Savings", "08/11/2018", "AUD", (float) 84327.50));
		list.add(new AccountDetailsModel(793949180, "SGSavings253", "Savings", "08/11/2018", "SGD", (float) 84327.50));
		list.add(new AccountDetailsModel(768759901, "AUCurrent754", "Current", "08/11/2018", "AUD", (float) 84327.50));
		list.add(new AccountDetailsModel(847257972, "SGCurrent294", "Current", "08/11/2018", "SGD", (float) 84327.50));
	}

	public List<AccountDetailsModel> getAccountDetails() {
		return list;
	}

	static ArrayList<TransactionHistory> trans_hist = new ArrayList<TransactionHistory>();

	static {
		trans_hist.add(new TransactionHistory(791066619, "AUSavings933", "18/08/2019", "AUD", 0, 1800, "Credit", ""));
		trans_hist.add(new TransactionHistory(791066619, "AUSavings933", "19/08/2019", "AUD", 1050, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(791066619, "AUSavings933", "18/08/2019", "AUD", 0, 2000, "Credit", ""));
		trans_hist.add(new TransactionHistory(791066619, "AUSavings933", "18/08/2019", "AUD", 0, 1700, "Credit", ""));
		trans_hist.add(new TransactionHistory(791066619, "AUSavings933", "18/08/2019", "AUD", 0, 1700, "Credit", ""));
		trans_hist.add(new TransactionHistory(793949180, "SGSavings253", "18/08/2019", "SGD", 1500, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(793949180, "SGSavings253", "17/08/2019", "SGD", 0, 2700, "Credit", ""));
		trans_hist.add(new TransactionHistory(793949180, "SGSavings253", "12/08/2019", "SGD", 1020, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(793949180, "SGSavings253", "12/08/2019", "SGD", 1020, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(793949180, "SGSavings253", "12/08/2019", "SGD", 1020, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(585309209, "SGSavings726", "11/07/2019", "SGD", 0, 1300, "Credit", ""));
		trans_hist.add(new TransactionHistory(585309209, "SGSavings726", "10/07/2019", "SGD", 1020, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(321143048, "AUCurrent433", "22/08/2019", "AUD", 0, 1450, "Credit", ""));
		trans_hist.add(new TransactionHistory(321143048, "AUCurrent433", "22/08/2019", "AUD", 4020, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(321143048, "AUCurrent433", "22/08/2019", "AUD", 0, 4650, "Credit", ""));
		trans_hist.add(new TransactionHistory(680168913, "SGCurrent166", "12/06/2019", "SGD", 2015, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(680168913, "SGCurrent166", "12/06/2019", "SGD", 0, 4500, "Credit", ""));
		trans_hist.add(new TransactionHistory(680168913, "SGCurrent166", "12/06/2019", "SGD", 1540, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(334666982, "AUSavings938", "2/08/2019", "AUD", 0, 2000, "Credit", ""));
		trans_hist.add(new TransactionHistory(334666982, "AUSavings938", "2/08/2019", "AUD", 1020, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(847257972, "SGCurrent294", "10/08/2018", "SGD", 1020, 0, "Debit", ""));
		trans_hist.add(new TransactionHistory(847257972, "SGCurrent294", "10/08/2018", "SGD", 0, 2500, "Credit", ""));
	}

	public List<TransactionHistory> getTransaction(int accountNum) {
		ArrayList<TransactionHistory> history = new ArrayList<TransactionHistory>();
		for (int i = 0; i < trans_hist.size(); i++)
			if (trans_hist.get(i).getAccountNumber() == accountNum) {
				history.add(new TransactionHistory(trans_hist.get(i).getAccountNumber(), trans_hist.get(i).getAccountName(),trans_hist.get(i).getValue_date(), trans_hist.get(i).getCurrency(),
								trans_hist.get(i).getDebitAmount(), trans_hist.get(i).getCreditAmount(),trans_hist.get(i).getDr_cr(), trans_hist.get(i).getNarrative()));
			}
		return history;
	}

}
