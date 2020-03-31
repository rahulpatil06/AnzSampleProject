package com.anz.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.anz.model.TransactionDetails;

@Repository
public class TransactionHistoryRepository {

	@Autowired
	private EntityManager entityManager;
	@SuppressWarnings("unchecked")
	public List<TransactionDetails> getTransactionHistory(int accountNumber) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from TransactionDetails where accountNumber="+ accountNumber);
		List<TransactionDetails> list = query.getResultList();
		currentSession.close();
		return list;

	}
}
