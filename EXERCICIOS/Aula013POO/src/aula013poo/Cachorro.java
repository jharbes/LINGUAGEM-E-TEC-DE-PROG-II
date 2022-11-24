/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula013poo;

/**
 *
 * @author Jorge
 */
public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au!Au!Au1");
    }
    
    public void reagir(String frase){
        if ("toma comida".equals(frase) || "Ola".equals(frase))
            System.out.println("Abanar e latir");
        else
            System.out.println("rosnar");
    }
    
    public void reagir(int hora,int min){
        if (hora<12)
            System.out.println("abanar");
        else if (hora>=18)
            System.out.println("ignorar");
        else
            System.out.println("abanar e latir");
    }
    
    public void reagir(boolean ehDono){
        if (ehDono)
            System.out.println("abanar");
        else
            System.out.println("Rosnar e latir");
    }
    
    public void reagir(int idade,float peso){
        if (idade<5){
            if (peso<10)
                System.out.println("abanar");
            else
                System.out.println("latir");
        }
        else{
            if (peso<10)
                System.out.println("rosnar");
            else
                System.out.println("ignorar");
        } 
    }
    
}
