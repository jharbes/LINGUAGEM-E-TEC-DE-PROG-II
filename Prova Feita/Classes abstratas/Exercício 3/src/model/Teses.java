package model;

public class Teses extends Publicacao {
	public String grau;
	public String instituicao;

	public Teses(String titulo, int ano, String[] autores, String grau, String instituicao) {
		super(titulo, ano, autores);
		this.grau = grau;
		this.instituicao = instituicao;
	}

	@Override
	public void imprimirInformacoes() {
		String autores_aux = this.autores[0];
		
		if (this.autores.length>1)
			for(int i=1; i < this.autores.length; i++)
				autores_aux += ", "+this.autores[i];
		
		System.out.println("\n+---------------------- TESE ---------------------+");
		System.out.println("| T?tulo: "+this.titulo);
		System.out.println("| Ano: "+this.ano);
		System.out.println("| Autores: "+autores_aux);
		System.out.println("| Grau: "+this.grau);
		System.out.println("| Institui??o: "+this.instituicao);
		System.out.println("+-------------------------------------------------+");
	}
}