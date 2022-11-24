package entities;


public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private float saldoConta;
	
	public ContaBancaria(int numeroConta, String nomeTitular, float saldoConta) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldoConta = saldoConta;
		System.out.println("Account data:");
		System.out.println("Account "+this.getNumeroConta()+", Holder: "+this.getNomeTitular()
							+", Balance: $ "+String.format("%.2f",this.getSaldoConta()));
	}

	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		System.out.println("Account data:");
		System.out.println("Account "+this.getNumeroConta()+", Holder: "+this.getNomeTitular()
							+", Balance: $ "+String.format("%.2f",this.getSaldoConta()));
	}
	
	private void statusConta() {
		System.out.println("Update account data:");
		System.out.println("Account "+this.getNumeroConta()+", Holder: "+this.getNomeTitular()
							+", Balance: $ "+String.format("%.2f",this.getSaldoConta()));
	}
	
	public void saque(float valor) {
		this.setSaldoConta(this.getSaldoConta()-valor-5.0f);
		this.statusConta();
	}
	
	public void deposito(float valor) {
		this.setSaldoConta(this.getSaldoConta()+valor);
		this.statusConta();
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public float getSaldoConta() {
		return saldoConta;
	}

	private void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

	
	
}
