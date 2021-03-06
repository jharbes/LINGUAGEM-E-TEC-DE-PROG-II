package model;

public class Livro extends Publicacao {
	
	public String editora;
	public String local_publicacao;

	public Livro(String titulo, int ano, String[] autores, String editora, String local_publicacao) {
		super(titulo, ano, autores);
		this.editora = editora;
		this.local_publicacao = local_publicacao;
	}

	@Override
	public void imprimirInformacoes() {
		String autores_aux = this.autores[0];
		
		if (this.autores.length>1)
			for(int i=1; i < this.autores.length; i++)
				autores_aux += ", "+this.autores[i];
			
		System.out.println("\n+--------------------- LIVRO ---------------------+");
		System.out.println("| T?tulo: "+this.titulo);
		System.out.println("| Ano: "+this.ano);
		System.out.println("| Autores: "+autores_aux);
		System.out.println("| Editora: "+this.editora);
		System.out.println("| Local publica??o: "+this.local_publicacao);
		System.out.println("+-------------------------------------------------+");
	}
}