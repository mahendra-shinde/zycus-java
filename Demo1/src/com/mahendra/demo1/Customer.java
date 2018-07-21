package com.mahendra.demo1;

public class Customer {
	private int customerId;
	private String name;
	private Account[] accounts;
	private int index=-1;
	
	private static final int MAX_ACCOUNTS=10;
	
	public Customer(int customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.accounts = new Account[MAX_ACCOUNTS];
	}
	
	public void addAccount(Account account) {
		if(index>=MAX_ACCOUNTS) {
			System.out.println("Cannot add more accounts!!");
		}else {
			this.accounts[++index]=account;
		}
	}

	public void printAccountSummary() {
		System.out.println("Name : "+name);
		for(int i=0;i<=index;i++) {
			Account a = accounts[i];
			System.out.println(">> "+a);
		}
	}
}

