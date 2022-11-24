/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nascimento;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Nascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t=new Scanner(System.in);
        System.out.print("Em que ano voce nasceu: ");
        int nasc=t.nextInt();
        int i=2022-nasc;
        if (i>=18)
            System.out.println("Maior de idade");
        else
            System.out.println("menor de idade");
    }


}
