/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro;

/**
 *
 * @author Jorge
 */
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PessoaFisica p1=new PessoaFisica();
        
        p1.setNome("Jorge Nami Harbes");
        p1.setDnDia(21);
        p1.setDnMes(06);
        p1.setDnAno(1983);
        p1.setAltura(1.82f);
        
        p1.todosDados();
        
    }
    
    
}
