import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numeroFuncionario, horasTrabalhadas;
		float valorDaHora;

		System.out.print("Digite o n�mero do funcion�rio: ");
		numeroFuncionario = teclado.nextInt();

		System.out.print("Digite o n�mero de horas trabalhadas: ");
		horasTrabalhadas = teclado.nextInt();

		System.out.println("Digite o valor da hora trabalhada deste funcion�rio: ");
		valorDaHora = teclado.nextFloat();

		System.out.printf("%nO n�mero do funcion�rio � %d e seu sal�rio � R$%.2f.", numeroFuncionario,
				horasTrabalhadas * valorDaHora);
	}

}
