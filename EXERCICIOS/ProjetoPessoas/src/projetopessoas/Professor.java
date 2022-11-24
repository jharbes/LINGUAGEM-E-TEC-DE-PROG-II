/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Jorge
 */
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAum(float aumento){
        System.out.println("Parabens professor(a) " + this.getNome() + "! Voce acabou"
                + " de receber um aumento de " + aumento + " reais.");
        System.out.println("");
        this.setSalario(getSalario()+aumento);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
