/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Jorge
 */
public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    public void cancelarMatr(){
        System.out.println("Sua matricula esta sendo cancelada conforme"
                + " sua solicitacao\n");
        this.setMatr(0000);
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
