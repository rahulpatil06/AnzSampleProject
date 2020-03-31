package com.anz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anz.model.AccountDetails;

@Repository
public class AccountDetailsRepository {
	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<AccountDetails> getAccountDetais() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from AccountDetails");
		List<AccountDetails> list = query.getResultList();
		currentSession.close();
		return list;

	}

}
