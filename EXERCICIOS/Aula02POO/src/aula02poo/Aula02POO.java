/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02poo;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Aula02POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1=new Caneta();
        Scanner teclado=new Scanner(System.in);
        
        c1.cor="azul";
        c1.ponta=(float)0.5;
        c1.tampada=false;
        c1.modelo="BIC Cristal";
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
        
        c1.status();
    }
    
}
