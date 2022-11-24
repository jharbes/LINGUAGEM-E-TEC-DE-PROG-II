package entities;

public final class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= this.getLoanLimit()) {
			this.balance = amount - 10.0;
			System.out.println("DEPOSITO DE EMPRÉSTIMO EFETUADO NO VALOR DE +$" + String.format("%.2f", amount));
			System.out.println("DESCONTO DE TAXA DE EMPRÉSTIMO NO VALOR DE -$10,00\n");
		} else
			System.out.println("VALOR DE EMPRÉSTIMO NÃO DISPONÍVEL.");
	}

	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount); // copia o metodo da superclasse e alem dele todos os parametros que vem abaixo:
		this.balance -= 2.0;
		System.out.println("$2,00 EXTRA TAX CHARGED FOR WITHDRAW ON BUSINESS ACCOUNT");
		System.out.println("NEW BALANCE = $" + String.format("%.2f", this.getBalance()) + "\n");
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	@Override
	public String toString() {
		return super.toString()+"BusinessAccount [loanLimit=" + loanLimit + ", balance=" + balance + "]";
	}

}

