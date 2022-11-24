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
        
        c1.modelo="BIC Cristal";
        c1.cor="Azul";
        //c1.ponta=0.5f;
        c1.carga=80;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
