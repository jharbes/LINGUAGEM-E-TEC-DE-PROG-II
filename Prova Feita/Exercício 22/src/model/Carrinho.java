package model;
import java.util.ArrayList;

public class Carrinho {
	public ArrayList<Produto> itens = new ArrayList<Produto>();
	public ArrayList<Integer> qtde_por_item = new ArrayList<Integer>();
	
	public void excluir (Produto p) {
		this.qtde_por_item.remove(this.itens.indexOf(p));
		this.itens.remove(p);
		System.out.println("\nPRODUTO EXCLUÍDO COM SUCESSO.");
	}
	
	public boolean isset_in_car(int posicao, ArrayList<Produto> produtos) {
		boolean retorno=false;
		
		for(int i = 0; i < this.itens.size(); i++){
			if(produtos.get(posicao).getId()==this.itens.get(i).getId()) {
				retorno = true;
				break;
			}
		}
		return retorno;
	}
	
	public void adicionar_no_carrinho(Produto p, int qtde) {
		this.itens.add(p);
		this.qtde_por_item.add(qtde);
		
		System.out.println("\nPRODUTO INSERIDO COM SUCESSO.\n");
	}
	
	public double retorna_total() {
		double retorno=0;
		for(int i = 0; i < this.itens.size(); i++) 
			retorno += this.itens.get(i).valor_compra * this.qtde_por_item.get(i);
		
		return retorno;
	}
	
	public int qtde_total_itens() {
		int retorno=0;
		for(Integer item:this.qtde_por_item)
			retorno += item;
		return retorno;
	}
	
	public int qtde_itens_carrinho() {
		return this.itens.size();
	}
}