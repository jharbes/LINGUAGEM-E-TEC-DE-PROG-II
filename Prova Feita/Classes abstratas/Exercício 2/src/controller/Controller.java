package controller;

import java.util.ArrayList;
import model.*;

public class Controller {

	public static void main(String[] args) {
		ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
		
		Automovel aut = new Automovel("PBA2A19","6543813163849");
		lista.add(aut);
		
		Aviao aviao = new Aviao("7324569");
		lista.add(aviao);
		
		Barco barco = new Barco("646HJAF6498");
		lista.add(barco);
		
		for (Veiculo item:lista) {
			System.out.println(item.Ligar());
			System.out.println(item.Desligar());
			System.out.println(item.MoverFrente());
			System.out.println(item.MoverRe()+"\n");
		}
	}
}