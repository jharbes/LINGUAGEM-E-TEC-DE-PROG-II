import java.util.Scanner;

import entities.Quarto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n=teclado.nextInt();
		
		Quarto vetor[]=new Quarto[10];
		String nome,email;
		int room;
		
		
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Rent #"+(i+1)+":");
			System.out.print("Name: ");
			teclado.nextLine();
			nome=teclado.nextLine();
			System.out.print("Email: ");
			email=teclado.nextLine();
			System.out.print("Room: ");
			room=teclado.nextInt();
			vetor[room]=new Quarto(nome,email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]!=null)
				System.out.println(i+": "+vetor[i].getNomeHospede()+", "+vetor[i].getEmail());
		}
		
		teclado.close();
	}

}
