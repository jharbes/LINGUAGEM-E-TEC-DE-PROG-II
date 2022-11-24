/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumecilindro;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class VolumeCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v,r,h;
        DecimalFormat deci=new DecimalFormat("0.00")
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Informe o valor do raio da base do cilindro: ");
        r=teclado.nextDouble();
        
        System.out.print("\nInforme o valor da altura do cilindro: ");
        h=teclado.nextDouble();
        
        v=3.141519*r*r*h;
        
        
        System.out.println("\nO volume do cilindro informado eh de " + deci.format(v) + " u.v.");
    }
    
}
