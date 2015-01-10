package com.mysystems.tree.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import com.mysystems.tree.domain.Account;
import com.mysystems.tree.domain.Transaction;

public interface AccountService {
    int  create(Account acct);
	int delete(Account acct);
	BigDecimal addAmount(Account acct, BigDecimal amount);
	BigDecimal withdrawAmount(Account acct, BigDecimal amount );
	Set<Transaction> getTransactions(Account acct, Date firstdate, Date lastDate);

}
