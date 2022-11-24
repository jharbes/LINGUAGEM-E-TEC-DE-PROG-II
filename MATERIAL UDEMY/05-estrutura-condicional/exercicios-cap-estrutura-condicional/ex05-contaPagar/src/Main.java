import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int codigo,quantidade;
		
		System.out.print("Digite o código do item consumido: ");
		codigo=teclado.nextInt();
		
		System.out.println("Digite a quantidade do item consumido: ");
		quantidade=teclado.nextInt();
		
		switch(codigo) {
			case 1:
				System.out.println("Total: R$"+4*quantidade);
				break;
			case 2:
				System.out.println("Total: R$"+4.5*quantidade);
				break;
			case 3:
				System.out.println("Total: R$"+5*quantidade);
				break;
			case 4:
				System.out.println("Total: R$"+2*quantidade);
				break;
			case 5:
				System.out.println("Total: R$"+1.5*quantidade);
			default:
				System.out.println("Item não cadastrado");
		}
	}

}
