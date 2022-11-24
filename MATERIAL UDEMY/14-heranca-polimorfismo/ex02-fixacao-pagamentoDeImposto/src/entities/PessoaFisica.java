package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosComSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double valorImposto() {
		// TODO Auto-generated method stub
		return (this.getRendaAnual() < 20000.0 ? this.getRendaAnual() * 0.15 - this.getGastosComSaude() * 0.5
				: this.getRendaAnual() * 0.25 - this.getGastosComSaude() * 0.5) > 0
						? (this.getRendaAnual() < 20000.0 ? this.getRendaAnual() * 0.15 - this.getGastosComSaude() * 0.5
								: this.getRendaAnual() * 0.25 - this.getGastosComSaude() * 0.5)
						: 0.0;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public String toString() {
		return super.toString() + "PessoaFisica [gastosComSaude=" + gastosComSaude + "]";
	}

}
