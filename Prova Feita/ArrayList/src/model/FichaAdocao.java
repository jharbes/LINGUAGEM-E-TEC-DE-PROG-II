package model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class FichaAdocao {
	public static ArrayList<FichaAdocao> fichas = Default.list_fichas(Animal.caes, Pessoa.pessoas);
	
	public Date data_adocao;
	public Animal animal;
	public Pessoa pessoa;
	public long tempo_permanencia; // Em dias
	public String nutricao;
	
	public FichaAdocao(Date data_adocao, Animal animal, Pessoa pessoa, long tempo_permanencia, String nutricao) {
		super();
		this.data_adocao = data_adocao;
		this.animal = animal;
		this.pessoa = pessoa;
		this.tempo_permanencia = tempo_permanencia;
		this.nutricao = nutricao;
	}
	
	public static boolean verifica_cao_em_lista(int id) {
		for(FichaAdocao ficha : fichas)
			if(ficha.animal.id==id) return true;
		return false;
	}
	
	public void insere_ficha() {
		fichas.add(this);
		System.out.println("\n+--------------------------------+");
		System.out.println("|    ADOÇÃO FEITA COM SUCESSO    |");
		System.out.println("+--------------------------------+\n");
	}
	
	public static void troca_adocao(Pessoa pessoa) {
		for(FichaAdocao ficha:fichas) 
			if(ficha.pessoa.id == pessoa.id)
				ficha.pessoa = pessoa;
		System.out.println("\n+--------------------------------+");
		System.out.println("|    OS DONOS FORAM TROCADOS     |");
		System.out.println("+--------------------------------+\n");
	}
	
	public static void mostrar_fichas(){
		Calendar calendar = Calendar.getInstance();
		System.out.println("\nFICHAS DE ADOÇÃO.\n");
		for(FichaAdocao ficha:fichas) {
			calendar.setTime(ficha.data_adocao);
			
			System.out.println("+---------------------------------");
			System.out.println("| Nome: "+ficha.animal.nome);
			System.out.println("| Dono: "+ficha.pessoa.nome);
			System.out.println("| Nutrição: "+ficha.nutricao);
			System.out.println("| Data de adoção: "+calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR));
			calendar.setTime(ficha.animal.data_entrada);
			System.out.println("| Data de entrada: "+calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR));
			System.out.println("| Permanência: "+calcula_extensao_de_dias(ficha.tempo_permanencia));
			System.out.println("+---------------------------------");
		}
	}
	
	public static void maior_tempo_adocao() {
		if(!fichas.isEmpty()) {
			Animal animal = null;
			long tempo_aux=0;
			System.out.println("ANIMAL COM MAIOR TEMPO DE ADOÇÃO.\n");
			for(FichaAdocao ficha:fichas) {
				if(Animal.calcula_distancia_datas(ficha.data_adocao)>tempo_aux){
					animal = ficha.animal;
					tempo_aux = Animal.calcula_distancia_datas(ficha.data_adocao);
				}
			}
			System.out.println("TEMPO DE ADOÇÃO: "+calcula_extensao_de_dias(tempo_aux)+"\n");
			animal.mostrar_animais();
		}else
			System.out.println("NÃO EXISTEM ANIMAIS ADOTADOS.");
	}
	
	private static String calcula_extensao_de_dias(long dias){
		long ano=0, mes=0;
		String retorno="";
		while(dias>31) {
			if(dias>365) {
				ano++;
				dias -= 365;
				
			}else if(dias>31) {
				mes++;
				dias -= 31;
			}
		}
		
		if(ano!=0) {
			if(ano>1) {
				if(mes>1) retorno = ano+" anos e "+mes+" meses";
				else retorno = ano+" anos e "+mes+" mes";
			}else {
				if(mes>1) retorno = ano+" ano e "+mes+" meses";
				else retorno = ano+" ano e "+mes+" mes";
			}
		}else {
			if(mes>1) retorno = mes+" meses";
			else retorno = mes+" mes";
		}
		
		return retorno;
	}
	
	public static void busca_adocao_viraLata() {
		ArrayList<Animal> list_animal = new ArrayList<Animal>();
		for(FichaAdocao ficha:fichas)
			if(ficha.animal.raca.toLowerCase().contentEquals("vira lata")) list_animal.add(ficha.animal);
		
		if(!list_animal.isEmpty()) {
			System.out.println("CÃES DA RAÇA VIRA LATA ENCONTRADOS NAS FICHAS DE ADOÇÃO: "+list_animal.size()+"\n");
			Animal.controller_mostrar_animais(list_animal);
		}else 
			System.out.println("NÃO FORAM ENCONTRADOS ANIMAIS DA RAÇA VIRA LATA.");
	}
}