package controller;
import java.util.ArrayList;
import java.util.List;
import model.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// cliente pré-cadastrado no sistema
		ContaCorrente c1 = new ContaCorrente(17763.45, 146789, "Calisto Ferreira", 8000, true);
		ContaCorrente c2 = new ContaCorrente(5600, 316457, "Antonio Coutinho", 4500, true);
		ContaCorrente c3 = new ContaCorrente(3500, 468251, "Guimarães Oliveira", 2800, true);
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		ContaCorrente c;
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		int op;
		double valor;
		
		do {
			mostrar_menu();
			op = ler.nextInt();
			
			switch(op) {
				case 1:
					int numero_conta;
					String nome_cliente;
					double saldo, limite_saque;
					
					System.out.printf("\nInforme o nome do cliente: ");
					ler.nextLine();// este nextLine é para evitar que o sistema passe direto
					nome_cliente = ler.nextLine();
					System.out.printf("Informe o número da conta: ");
					numero_conta = ler.nextInt();
					System.out.printf("Informe o saldo: ");
					saldo = ler.nextDouble();
					System.out.printf("Informe o limite de saque: ");
					limite_saque = ler.nextDouble();
					
					c = new ContaCorrente(saldo, numero_conta, nome_cliente, limite_saque, false);
					contas.add(c);
					
					System.out.println("\n\nCLIENTE CADASTRADO.");
					c.mostrar_cliente();
					
					try { Thread.sleep (3000); } catch (InterruptedException ex) {}
					break;
					
				case 2:
				case 3:
				case 4:
					int cliente;
					System.out.println("\n");
					
					for(int i = 0; i < contas.size(); i++) {
						System.out.println("CLIENTE NÚMERO: "+(i+1));
						contas.get(i).mostrar_cliente();
					}
					
					System.out.printf("\nInforme o número do cliente: ");
					cliente = ler.nextInt();
					
					if(cliente < 1 || cliente > contas.size())
						System.out.println("\nCLIENTE NÃO ENCONTRADO.\n");
					else {
						
						System.out.printf("\nInforme o valor: ");
						valor = ler.nextDouble();
						System.out.println();
						
						// nesta parte do código eu diferencio os cases 2, 3 e 4
						if(op==2) {
							contas.get(cliente-1).sacar(valor); // estou diminuindo 1 porque a lista começa no 0
							
						}else if(op==3) {
							contas.get(cliente-1).depositar(valor); // estou diminuindo 1 porque a lista começa no 0
							
						} else {
							int cliente_destino;
							System.out.println("\n");
							for(int i = 0; i < contas.size(); i++) {
								if(i != cliente - 1) {
									System.out.println("CLIENTE NÚMERO: "+(i+1));
									contas.get(i).mostrar_cliente();
								}
							}
							
							System.out.printf("\nAgora, informe o número do cliente que deseja enviar o valor de R$ "+valor+": ");
							cliente_destino = ler.nextInt();
							
							// estou diminuindo 1 porque a lista começa no 0
							// passando como parâmetro o cliente de destino
							contas.get(cliente-1).transferir(valor, contas.get(cliente_destino-1));
							
							System.out.println("Cliente que recebeu");
							contas.get(cliente_destino-1).mostrar_cliente();
							System.out.println("Cliente que transferiu");
						}
						
						contas.get(cliente-1).mostrar_cliente(); // estou diminuindo 1 porque a lista começa no 0
						try { Thread.sleep (4000); } catch (InterruptedException ex) {}
					}
					break;
					
				case 0:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
					System.out.println("|     PROGRAMA ENCERRADO     |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+\n");
					break;
				default:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
					System.out.println("|       OPÇÃO INVÁLIDA       |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+\n");
					break;
			}
		}while(op!=0);
	}
	
	public static void mostrar_menu(){
		System.out.println("+----------------------------+");
		System.out.println("|     Bem vindo ao banco     |");
		System.out.println("+----------------------------+\n");
		System.out.println("1 - Cadastrar conta de cliente");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("4 - Transferir");
		System.out.println("0 - Sair do sistema");
		System.out.printf("\nInforme sua opção: ");
	}
}