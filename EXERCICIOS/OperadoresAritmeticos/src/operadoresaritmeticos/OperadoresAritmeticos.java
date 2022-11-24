/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Jorge
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=3;
        int n2=5;
        float m=(n1+n2)/2;
        System.out.println("A media eh igual a " + m);
        
        int numero=5;
        int valor=4+numero--;
        System.out.println(valor);
        System.out.println(numero);
        
        System.out.println("");
        
        int x=4;
        x+=2; // x=x+2;
        System.out.println(x);
        
        System.out.println("");
        float v=8.9f;
        int ar=(int)Math.floor(v);
        System.out.println(ar);
        
        double ale=Math.random();
        int n=(int)(15+ale*(50-15));
        System.out.println(n);
    }
    
}
