package model;

public class ContaCorrente {
	private double saldo;
	private int numero;
	private String nome_cliente;
	private double limite_saque;
	private boolean situacao_conta = true;

	public ContaCorrente(double saldo, int numero, String nome_cliente, double limite_saque, boolean situacao_conta) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.nome_cliente = nome_cliente;
		this.limite_saque = limite_saque;
		this.situacao_conta = situacao_conta;
	}

	public void sacar(double valor) {
		if(valor>this.limite_saque) 
			System.out.println("\nNÃO AUTORIZADO, VALOR MAIOR QUE O LIMITE DE SAQUE.\n");
		else if(valor>this.saldo)
			System.out.println("\nNÃO AUTORIZADO, O VALOR É MAIOR QUE O DISPONÍVEL EM CONTA.\n");
		else {
			this.saldo -= valor;
			System.out.println("\nSAQUE FEITO COM SUCESSO.");
		}
	}
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("\nDEPÓSITO FEITO COM SUCESSO.");
	}
	public void transferir(double valor, ContaCorrente cliente_destino) {
		if(valor>this.limite_saque) 
			System.out.println("\nNÃO AUTORIZADO, VALOR MAIOR QUE O LIMITE DA CONTA.\n");
		else if(valor>this.saldo)
			System.out.println("\nNÃO AUTORIZADO, O VALOR É MAIOR QUE O DISPONÍVEL EM CONTA.\n");
		else {
			this.saldo -= valor;
			cliente_destino.saldo +=valor;
			System.out.println("\nTRANSFERÊNCIA FEITA COM SUCESSO.\n");
		}
	}
	public void mostrar_cliente() {
		System.out.println("\n+----------------------------+");
		System.out.println("| Cliente: "+this.nome_cliente);
		System.out.println("| Nº da conta: "+this.numero);
		System.out.println("| Saldo: R$ "+this.saldo);
		System.out.println("| Limite de saque: R$ "+this.limite_saque);
		System.out.println("+----------------------------+\n");
	}
	
	public double getSaldo() {
		return saldo;
	}
	public int getNumero() {
		return numero;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public double getLimite_saque() {
		return limite_saque;
	}
	public boolean isSituacao_conta() {
		return situacao_conta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public void setLimite_saque(float limite_saque) {
		this.limite_saque = limite_saque;
	}
	public void setSituacao_conta(boolean situacao_conta) {
		this.situacao_conta = situacao_conta;
	}
}