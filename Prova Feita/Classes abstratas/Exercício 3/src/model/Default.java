package model;

public class Default {
	
	public static Pesquisa controller() {
		Coordenador cod = new Coordenador("José", "jose@email.com", "UERJ", "(21) 5461-8531", "Historiador");
		Pesquisa pesquisa = new Pesquisa("Pesquisa ação", "Ação humaitária", "12/05/2021", "27/11/2021", "Pobreza", cod);
		return pesquisa;
	}
	
	public static Teses controller_teses() {
		String [] autores = {"Paulo sodré","Henrique magahães"};
		Teses tese = new Teses("Por razões humanitárias", 2021, autores, "Ph.D", "UFRJ");
		return tese;
	}
	
	public static Livro controller_livro() {
		String [] autores = {"Paulo Magalhães"};
		Livro livro = new Livro("Humanidade em crise", 2021, autores, "UmLivro", "Rio de Janeiro");
		return livro;
	}
	
	public static Artigo_revista controller_artigo() {
		String [] autores = {"Eduardo Bispo","James Rodrigues"};
		Artigo_revista artigo = new Artigo_revista("A humanidade em questão", 2021, autores, "Associação brasileira de pesquisa", 1, 465);
		return artigo;
	}
}