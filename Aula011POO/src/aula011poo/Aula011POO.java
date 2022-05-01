/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula011poo;

/**
 *
 * @author Jorge
 */
public class Aula011POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante v1=new Visitante();
        Aluno a1=new Aluno();
        Bolsista b1=new Bolsista();
        
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo('M');
        
        a1.setNome("Claudio");
        a1.setMatricula(12345);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo('M');
        a1.pagarMens();
        
        b1.setNome("Jubileu");
        b1.setMatricula(38934);
        b1.setBolsa(12.5f);
        b1.pagarMens();
        
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(b1.toString());
    }
    
}
