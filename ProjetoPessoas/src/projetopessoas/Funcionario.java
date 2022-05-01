/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Jorge
 */
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        if (isTrabalhando()){
            this.setTrabalhando(false);
            System.out.println("Funcionario(a) " + this.getNome() + " parou de"
                    + " trabalhar nesse momento.\n");
        }
        else {
            this.setTrabalhando(true);
            System.out.println("Funcionario(a) " + this.getNome() + " comecou a"
                    + " trabalhar nesse momento.\n");
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
