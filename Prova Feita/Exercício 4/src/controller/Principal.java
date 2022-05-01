package controller;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Contando até 10 de forma crescente e decrescente.\n\n");
		System.out.println("Crescente\t    Decrescente");
		
		for(int i=0, j=10; i<=10 ; i++, j--) 
			System.out.println("    "+i+"\t\t\t"+j+"\n");
		
		System.out.println("\n\nPrograma encerrado.");
	}
}