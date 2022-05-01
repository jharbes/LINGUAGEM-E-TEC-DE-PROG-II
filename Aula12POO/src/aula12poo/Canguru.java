/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12poo;

/**
 *
 * @author Jorge
 */
public class Canguru extends Mamifero {
    
    public void usarBolsa(){
        System.out.println("usando bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("saltando");
    }
}
