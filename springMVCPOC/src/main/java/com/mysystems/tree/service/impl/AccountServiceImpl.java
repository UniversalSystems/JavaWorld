package com.mysystems.tree.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysystems.tree.dao.AccountDao;
import com.mysystems.tree.domain.Account;
import com.mysystems.tree.domain.Transaction;
import com.mysystems.tree.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDao acctDao; 
	@Autowired
	Account acct;
	
	@Override
	public int create(Account acct) {
		acctDao.create(acct);
		return 1;
	}

	@Override
	public int delete(Account acct) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BigDecimal addAmount(Account acct, BigDecimal amount) {
		Account accountTemp = acctDao.get(acct);
		acct.setAmount(accountTemp.getAmount().add(amount));
		acctDao.update(acct);
		return acct.getAmount();
	}

	@Override
	public BigDecimal withdrawAmount(Account acct, BigDecimal amount) {
		Account accountTemp = acctDao.get(acct);
		acct.setAmount(accountTemp.getAmount().subtract(amount));
		acctDao.update(acct);
		return acct.getAmount();
	}

	@Override
	public Set<Transaction> getTransactions(Account acct, Date firstdate,
			Date lastDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
