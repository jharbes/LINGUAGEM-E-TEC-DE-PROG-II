package controller;
import model.Quarto;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Quarto q = new Quarto();
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		// adicionando os ventiladores
		// a casse j� � instanciada com 3 ventiladores
		// ent�o, cada posi��o do array guarda a velocidade do ventilador se ele estiver ligado 
		// caso ele esteja desligado, o valor ser� 0 ou nulo
		System.out.println("\nInforme uma velocidade para cada ventilador."
				+ "\nCada ventilador possui tr�s velocidades (1, 2 e 3) e o valor 0 indica que o ventilador est� desligado.\n");
		for(int i = 0; i < 3; i++) {
			System.out.printf("Informe a velocidade do "+(i+1)+"� vetilador (0, 1, 2 ou 3): ");
			q.ventiladores[i] = ler.nextInt();
		}
		
		System.out.println();
		for(int i = 0; i < 3; i++) {
			if(q.ventiladores[i]!=0) System.out.println("O "+(i+1)+"� ventilador est� ligado e est� na velocidade "+q.ventiladores[i]);
			else System.out.println("O "+(i+1)+"� ventilador est� desligado");
		}
	}
}