package model.entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		try {
		this.balance+=amount;
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void withdraw(Double amount) {
		if (amount>this.getWithdrawLimit())
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		else if (amount>this.getBalance())
			System.out.println("Withdraw error: Not enough balance");
		else {
			this.balance-=amount;
			System.out.println("New balance: "+String.format("%.2f",this.getBalance()));
		}
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
				+ withdrawLimit + "]";
	}

}
