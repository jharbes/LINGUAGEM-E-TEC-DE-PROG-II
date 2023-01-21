package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Locacao {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	private String nome;
	private Date retirada;
	private Date retorno;
	private float precoPorHora;
	private float precoPorDia;

	public Locacao() {
	}

	public Locacao(String nome, Date retirada, Date retorno, float precoPorHora, float precoPorDia) {
		super();
		this.nome = nome;
		this.retirada = retirada;
		this.retorno = retorno;
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
	}

	private long duracao() {
		return retorno.getTime() - retirada.getTime();
	}

	public float valorLocacao() {
		if (this.duracao() > 3600000 * 12) {
			TimeUnit time = TimeUnit.DAYS;
			long diasLocacao = time.convert(this.duracao(), TimeUnit.MILLISECONDS);
			// System.out.println("A diferenca em dias eh : " + (diasLocacao + 1));
			diasLocacao = this.duracao() % 3600000 * 24 > 0 ? diasLocacao + 1 : diasLocacao;
			return this.precoPorDia * (diasLocacao > 0 ? diasLocacao : diasLocacao + 1);
		} else {
			TimeUnit time = TimeUnit.HOURS;
			long horasLocacao = time.convert(this.duracao(), TimeUnit.MILLISECONDS);
			horasLocacao = this.duracao() % 3600000 > 0 ? horasLocacao + 1 : horasLocacao;
			// System.out.println("A diferenca em horas eh: " + (horasLocacao));
			return this.precoPorHora * horasLocacao;
		}
	}

	public float valorImposto() {
		return (float) (this.valorLocacao() >= 100.0 ? this.valorLocacao() * 0.15 : this.valorLocacao() * 0.2);
	}

	public float valorLocacaoComImposto() {
		return (float) (this.valorLocacao() >= 100.0 ? this.valorLocacao() * 1.2 : this.valorLocacao() * 1.15);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getRetirada() {
		return retirada;
	}

	public void setRetirada(Date retirada) {
		this.retirada = retirada;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public float getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(float precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

	public float getPrecoPorDia() {
		return precoPorDia;
	}

	public void setPrecoPorDia(float precoPorDia) {
		this.precoPorDia = precoPorDia;
	}

}
