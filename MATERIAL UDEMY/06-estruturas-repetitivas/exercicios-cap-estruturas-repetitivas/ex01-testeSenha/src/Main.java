import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		String senha;
		
		System.out.println("Digite a senha:");
		senha=teclado.next();
		
		while (!senha.equals("2002")) {
			System.out.println("Senha Inválida");
			System.out.println("Nova tentativa para a senha:");
			senha=teclado.next();
		}
		
		if (senha.equals("2002"))
			System.out.println("Acesso Permitido");
	}

}
