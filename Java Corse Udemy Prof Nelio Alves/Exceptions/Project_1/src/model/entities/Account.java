package model.entities;

import model.exceptions.AccountExceptions;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number        = number;
		this.holder        = holder;
		this.balance       = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > getWithDrawLimit()) {
			throw new AccountExceptions("The amount exceeds withdraw limit");
		}
		if (amount > getBalance()) {
			throw new AccountExceptions("Not enough balance");
		}
		balance -= amount;

	}

	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f", balance);
	}

}
