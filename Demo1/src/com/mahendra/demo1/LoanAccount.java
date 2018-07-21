package com.mahendra.demo1;
import java.util.Date;

public class LoanAccount extends Account {

	private float outstandingAmount;
	
	public LoanAccount(int accountNo, int customerId, Date openingDate, int branchCode,float amount) {
		super(accountNo, customerId, openingDate, branchCode);
		// TODO Auto-generated constructor stub
		this.outstandingAmount = amount;
	}

	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		return outstandingAmount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Oustanding "+outstandingAmount;
	}

}
