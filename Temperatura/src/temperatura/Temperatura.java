/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float c,k,re,ra,f;
        
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe a temperatura em celsius: ");
        c=teclado.nextFloat();
        System.out.println("");
        
        f=(float) (c*1.8+32);
        k=(float) (c+273.15);
        re=(float) (c*0.8);
        ra=(float) (c*1.8+32+459.67);
        
        System.out.println("A temperatura de " + c + " em celsius é igual as seguintes temperaturas"
                + "em outras escalas: \n");
        System.out.println("Kelvin: " + k);
        System.out.println("Fahrenheit: " + f);
        System.out.println("Reaumur: " + re);
        System.out.println("Rankine: " + ra);
        
        
        
        
        
    }
    
}
