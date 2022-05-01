package controller;
import model.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int[] array = new int [5];
		String texto;
		
		System.out.println("Preencha um array de 5 posi��es.\n");
		
		for(int i = 0; i < array.length; i++){
			System.out.printf("Informe um n�mero para a "+(i+1)+"� posi��o do array: ");
			array[i] = ler.nextInt();
		}
		
		System.out.printf("\nInsira um texto qualquer para que seja invertido: ");
		ler.nextLine();
		texto = ler.nextLine();
		
		texto = Arrays.inverte_texto(texto);
		System.out.println("\n\nTexto invertido: "+texto);
		
		array = Arrays.crescente(array);
		
		System.out.printf("Array ordenado de forma crescente: ");
		for(int i = 0; i < array.length; i++) System.out.printf(array[i]+" ");
		
		array = Arrays.decrescente(array);
		
		System.out.printf("\nArray ordenado de forma decrescente: ");
		for(int i = 0; i < array.length; i++) System.out.printf(array[i]+" ");
		
		System.out.println("\nO maior valor do array �: "+Arrays.maior_numero(array));
		System.out.println("O menor valor do array �: "+Arrays.menor_numero(array));
		System.out.println("A m�dia dos valores do array �: "+Arrays.media(array));
		System.out.printf("O desvio padr�o dos valores do array �: %.2f", Arrays.desvio_padrao(array));
	}
}