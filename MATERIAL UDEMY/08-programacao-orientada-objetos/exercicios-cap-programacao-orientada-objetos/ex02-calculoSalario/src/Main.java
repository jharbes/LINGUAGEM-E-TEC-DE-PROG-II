import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		Funcionario f1=new Funcionario();
		
		System.out.print("Name: ");
		f1.nome=teclado.nextLine();
		System.out.print("Gross salary: ");
		f1.salarioBruto=teclado.nextDouble();
		System.out.print("Tax: ");
		f1.imposto=teclado.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+f1.nome+", $ "+String.format("%.2f",f1.salarioLiquido()));
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		
		f1.aumentoSalario(teclado.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: "+f1.nome+", $ "+String.format("%.2f",f1.salarioLiquido()));
	}

}
