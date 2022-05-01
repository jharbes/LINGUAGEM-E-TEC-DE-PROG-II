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
					System.out.println("\nANIMAIS DISPONÍVEIS PARA ADOÇÃO.\n");
					Animal.controller_mostrar_animais(null);
					System.out.printf("\nInforme o número da identificação do animal que irá ser adotado: ");
					id_animal = ler.nextInt();
					animal = Animal.busca_animal(id_animal);
					
					if(animal!=null) {
						System.out.println("\nESCOLHA UMA PESSOA PARA FAZER A ADOÇÃO.\n");
						Pessoa.mostrar_pessoa();
						System.out.printf("\nInforme o número da identificação da pessoa que irá fazer a adoção: ");
						id_pessoa = ler.nextInt();
						pessoa = Pessoa.verifica_pessoa(id_pessoa);
						
						if(pessoa!=null) {
							if(!FichaAdocao.verifica_cao_em_lista(animal.id)) {
								Date hoje = new Date();
								
								ficha = new FichaAdocao(hoje, animal, pessoa, Animal.calcula_distancia_datas(animal.data_entrada), animal.nutricao());
								ficha.insere_ficha();
							}else {
								System.out.printf("\nO animal selecionado já se encontra adotado."
										+ "\nDeseja trocar o animal "+animal.nome+" para o dono "+pessoa.nome+" [1] Sim [0] Não ? ");
								troca = ler.nextInt();
								if(troca==1)
									FichaAdocao.troca_adocao(pessoa);
								else
									System.out.println();
							}
						}else 
							System.out.println("\nPESSOA NÃO ENCONTRADA.\n");
						
					}else
						System.out.println("\nANIMAL NÃO ENCONTRADO.\n");
				break;
				
				case 2:
					System.out.println();
					FichaAdocao.mostrar_fichas();
					System.out.println();
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
				break;
				
				case 3:
					String nome_cao;
					System.out.printf("\nInforme o nome ou parte do nome do cão que deseja buscar: ");
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
					System.out.println("|       OPÇÃO INVÁLIDA       |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+\n");
					break;
			}
		}while(op!=0);
	}
	
	public static void mostra_menu() {
		System.out.println("+--------------------------------+");
		System.out.println("|    Bem vindo à ONG CãoNino     |");
		System.out.println("+--------------------------------+");
		System.out.println("1 - Adotar.");
		System.out.println("2 - Mostrar fichas de adoção.");
		System.out.println("3 - Buscar cachorro por nome.");
		System.out.println("4 - Buscar cachorro com mais tempo de adoção.");
		System.out.println("5 - Buscar adoções de Vira Lata.");
		System.out.println("6 - Buscar cachorros desnutridos.");
		System.out.println("7 - Buscar cachorros Vira Lata.");
		System.out.println("8 - Buscar cachorros amarelos.");
		System.out.printf("\nInforme sua opção: ");
	}
}