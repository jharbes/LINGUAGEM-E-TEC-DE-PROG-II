/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coberturaazulejo;


import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class CoberturaAzulejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float hp,lp,ha,la;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Informe o valor da altura da parede: ");
        hp=teclado.nextFloat();
        
        System.out.print("\nInforme o valor da largura da parede: ");
        lp=teclado.nextFloat();
        
        System.out.print("\nInforme o valor da altura do azulejo: ");
        ha=teclado.nextFloat();
        
        System.out.print("\nInforme o valor da largura do azulejo: ");
        la=teclado.nextFloat();
        
        
        System.out.println("\nO numero de azulejos necessarios sera: " + Math.ceil((hp*lp)/(ha*la));
    }
    
}
