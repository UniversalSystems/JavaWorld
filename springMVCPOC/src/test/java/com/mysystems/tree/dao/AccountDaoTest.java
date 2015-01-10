package com.mysystems.tree.dao;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mysystems.tree.domain.Account;
import com.mysystems.tree.domain.AcctType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:spring/security-app-context.xml", "classpath:spring/appServlet/servlet-context.xml"})
public class AccountDaoTest {
	@Autowired
	AccountDao acctDao; 
	@Autowired
	Account acct;
	@Test
		public void testCreate() {
		acct.setFirstName("Ram");
		acct.setLastName("Singh");
		acct.setAcctType(AcctType.SAVING);
		acct.setAddress("Delhi");
		acctDao.create(acct);
	}
	
	@Test
	public void testUpdate() {
		acct.setAcctNumber(1L);
		Account acctTemp = acctDao.get(acct);
		acctTemp.setAddress("New Delhi");
		acctDao.update(acct);
		assertEquals(acctDao.get(acct).getAddress(), "New Delhi");
	}
	
	@Test
	public void testGet() {
		acct.setAcctNumber(1L);
		Account acctTemp = acctDao.get(acct);
		assertEquals(1L, (long)acctTemp.getAcctNumber());
	}
	

}
