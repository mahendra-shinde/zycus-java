package com.mahendra.demo1;
import java.util.Date;

public abstract class Account {
	private int accountNo;
	private int customerId;
	private Date openingDate;
	private int branchCode;
	
	public Account(int accountNo, int customerId, Date openingDate, int branchCode) {
		super();
		this.accountNo = accountNo;
		this.customerId = customerId;
		this.openingDate = openingDate;
		this.branchCode = branchCode;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", branchCode=" + branchCode + "]";
	}
	
	public abstract float getBalance();
	
}
