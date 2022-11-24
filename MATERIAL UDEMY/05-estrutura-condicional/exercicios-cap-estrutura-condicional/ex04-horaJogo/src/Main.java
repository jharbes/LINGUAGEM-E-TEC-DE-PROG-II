import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int horaInicial,horaFinal,duracao;
		
		System.out.print("Digite a hora inicial do jogo: ");
		horaInicial=teclado.nextInt();
		
		System.out.print("Digite a hora final do jogo: ");
		horaFinal=teclado.nextInt();
		
		if (horaFinal>horaInicial)
			duracao=horaFinal-horaInicial;
		else if (horaInicial>horaFinal)
			duracao=(24-horaInicial)+horaFinal;
		else
			duracao=24;
		
		System.out.println();
		System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		
	}

}
