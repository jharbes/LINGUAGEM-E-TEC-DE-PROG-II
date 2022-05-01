package controller;
import model.*;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Quarto q = new Quarto();
		int opcao;
		
		do {
			mostrar_menu(q);
			opcao = ler.nextInt();
			
			switch (opcao) {
				case 1: q.ligar_lampada();
					break;
				case 2: q.desligar_lampada();
					break;
				case 3: q.ligar_abajour();
					break;
				case 4: q.desligar_abajour();
					break;
				case 5:
					int mudar_velocidade, velocidade;
					if(q.ventilador>0) {
						System.out.printf("\nO ventilador já está ligado na velocidade "+ q.ventilador +
										   "\nDeseja mudar a velocidade dele [1] Sim [0] Não? ");
						mudar_velocidade = ler.nextInt();
						if(mudar_velocidade==1) {
							System.out.printf("\nInforme a velocidade: ");
							velocidade = ler.nextInt();
							q.liga_ou_desliga_ventilador(velocidade);
							System.out.println("\nVELOCIDADE ALTERADA COM SUCESSO.\n");
						}else System.out.println("\nCarregando menu...\n");
					}else {
						System.out.printf("\nO ventilador possui 3 velocidades. 1, 2 e 3. \nInforme a velocidade: ");
						velocidade = ler.nextInt();
						q.liga_ou_desliga_ventilador(velocidade);
						System.out.println("\nVENTILADOR LIGADO NA VELOCIDADE "+q.ventilador+"\n");
					}
					break;
				case 6: 
					if(q.ventilador==0) System.out.println("\nO VENTILADOR JÁ ESTÁ DESLIGADO."); 
					else { 
						System.out.println("\nO VENTILADOR FOI DESLIGADO.");
						q.liga_ou_desliga_ventilador(0); // passando a velocidade com 0 para desligar o ventilador
					}
					System.out.println("\n");
					break;
				case 7:
					int mudar_temperatura, temperatura;
					if(q.ar_condicionado) {
						System.out.printf("\nO ar condicionado já está ligado na temperatura "+ q.temperatura + "°C" +
										   "\nDeseja mudar a temperatura [1] Sim [0] Não? ");
						mudar_temperatura = ler.nextInt();
						if(mudar_temperatura==1) {
							System.out.printf("\nInforme a temperatura: ");
							temperatura = ler.nextInt();
							q.liga_ou_desliga_arcondicionado(temperatura);
							System.out.println("\nTEMPERATURA ALTERADA COM SUCESSO.\n");
						}else System.out.println("\nCarregando o menu...\n");
					}else{
						System.out.printf("\nInforme a temperatura do ar condicionado em valor inteiro (Ex.: 18, 19, etc): ");
						temperatura = ler.nextInt();
						q.liga_ou_desliga_arcondicionado(temperatura);
						System.out.println("\nAR CONDICIONADO LIGADO NA TEMPERATURA "+q.temperatura+" °C\n");
					}
					break;
				case 8:
					if(!q.ar_condicionado) System.out.println("\nO AR CONDICIONADO JÁ ESTÁ DESLIGADO.");
					else { 
						System.out.println("\nO AR CONDICIONADO FOI DESLIGADO.");
						q.liga_ou_desliga_arcondicionado(0); // passando a temperatura como 0 para desligar o ar condicionado
					}
					System.out.println("\n");
					break;
				case 9:
					int mudar_canal, canal;
					if(q.televisao>0) {
						System.out.printf("\nA televisão já está ligada no canal "+ q.televisao +
										   "\nDeseja mudar o canal dela [1] Sim [0] Não? ");
						mudar_canal = ler.nextInt();
						if(mudar_canal==1) {
							System.out.printf("\nInforme o canal: ");
							canal = ler.nextInt();
							q.liga_ou_desliga_televisao(canal);
							System.out.println("\nCANAL ALTERADO COM SUCESSO.\n");
						}else System.out.println("\nCarregando menu...\n");
					}else {
						System.out.printf("\nInforme o canal: ");
						canal = ler.nextInt();
						q.liga_ou_desliga_televisao(canal);
						System.out.println("\nA TELEVISÃO FOI LIGADA NO CANAL "+q.televisao+"\n");
					}
					break;
				case 10:
					if(q.televisao==0) System.out.println("\nA TELEVISÃO JÁ ESTÁ DESLIGADA.");
					else { 
						System.out.println("\nA TELEVISÃO FOI DESLIGADA.");
						q.liga_ou_desliga_televisao(0); // passando o canal como 0 para desligar a televisao
					}
					
					System.out.println("\n");
					break;
				case 0:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+");
					System.out.println("|       PROGRAMA ENCERRADO        |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+\n");
					break;
				default:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+");
					System.out.println("|         OPÇÃO INVÁLIDA          |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+\n");
					break;
			}
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		}while(opcao!=0);
	}
	
	public static void mostrar_menu(Quarto q) {
		String luz = (q.lampada == true) ? "Acesa": "Apagada";
		String t = (q.temperatura == 0) ? "Ambiente": q.temperatura+"°C";
		System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+");
		System.out.println("|       Bem vindo ao quarto       | Lâmpada: "+luz);
		System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+ Temperatura: "+t);
		System.out.println(" 1 - Ligar a lâmpada.");
		System.out.println(" 2 - Desligar a lâmpada.");
		System.out.println(" 3 - Ligar o abajour.");
		System.out.println(" 4 - Desligar o abajour.");
		System.out.println(" 5 - Ligar o ventilador.");
		System.out.println(" 6 - Desligar o ventilador.");
		System.out.println(" 7 - Ligar o ar condicionado.");
		System.out.println(" 8 - Desligar o ar condicionado.");
		System.out.println(" 9 - Ligar a televisão.");
		System.out.println("10 - Desligar a televisão.");
		System.out.println(" 0 - Encerrar o programa.");
		System.out.printf("Informe sua opção: ");
	}
}