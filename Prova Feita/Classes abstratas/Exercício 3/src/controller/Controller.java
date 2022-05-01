package controller;

import java.util.ArrayList;
import model.Default;
import model.Publicacao;

public class Controller {

	public static void main(String[] args) {
		Default.controller();
		ArrayList<Publicacao> publicacao = new ArrayList<Publicacao>();
		
		publicacao.add(Default.controller_teses());
		publicacao.add(Default.controller_livro());
		publicacao.add(Default.controller_artigo());
		
		for (Publicacao p:publicacao) p.imprimirInformacoes();
	}
}