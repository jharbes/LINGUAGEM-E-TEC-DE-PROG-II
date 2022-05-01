package controller;
import model.*;

public class Principal {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.setModelo("Ford ka+");
		carro1.setCor("Branco");
		carro1.setAno(2015);
		
		carro1.correr(252);
		System.out.println("Em um primeiro momento, o carro 1 percorreu: "+carro1.getQuilometragem_total()+" km");
		carro1.correr(162);
		System.out.println("Em outro momento, o carro 1 percorreu a distância de "+carro1.getQuilometragem_total()+" km");
		
		// tempo em horas e velocidade em km/h
		System.out.println("\nCom a velocidade de 80 km/h e levando 2 horas, o carro 1 percorreu a distancia de: "+carro1.retorna_distancia(2, 80)+" km");
		
		Carro carro2 = new Carro();
		carro2.setModelo("Siena");
		carro2.setCor("Prata");
		carro2.setAno(2017);
		
		carro2.correr(58);
		System.out.println("\n\nEm um primeiro momento, o carro 2 percorreu: "+carro2.getQuilometragem_total()+" km");
		carro2.correr(88);
		System.out.println("Em outro momento, o carro 2 percorreu a distância de "+carro2.getQuilometragem_total()+" km");
		
		// tempo em horas e velocidade em km/h		
		System.out.println("\nCom a velocidade de 120 km/h e levando 3 horas, o carro 2 percorreu a distancia de: "+carro2.retorna_distancia(3, 120)+" km");
	}
}