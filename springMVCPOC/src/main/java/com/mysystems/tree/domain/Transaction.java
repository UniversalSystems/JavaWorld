package com.mysystems.tree.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.springframework.stereotype.Component;

/**
 * Entity implementation class for Entity: Transaction
 *
 */
@Entity
@Component
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long tranId;
	
	BigDecimal tranAmount;
    TranType tranType;
    String comment;
    @ManyToOne
    Account account;
   	Date tranDate;
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tranId == null) ? 0 : tranId.hashCode());
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
		if (!(obj instanceof Transaction)) {
			return false;
		}
		Transaction other = (Transaction) obj;
		if (tranId == null) {
			if (other.tranId != null) {
				return false;
			}
		} else if (!tranId.equals(other.tranId)) {
			return false;
		}
		return true;
	}

	
	
	@ManyToOne
	@JoinColumn(name = "acctNumber")
	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}

	
    
    public Long getTranId() {
		return tranId;
	}


	public void setTranId(Long tranId) {
		this.tranId = tranId;
	}


	


	public Date getTranDate() {
		return tranDate;
	}


	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}


	public BigDecimal getTranAmount() {
		return tranAmount;
	}


	public void setTranAmount(BigDecimal tranAmount) {
		this.tranAmount = tranAmount;
	}


	public TranType getTranType() {
		return tranType;
	}


	public void setTranType(TranType tranType) {
		this.tranType = tranType;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	
    
	
	public Transaction() {
		super();
	}
	
	
	
	
   
}
