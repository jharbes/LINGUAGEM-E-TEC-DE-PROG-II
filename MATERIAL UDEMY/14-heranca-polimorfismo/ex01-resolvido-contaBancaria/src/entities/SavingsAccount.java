package entities;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		System.out.println("SALDO ATUALIZADO DE JUROS EM +$"
				+ String.format("%.2f", this.balance * this.getInterestRate()) + "\n");
		this.balance += this.balance * this.getInterestRate();
	}

	@Override
	public final void withdraw(Double amount) {
		this.balance = this.getBalance() - amount;
		System.out.println("WITHDRAW VALUE: -$" + String.format("%.2f", amount));
		System.out.println("NO TAXES CHARGED FOR WITHDRAW");
		System.out.println("NEW BALANCE = $" + String.format("%.2f", this.getBalance()) + "\n");
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return super.toString()+"SavingsAccount [interestRate=" + interestRate + ", balance=" + balance + "]";
	}

}
