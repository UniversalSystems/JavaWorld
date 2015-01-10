package com.mysystems.tree.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mysystems.tree.domain.Account;

@Repository
public class AccountDao extends BaseDao {
	@Transactional
	public Account create(Account account) {
		getEntityManager().persist(account);
		return account;
	}

	@Transactional
	public Account update(Account account) {
		getEntityManager().merge(account);
		return account;

	}
	
	@Transactional
	public Account get(Account account) {
		return getEntityManager().find(Account.class,account.getAcctNumber());
		
	}

}
