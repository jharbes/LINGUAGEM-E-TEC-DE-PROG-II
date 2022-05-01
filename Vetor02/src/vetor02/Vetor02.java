/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[]={"jan","fev","mar","abr","mai","jun","jul","ago","set",
            "out","nov","dez"};
        int tot[]={31,28,31,30,31,30,31,31,30,31,30,31};
        
        Scanner teclado=new Scanner(System.in);
        System.out.print("Digite o ano desejado: ");
        int ano=teclado.nextInt();
        System.out.println("");
        
        if (ano%4==0){
                if (ano%100==0 && ano%400==0){
                        tot[1]=29;
                }
        else
            tot[1]=29;        
        }
       
        //for (int i=0; i<mes.length; i++)
        for (int i: tot)
            //System.out.println("o mes de " + mes[i] + " tem " + tot[i] + " dias ao todo.");
            System.out.println(i);
        
    }
    
}
