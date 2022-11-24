import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int tipo;
		int alcool=0;
		int gasolina=0;
		int diesel=0;
		
		System.out.println("DIGITE O TIPO DE COMBUSTÍVEL:");
		tipo=teclado.nextInt();
		
		while(tipo!=4) {
			System.out.println("DIGITE O TIPO DE COMBUSTÍVEL:");
			System.out.println("1 - Álcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - Finalizar sistema");
			System.out.print("==>");
			tipo=teclado.nextInt();
			if (tipo==1)
				alcool++;
			else if(tipo==2)
				gasolina++;
			else if (tipo==3)
				diesel++;
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Clientes que abasteceram com álcool: "+alcool);
		System.out.println("Clientes que abasteceram com gasolina: "+gasolina);
		System.out.println("Clientes que abasteceram com diesel: "+diesel);
	}

}
