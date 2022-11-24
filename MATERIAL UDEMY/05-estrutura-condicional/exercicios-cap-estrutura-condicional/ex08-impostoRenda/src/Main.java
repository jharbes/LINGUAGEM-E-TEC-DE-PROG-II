import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		float salario,imposto;
		
		System.out.println("Digite o valor do salário:");
		salario=teclado.nextFloat();
		
		if (salario<=2000)
			System.out.println("Isento");
		else if(salario<=3000)
			System.out.printf("R$ %.2f",(salario-2000)*0.08);
		else if(salario<=4500)
			System.out.printf("R$ %.2f",(salario-3000)*0.18+1000*0.08);
		else
			System.out.printf("R$ %.2f",(salario-4500)*0.28+1500*0.18+1000*0.08);
	}

}
