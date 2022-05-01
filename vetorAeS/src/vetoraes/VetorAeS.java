/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoraes;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class VetorAeS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float[] h = new float[10];
        char[] s = new char[10];
        float maior=0f;
        float menor=0f;
        float media=0f;
        int mulher=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Informe o valor da altura do individuo[1]= ");
        h[0]=teclado.nextFloat();
        menor=h[0];
        
        for (int i=1;i<=9;i++){
            System.out.print("Informe o valor da altura do individuo[" + i+1 + "]= ");
            h[i]=teclado.nextFloat();
            if (h[i]>maior)
                maior=h[i];
            if (h[i]<menor)
                menor=h[i];
        }
        
        for (int i=0;i<=9;i++){
            System.out.print("Informe o sexo do individuo[" + i+1 + "]= ");
            s[i]=teclado.next().charAt(0);
            if (s[i]=='m' || s[i]=='M')
                mulher++;
            if (s[i]=='h' || s[i]=='H')
                media=+s[i];
        }
        
        System.out.println("A maior altura do grupo eh " + maior + " metros.");
        System.out.println("A menor altura do grupo eh " + menor + " metros.");
        System.out.println("A media de altura dos homens do grupo eh " + media + " metros.");
        System.out.println("O numero de mulheres do grupo eh de " + mulher + ".");
        
    }

    private static Object next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
