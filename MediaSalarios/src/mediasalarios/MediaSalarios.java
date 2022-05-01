/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediasalarios;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class MediaSalarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        float media=0f;
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Informe o numero de funcionarios: ");
        n=teclado.nextInt();
        
        String[] nome=new String[n];
        float[] salario=new float[n];
        
        System.out.println("""
                           
                           Para cada funcionario informe o seu nome e o valor do seu salario.
                           """);
        
        for (int i=0;i<n;i++){
            System.out.print("NOME FUNCIONARIO[" + i + "]: ");
            nome[i]=teclado.nextLine();
            System.out.println(nome[i]);
        }
        for (int i=0;i<n;i++){
            System.out.print("\nSALARIO FUNCIONARIO[" + i + "]: ");
            salario[i]=teclado.nextFloat();
            media+=salario[i];
        }
        media/=n;
        
        System.out.println("\nA media salarial eh de R$" + media);
        
        System.out.println(nome[0]);
    }
    
}
