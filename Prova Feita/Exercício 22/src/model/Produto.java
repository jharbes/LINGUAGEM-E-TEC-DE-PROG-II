package model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Produto {
	private static int incremento=20; // variável para fazer o controle de cada objeto gerado
	
	private int id;
	public String nome;
	public double valor_compra;
	public double valor_venda;
	public Date data_validade;
	public Fornecedor fornecedor;
	
	public int getId() {
		return id;
	}

	public Produto(String nome, double valor_compra, Date data_validade, Fornecedor fornecedor) {
		super();
		this.id = incremento++;
		this.nome = nome;
		this.valor_compra = valor_compra;
		this.valor_venda = valor_compra * 1.3;
		this.data_validade = data_validade;
		this.fornecedor = fornecedor;
	}

	public void mostra_produtos(int quantidade_no_carrinho) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.data_validade);
		
		System.out.println("+------------------------------+");
		System.out.println("| Nome: "+this.nome);
		System.out.printf("| Valor de compra: R$ %.2f\n", this.valor_compra);
		System.out.printf("| Valor de venda: R$ %.2f\n", this.valor_venda);
		System.out.println("| Data de validade: "+ calendar.get(Calendar.DAY_OF_MONTH) +"/"+ (1+calendar.get(Calendar.MONTH)) +"/"+ calendar.get(Calendar.YEAR));
		System.out.println("| Fornecedor: "+this.fornecedor.nome);
		System.out.println("| Quantidade no carrinho: "+quantidade_no_carrinho);
		System.out.println("+------------------------------+");
	}
	
	public void mostra_produtos() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.data_validade);
		
		System.out.println("+------------------------------+");
		System.out.println("| Nome: "+this.nome);
		System.out.printf("| Valor de compra: R$ %.2f\n", this.valor_compra);
		System.out.printf("| Valor de venda: R$ %.2f\n", this.valor_venda);
		System.out.println("| Data de validade: "+ calendar.get(Calendar.DAY_OF_MONTH) +"/"+ (1+calendar.get(Calendar.MONTH)) +"/"+ calendar.get(Calendar.YEAR));
		System.out.println("| Fornecedor: "+this.fornecedor.nome);
		System.out.println("+------------------------------+");
	}
	
	public static Produto buscar_produto(ArrayList<Produto> produtos, int id) {
		Produto p = null;
		for(int i = 0; i < produtos.size(); i++)
			if(produtos.get(i).id==id)
				p = produtos.get(i);
		return p;
	}
}