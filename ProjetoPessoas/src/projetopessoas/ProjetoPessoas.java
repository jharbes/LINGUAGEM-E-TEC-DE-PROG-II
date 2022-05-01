/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Jorge
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1=new Pessoa();
        Aluno p2=new Aluno();
        Professor p3=new Professor();
        Funcionario p4=new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        p2.cancelarMatr();
        p3.receberAum(500.75f);
        p4.mudarTrabalho();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
