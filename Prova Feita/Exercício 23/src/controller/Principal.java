package controller;
import java.util.Date;
import java.util.Scanner;
import model.*;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int numero_nota, atraso;
		Date data_compra;
		String nome_comprador, telefone, cpf;
		double valor_compra, novo_valor;
		
		System.out.printf("\nPara instanciar uma nota fiscal, informe o número da nota (Somente dígitos): ");
		numero_nota = ler.nextInt();
		
		data_compra = new Date();
		
		System.out.printf("Informe o valor da compra: ");
		valor_compra = ler.nextDouble();
		
		System.out.printf("Informe o nome do comprador: ");
		ler.nextLine();
		nome_comprador = ler.nextLine();
		
		System.out.printf("Informe o telefone [(##) # ####-####]: ");
		telefone = ler.nextLine();
		
		System.out.printf("Informe o CPF (Somente dígitos): ");
		cpf = ler.nextLine();
		
		Nota_fiscal nota = new Nota_fiscal(numero_nota, data_compra, valor_compra, nome_comprador, telefone, cpf);
		
		System.out.printf("\nInforme quantos dias o pagamento está em atraso: ");
		atraso = ler.nextInt();
		
		novo_valor = nota.novo_valor(atraso);
		
		System.out.printf("\n\nDevido ao atraso de %d dias, o valor da conta que era de R$ %.2f agora passará a ser R$ %.2f", atraso, valor_compra, novo_valor);
	}
}