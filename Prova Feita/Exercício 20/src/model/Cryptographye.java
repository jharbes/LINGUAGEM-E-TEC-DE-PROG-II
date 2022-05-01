package model;

public class Cryptographye {
	
	public static void encrypt(String palavra) {
		int [] p_ascii = new int[palavra.length()];
		
		for(int i = 0; i < palavra.length(); i++) {
			p_ascii[i] = palavra.charAt(i);
			
			if(p_ascii[i]!=32) {
				p_ascii[i] = p_ascii[i] + 3; // se o caractere for 32 (espaço) ele não soma 3 caracteres pra frente
				
				// if pra ver se vai passar da letra Z, aí ele pega as primeiras letras
				if( (p_ascii[i]>122) || ( p_ascii[i]>90 && p_ascii[i]<97))
					p_ascii[i] = p_ascii[i] - 26;
			}
			
		}
		
		System.out.printf("\nPALAVRA ENCRIPTADA: ");
		for (int i = 0; i < p_ascii.length; i++) System.out.printf("%c", p_ascii[i]);
		System.out.println();
	}
	
	public static void decrypt(String palavra) {
		int [] p_ascii = new int[palavra.length()];
		
		for(int i = 0; i < palavra.length(); i++) {
			p_ascii[i] = palavra.charAt(i);
			
			if(p_ascii[i]!=32) {
				p_ascii[i] = p_ascii[i] - 3; // se o caractere for 32 (espaço) ele não soma 3 caracteres pra frente
				
				// if pra ver se vai passar da letra Z, aí ele pega as primeiras letras
				if( (p_ascii[i]<65) || ( p_ascii[i]<97 && p_ascii[i]>90))
					p_ascii[i] = p_ascii[i] + 26;
			}
			
		}
		
		System.out.printf("\nPALAVRA DESENCRIPTADA: ");
		for (int i = 0; i < p_ascii.length; i++) System.out.printf("%c", p_ascii[i]);
		System.out.println();
	}
}