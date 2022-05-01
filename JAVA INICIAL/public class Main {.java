import java.util.Scanner;

public class DivisaoDeNumeros {

	public static void main(String[] args) {
		//Criamos um objeto Scanner para capturar o que foi digitado
		Scanner input = new Scanner(System.in);
		//Imprime mensagem para a inserção do primeiro valor
		System.out.println("Insira o valor do dividendo: ");
		//Guarda o valor digitado pelo usuário na variável dividendo
		int dividendo = input.nextInt();
		//Imprime mensagem para a inserção do segundo valor
		System.out.println("Insira o valor do divisor: ");
		//Guarda o valor digitado pelo usuário na variável divisor
		int divisor = input.nextInt();
		
		//Verifica se o valor do divisor é igual a zero
		if (divisor == 0) {
			//Imprime o valor -1 caso o divisor seja zero
			System.out.println("-1");
		}
		//Verifica se o valor do cálculo da divisão é negativo
		else if ((dividendo / divisor < 0)) {
			//Imprime o valor 0 caso o resultdo da divisão seja negativo
			System.out.println("Valor encontrado: 0");
		}
		else {
			//Como o divisor não é zero e o cálculo não é negativo, imprime o resultado da divisão
			System.out.println("Valor calculado: " + dividendo / divisor);
		}
	}
}