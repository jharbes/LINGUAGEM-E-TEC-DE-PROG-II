/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula013poo;

/**
 *
 * @author Jorge
 */
public class Aula013POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c=new Cachorro();
        
        c.reagir("Ola");
        c.reagir("Vai apanhar");
        
        c.reagir(11,45);
        c.reagir(21,00);
        
        c.reagir(true);
        c.reagir(false);
        
        c.reagir(2, (float) 12.5);
        c.reagir(17, (float) 4.5);
    }
    
}
