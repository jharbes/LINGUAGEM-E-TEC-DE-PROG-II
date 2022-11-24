import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		Aluno a1=new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		a1.nome=teclado.nextLine();
		System.out.println("Digite a nota do primeiro trimestre:");
		a1.n1=teclado.nextDouble();
		System.out.println("Digite a nota do segundo trimestre:");
		a1.n2=teclado.nextDouble();
		System.out.println("Digite a nota do terceiro trimestre:");
		a1.n3=teclado.nextDouble();
		
		a1.status();
		teclado.close();
		
	}

}
