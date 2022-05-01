package model;

public class Pesquisa {
	public String nome;
	public String descricao;
	public String data_inicio;
	public String data_fim;
	public String area_da_pesquisa;
	public Coordenador coordenador;
	
	public Pesquisa(String nome, String descricao, String data_inicio, String data_fim, String area_da_pesquisa,
			Coordenador coordenador) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.area_da_pesquisa = area_da_pesquisa;
		this.coordenador = coordenador;
	}
}