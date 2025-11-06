package easyPayouts;

import java.util.List;

public class AccountData {
	private String accountId;
	private double balance;
	private List<Transaction> transactions;

	public AccountData(String accountId, double balance, List<Transaction> transactions) {
		this.accountId = accountId;
		this.balance = balance;
		this.transactions = transactions;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}
