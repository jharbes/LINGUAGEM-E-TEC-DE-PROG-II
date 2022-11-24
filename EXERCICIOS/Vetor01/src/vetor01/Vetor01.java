/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] n={3,2,8,8,5,4}
        int[] m=new int[2];
        
        Arrays.fill(m,0);
        
        for (int i: m)
            System.out.println(i);
        
        int pos=Arrays.binarySearch(n,8);
        System.out.println(pos);
        
        Arrays.sort(n);
                
            
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("O total de casas de n é " + n.length + "\n");
        
        for (int i=0;i<=5;i++)
            System.out.println("N[" + i + "]= " + n[i]);
        //System.out.print("Digite sua idade: ");
        //int idade=teclado.nextInt();
        //System.out.println("\n");
        //System.out.print("Digite seu nome: ");
        //String nome=teclado.next();
        System.out.println("\n");
        
        //System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
    }
    
}
