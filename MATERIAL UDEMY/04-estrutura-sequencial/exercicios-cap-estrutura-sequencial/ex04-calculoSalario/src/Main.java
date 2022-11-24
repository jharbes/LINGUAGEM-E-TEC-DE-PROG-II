import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numeroFuncionario, horasTrabalhadas;
		float valorDaHora;

		System.out.print("Digite o número do funcionário: ");
		numeroFuncionario = teclado.nextInt();

		System.out.print("Digite o número de horas trabalhadas: ");
		horasTrabalhadas = teclado.nextInt();

		System.out.println("Digite o valor da hora trabalhada deste funcionário: ");
		valorDaHora = teclado.nextFloat();

		System.out.printf("%nO número do funcionário é %d e seu salário é R$%.2f.", numeroFuncionario,
				horasTrabalhadas * valorDaHora);
	}

}
