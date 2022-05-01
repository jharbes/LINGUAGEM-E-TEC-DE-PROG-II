/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula011poo;

/**
 *
 * @author Jorge
 */
public final class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }
    
    @Override
    public void pagarMens(){
        System.out.println("Bolsista "+this.nome+" pagou sua mensalidade com"
                + " desconto de "+this.getBolsa()+"%.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" + "bolsa=" + bolsa + '}';
    }
    
    
}
