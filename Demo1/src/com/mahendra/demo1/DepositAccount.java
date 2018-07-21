package com.mahendra.demo1;
import java.util.Date;

/**
 * DepositAccount represents all kind of Deposits, including Fixed or recurrings.
 * @author mahendra
 *
 */
public class DepositAccount extends Account {
	/**
	 * The total amount deposited so far.
	 * Also this is DUE from bank.
	 */
	private float totalDeposits;
	
	/**
	 * Initializes a new DepositAccount
	 * @param accountNo		Unique account number
	 * @param customerId	Unique customer-id
	 * @param openingDate	Date of Opening account
	 * @param branchCode	Branch where account is maintained
	 * @param amount		Current balance
	 */
	public DepositAccount(int accountNo, int customerId, Date openingDate, 
			int branchCode,float amount) {
		super(accountNo, customerId, openingDate, branchCode);
		this.totalDeposits=amount;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Provide string representation of account
	 */
	@Override
	public String toString() {
		return super.toString() 
				+ " DepositAccount [totalDeposits=" + totalDeposits + "]";
	}

	/**
	 * Retrieve balance
	 */
	@Override
	public float getBalance() {
		return totalDeposits;
	}
	
}
