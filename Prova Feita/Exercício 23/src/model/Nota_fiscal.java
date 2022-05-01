package model;

import java.util.Date;

public class Nota_fiscal {
	public int numero_nota;
	public Date data_compra;
	public double valor_compra;
	public String nome_comprador;
	public String endereco;
	public String telefone;
	public boolean pago;
	public String cpf;

	public Nota_fiscal(int numero_nota, Date data_compra, double valor_compra, String nome_comprador, String telefone, String cpf) {
		super();
		this.numero_nota = numero_nota;
		this.data_compra = data_compra;
		this.valor_compra = valor_compra;
		this.nome_comprador = nome_comprador;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public double novo_valor(int atraso) {
		double m = 1 + (atraso *0.95);
		return m*this.valor_compra;
	}
	
	public int getNumero_nota() {
		return this.numero_nota;
	}
	public Date getData_compra() {
		return data_compra;
	}
	public double getValor_compra() {
		return this.valor_compra;
	}
	public String getNome_comprador() {
		return this.nome_comprador;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public boolean isPago() {
		return this.pago;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setNumero_nota(int numero_nota) {
		this.numero_nota = numero_nota;
	}
	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}
	public void setValor_compra(double valor_compra) {
		this.valor_compra = valor_compra;
	}
	public void setNome_comprador(String nome_comprador) {
		this.nome_comprador = nome_comprador;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}