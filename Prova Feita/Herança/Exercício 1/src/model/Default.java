package model;

public class Default {

	public static Barco Cria_barco() {
		return new Barco(false, false, "543126789");
	}
	
	public static Aviao Cria_aviao() {
		return new Aviao(false, false, "312854679");
	}

	public static Automovel Cria_Automovel() {
		return new Automovel(false, false, 134521976, "GYT 4B64");
	}
}