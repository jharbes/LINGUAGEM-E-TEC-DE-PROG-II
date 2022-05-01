/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12poo;

/**
 *
 * @author Jorge
 */
public class Aula12POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal n=new Animal();
        Mamifero m=new Mamifero();
        Reptil r=new Reptil();
        Peixe p=new Peixe();
        Ave a=new Ave();
        Canguru c=new Canguru();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        c.locomover();
    }
    
}
