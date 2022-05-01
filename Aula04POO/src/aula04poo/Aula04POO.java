/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04poo;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Aula04POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1=new Caneta("NIC","Amarela", (float) 0.4);
        c1.status();
        String frase="";
        System.out.println("");
        
        //System.out.print("Digite a frase: ");
        Scanner teclado=new Scanner(System.in);
        
        //frase=teclado.nextLine();
        System.out.println(frase);
        
        
        c1.setModelo("BIC Cristal");
        c1.setPonta(0.5f);
        c1.status();
        
        //Caneta c2=new Caneta();
        //c2.status();
        
        
    }
    
}
