package com.mysystems.tree.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long acctNumber;
	String firstName;
	String lastName;
	String Address;
	AcctType acctType;
	@Transient
	Set<Transaction> tranSet = new HashSet<Transaction>();
	
	@OneToMany(mappedBy ="account")
	public Set<Transaction> getTranSet() {
		return tranSet;
	}
	
	public void setTranSet(Set<Transaction> tranSet) {
		this.tranSet = tranSet;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((acctNumber == null) ? 0 : acctNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Account)) {
			return false;
		}
		Account other = (Account) obj;
		if (acctNumber == null) {
			if (other.acctNumber != null) {
				return false;
			}
		} else if (!acctNumber.equals(other.acctNumber)) {
			return false;
		}
		return true;
	}
	BigDecimal amount;
	
	public Long getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(Long acctNumber) {
		this.acctNumber = acctNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public AcctType getAcctType() {
		return acctType;
	}
	public void setAcctType(AcctType acctType) {
		this.acctType = acctType;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
