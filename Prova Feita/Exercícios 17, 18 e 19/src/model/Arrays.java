package model;

public class Arrays {
	
	public static int [] crescente(int v[]){
		int auxiliar, fim = v.length;
		boolean troca=true;
		
		while(troca==true){
			troca=false;
			fim--;
			for(int i=0 ; i < fim; i++){

				if(v[i]>v[i+1]){
					auxiliar = v[i];
					v[i] = v[i+1];
					v[i+1] = auxiliar;
					troca=true;
				}
			}
		}
		return v;
	}
	
	public static int [] decrescente(int v[]){
		int auxiliar, fim = v.length;
		boolean troca=true;
		
		while(troca==true){
			troca=false;
			fim--;
			for(int i=0 ; i < fim; i++){

				if(v[i]<v[i+1]){
					auxiliar = v[i];
					v[i] = v[i+1];
					v[i+1] = auxiliar;
					troca=true;
				}
			}
		}
		return v;
	}
	
	public static String inverte_texto(String texto) {
		String retorno="";
		for(int i = texto.length()-1; i >= 0 ; i--)
			retorno += texto.charAt(i);
		
		return retorno;
	}
	
	public static int maior_numero(int v[]) {
		int retorno = -999999999;
		for(int i = 0; i < v.length; i++)
			if(v[i] > retorno) retorno = v[i];
		
		return retorno;
	}
	
	public static int menor_numero(int v[]) {
		int retorno = 999999999;
		for(int i = 0; i < v.length; i++)
			if(v[i] < retorno) retorno = v[i];
		
		return retorno;
	}
	
	public static int media(int v[]) {
		int media = 0;
		for(int i = 0; i < v.length; i++) media += v[i];
		
		return media/v.length;
	}
	
	public static double desvio_padrao(int v[]) {
		double retorno=0, media = media(v);
		for(int i = 0; i < v.length; i++) 
			retorno += Math.pow(Math.abs(v[i]-media), 2);
		
		return Math.sqrt(retorno/v.length);
	}
}
