/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02poo;

/**
 *
 * @author Jorge
 */
public class Caneta {
    
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga atual: " + this.carga);
        System.out.println("Uma caneta " + this.cor); 
        System.out.println("Esta tampada? " + this.tampada);
   }
    
    public void rabiscar(){
        if (this.tampada==true)
            System.out.println("ERRO, estou tampada no momento!");
        else
            System.out.println("Estou rabiscando");
    }
    
    public void tampar(){
        this.tampada=true;
    }
    
    public void destampar(){
        this.tampada=false;
    }
    
}
