package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.*;

public class Principal {

	static ArrayList<Produto> produtos = new ArrayList<Produto>();
	public static void main(String[] args) {
		
		cad_obj_default();
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Carrinho carrinho = new Carrinho();
		
		// inserindo manualmente um item no carrinho para o mesmo já vir preenchido natela 
		carrinho.itens.add(produtos.get(1));
		carrinho.qtde_por_item.add(2);
		
		int op;
		
		do {
			mostrar_menu(carrinho);
			op = ler.nextInt();
			switch(op) {
				case 1:
					int id_produto_escolhido, qtde, controle=0;
					System.out.println("\nProdutos disponíveis.\n");
					
					for(int i = 0; i < produtos.size(); i++)
						if(!carrinho.isset_in_car(i, produtos)) {
							System.out.println("\nIdentificação do produto: "+produtos.get(i).getId());
							produtos.get(i).mostra_produtos();
							controle++;
						}
					
					if(controle>0) {
						System.out.printf("\nInforme a identificação do produto que deseja adicionar ao carrinho: ");
						id_produto_escolhido = ler.nextInt();
						
						Produto p = Produto.buscar_produto(produtos, id_produto_escolhido);
						
						if(p!=null) {
							Date date = new Date();
							
							if( date.before(p.data_validade) ) {
								System.out.printf("\nInforme a quantidade deste produto que deseja inserir no carrinho: ");
								qtde = ler.nextInt();
								
								carrinho.adicionar_no_carrinho(p, qtde);
							}else 
								System.out.println("\nO PRODUTO INFORMADO SE ENCONTRA FORA DA VALIDADE.\n");
						}else
							System.out.println("\nO PRODUTO INFORMADO NÃO FOI ENCONTRADO.\n");
					}else 
						System.out.println("\nTODOS OS PRODUTOS JÁ ESTÃO NO SEU CARRINHO DE COMPRAS.\n");
					break;
					
				case 2:
					if(carrinho.itens.size()!=0) {
						System.out.println("\nEstes são os produtos contidos no seu carrinho.\n");
						
						for(int i = 0; i < carrinho.itens.size(); i++) {
							System.out.println("\nIdentificação do produto: "+carrinho.itens.get(i).getId());
							carrinho.itens.get(i).mostra_produtos(carrinho.qtde_por_item.get(i));
						}
						System.out.println("\n");
						try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					}else 
						System.out.println("\nO CARRINHO ESTÁ VAZIO.\n");
					
					break;
				case 3:
					int id_produto;
					System.out.println("\n");
					
					for(Produto produto:carrinho.itens) {
						System.out.println("\nProduct identification: "+produto.getId());
						produto.mostra_produtos();
					}
					
					System.out.printf("\nInforme a identificação do produto que deseja exluir do carrinho: ");
					id_produto = ler.nextInt();
					
					Produto p = Produto.buscar_produto(carrinho.itens, id_produto);
					
					if(p!=null) 
						carrinho.excluir(p);
					else
						System.out.println("\nO PRODUTO INFORMADO NÃO FOI ENCONTRADO.\n");
					
					System.out.println("\n");
					break;
				case 0:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
					System.out.println("|        PROGRAMA ENCERRADO        |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+\n");
					break;
				default:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
					System.out.println("|          OPÇÃO INVÁLIDA          |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+\n");
					break;
			}
		}while(op!=0);
	}
	
	public static void mostrar_menu(Carrinho carrinho) {
		System.out.println("+----------------------------------+");
		System.out.println("| BEM VINDO AO CARRINHO DE COMPRAS |");
		System.out.println("+----------------------------------+");
		System.out.printf("| INFO - Total: R$ %.2f  Itens: %d \n",carrinho.retorna_total(), carrinho.qtde_itens_carrinho());
		System.out.println("| Quantidade total de itens: "+carrinho.qtde_total_itens());
		System.out.println("+----------------------------------+");
		System.out.println("1 - Adicionar ao carrinho.");
		System.out.println("2 - Mostrar carrinho.");
		System.out.println("3 - Excluir do carrinho.");
		System.out.println("0 - Sair do sistema.");
		System.out.printf("\nInforme sua opção: ");
	}
	
	public static void cad_obj_default() {
		Endereco endereco1 = new Endereco("Rua carmela dutra", 648, "23465-857", "Rio de Janeiro");
		Endereco endereco2 = new Endereco("Av. Marechal Rondon", 871, "13087-561", "Rio de Janeiro");
		
		Fornecedor fornecedor1 = new Fornecedor("Nestlé", "(21) 2134-5869", "54.136.023/0001-88", endereco1);
		Fornecedor fornecedor2 = new Fornecedor("Qualy", "(21) 2581-3217", "13.250.467/0852-74", endereco2);
		
		
		@SuppressWarnings("deprecation")
		Date date = new Date(122, 1, 15); // usando esta função em desuso para facilitar a alocação de data de validade
		Produto produto1 = new Produto("Nescau", 11.22, date, fornecedor1);
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(121, 6, 28);
		Produto produto2 = new Produto("Requeijão", 5.69, date2, fornecedor1);
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date(122, 10, 22); // Este objeto terá a data de validade vencida propositalmente
		Produto produto3 = new Produto("Margarina", 8.29, date3, fornecedor2);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
	}
}