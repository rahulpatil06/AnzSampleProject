package com.anz.main;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import com.anz.dao.AccountList;
import com.anz.model.AccountDetailsModel;
import com.anz.model.TransactionHistory;


@SpringBootTest
class AnzApplicationTests {

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	void contextLoads() {
	}

	@InjectMocks
	AccountList accList;

	@Test
	public void getAccountDetails() {
		List<AccountDetailsModel> list = new ArrayList<AccountDetailsModel>();
		list.add(new AccountDetailsModel(585309209, "SGSavings726", "Savings", "08/11/2018", "SGD", (float) 84327.50));
		assertThat(accList.getAccountDetails().get(0).getAccountName()).isEqualTo(list.get(0).getAccountName());
	}

	@Test
	public void getTransactionHistory() {
		List<TransactionHistory> list = new ArrayList<TransactionHistory>();
		list.add(new TransactionHistory(791066619, "AUSavings933", "18/08/2019", "AUD", 0, 1800, "Credit", ""));
		assertThat(accList.getTransaction(791066619).get(0).getAccountName()).isEqualTo(list.get(0).getAccountName());
	}

}
