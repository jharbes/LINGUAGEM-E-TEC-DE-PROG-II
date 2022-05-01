package controller;
import java.util.Date;
import java.util.Scanner;

import model.*;

public class Principal {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa; Animal animal; FichaAdocao ficha;
		int op;
		
		do {
			mostra_menu();
			op = ler.nextInt();
			
			switch(op) {
				case 1:
					int id_animal, id_pessoa, troca;
					System.out.println("\nANIMAIS DISPON�VEIS PARA ADO��O.\n");
					Animal.controller_mostrar_animais(null);
					System.out.printf("\nInforme o n�mero da identifica��o do animal que ir� ser adotado: ");
					id_animal = ler.nextInt();
					animal = Animal.busca_animal(id_animal);
					
					if(animal!=null) {
						System.out.println("\nESCOLHA UMA PESSOA PARA FAZER A ADO��O.\n");
						Pessoa.mostrar_pessoa();
						System.out.printf("\nInforme o n�mero da identifica��o da pessoa que ir� fazer a ado��o: ");
						id_pessoa = ler.nextInt();
						pessoa = Pessoa.verifica_pessoa(id_pessoa);
						
						if(pessoa!=null) {
							if(!FichaAdocao.verifica_cao_em_lista(animal.id)) {
								Date hoje = new Date();
								
								ficha = new FichaAdocao(hoje, animal, pessoa, Animal.calcula_distancia_datas(animal.data_entrada), animal.nutricao());
								ficha.insere_ficha();
							}else {
								System.out.printf("\nO animal selecionado j� se encontra adotado."
										+ "\nDeseja trocar o animal "+animal.nome+" para o dono "+pessoa.nome+" [1] Sim [0] N�o ? ");
								troca = ler.nextInt();
								if(troca==1)
									FichaAdocao.troca_adocao(pessoa);
								else
									System.out.println();
							}
						}else 
							System.out.println("\nPESSOA N�O ENCONTRADA.\n");
						
					}else
						System.out.println("\nANIMAL N�O ENCONTRADO.\n");
				break;
				
				case 2:
					System.out.println();
					FichaAdocao.mostrar_fichas();
					System.out.println();
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
				break;
				
				case 3:
					String nome_cao;
					System.out.printf("\nInforme o nome ou parte do nome do c�o que deseja buscar: ");
					ler.nextLine();
					nome_cao = ler.nextLine();
					System.out.println();
					Animal.buscar_cao_nome(nome_cao);
					System.out.println();
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					break;
				
				case 4:
					System.out.println();
					FichaAdocao.maior_tempo_adocao();
					System.out.println();
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					break;
					
				case 5:
					System.out.println();
					FichaAdocao.busca_adocao_viraLata();
					System.out.println();
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					break;
				
				case 6:
					System.out.println();
					Animal.busca_caes_desnutridos();
					System.out.println();
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					break;
					
				case 7:
					System.out.println();
					Animal.busca_quantidade_caes_viraLata();
					System.out.println();
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					break;
					
				case 8:
					System.out.println();
					Animal.busca_caes_amarelos();
					System.out.println();
					try { Thread.sleep (2000);} catch (InterruptedException ex) {}
					break;
					
				case 0:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
					System.out.println("|     PROGRAMA ENCERRADO     |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+\n");
				break;
				
				default:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
					System.out.println("|       OP��O INV�LIDA       |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+\n");
					break;
			}
		}while(op!=0);
	}
	
	public static void mostra_menu() {
		System.out.println("+--------------------------------+");
		System.out.println("|    Bem vindo � ONG C�oNino     |");
		System.out.println("+--------------------------------+");
		System.out.println("1 - Adotar.");
		System.out.println("2 - Mostrar fichas de ado��o.");
		System.out.println("3 - Buscar cachorro por nome.");
		System.out.println("4 - Buscar cachorro com mais tempo de ado��o.");
		System.out.println("5 - Buscar ado��es de Vira Lata.");
		System.out.println("6 - Buscar cachorros desnutridos.");
		System.out.println("7 - Buscar cachorros Vira Lata.");
		System.out.println("8 - Buscar cachorros amarelos.");
		System.out.printf("\nInforme sua op��o: ");
	}
}