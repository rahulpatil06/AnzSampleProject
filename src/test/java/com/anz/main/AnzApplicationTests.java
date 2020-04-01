package com.anz.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import com.anz.model.AccountDetails;
import com.anz.model.TransactionDetails;
import com.anz.repository.AccountDetailsRepository;
import com.anz.repository.TransactionHistoryRepository;
import com.anz.services.AccountDetailsService;
import com.anz.services.TransactionHistoryService;

@SpringBootTest
class AnzApplicationTests {

	@SuppressWarnings("unused")
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		
	}
	@InjectMocks
	AccountDetailsService accountService;
	@InjectMocks
	TransactionHistoryService transactionService;
    @Mock
    AccountDetailsRepository accountDetails;
    @Mock
    TransactionHistoryRepository transactionHistory;
	
	@Test
	public void testTransactionHistory() {
    	List<TransactionDetails> list = new ArrayList<TransactionDetails>();
    	list.add(new TransactionDetails(3,585309209,"21/02/2019", 2000, 0, "Debit", "","AUSavings933","SGD"));
		when(transactionHistory.getTransactionHistory(585309209)).thenReturn(list);
		List<TransactionDetails> transaction =  transactionService.getTransactionList(585309209);
        assertEquals("AUSavings933", transaction.get(0).getAcc_Name());
        assertEquals(585309209, transaction.get(0).getAccountNumber());
        assertEquals(2000, transaction.get(0).getDebitAmount());
        assertEquals("Debit", transaction.get(0).getDr_cr());
	}
	@Test
	public void testAccountDetails() {
		List<AccountDetails> list = new ArrayList<AccountDetails>();
		list.add(new AccountDetails(585309209, "SGSavings726", "Savings", "08/11/2018", "SGD", (float) 84327.50));
        when(accountDetails.getAccountDetails()).thenReturn(list);
        List<AccountDetails> accountList = accountService.getAcountList();
        assertEquals(1, accountList.size());
        verify(accountDetails, times(1)).getAccountDetails();
	}
	@Test
	public void testTransactionHistoryError() {
    	List<TransactionDetails> list = new ArrayList<TransactionDetails>();
    	list.add(new TransactionDetails(3,585309209,"21/02/2019", 2000, 0, "Debit", "","AUSavings933","SGD"));
    	when(transactionHistory.getTransactionHistory(585309209)).thenReturn(list);
		List<TransactionDetails> transaction =  transactionService.getTransactionList(585309209);
        assertNotEquals(79106619, transaction.get(0).getAccountNumber());
        assertNotEquals(4500, transaction.get(0).getDebitAmount());
        assertNotEquals("Credit", transaction.get(0).getDr_cr());
        assertNotEquals("01/02/2019", transaction.get(0).getValue_date());
	}
	@Test
	public void testErrorAccountDetails() {
		List<AccountDetails> list = new ArrayList<AccountDetails>();
		List<AccountDetails> actualList = new ArrayList<AccountDetails>();
		list.add(new AccountDetails(1547896, "USDSavings", "Deposit", "09/05/2015", "USD", (float) 98745.50));
        when(accountDetails.getAccountDetails()).thenReturn(actualList);
        List<AccountDetails> accountList = accountService.getAcountList();
        assertNotEquals(1, accountList.size());
        verify(accountDetails, times(1)).getAccountDetails();
	}
}
