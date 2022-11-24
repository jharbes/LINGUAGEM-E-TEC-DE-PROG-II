package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double valorImposto() {
		// TODO Auto-generated method stub
		return this.getNumeroFuncionarios() < 10 ? this.getRendaAnual() * 0.16 : this.getRendaAnual() * 0.14;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public String toString() {
		return super.toString() + "PessoaJuridica [numeroFuncionarios=" + numeroFuncionarios + "]";
	}

}
