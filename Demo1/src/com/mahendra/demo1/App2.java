package com.mahendra.demo1;
import java.util.Date;

public class App2 {

	public static void main(String[] args) {
		Account account1 = new DepositAccount(10101222,5546564,new Date(),15021,25000);
		Account account2 = new LoanAccount(10101255, 5546564, new Date(), 15025, 100000);
		
		Customer customer = new Customer(5546564,"Rajiv");
		customer.addAccount(account1);
		customer.addAccount(account2);
		customer.printAccountSummary();
		
	}

}
