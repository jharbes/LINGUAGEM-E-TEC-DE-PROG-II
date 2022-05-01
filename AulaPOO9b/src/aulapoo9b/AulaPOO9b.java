/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo9b;

/**
 *
 * @author Jorge
 */
public class AulaPOO9b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1=new Pessoa();
        Livro l1=new Livro();
        
        p1.setNome("Jorge Nami Harbes");
        p1.setIdade(38);
        l1.setTotPaginas(300);
        l1.setTitulo("O capital");
        l1.setAutor("Karl Marx");
        l1.setLeitor(p1);
        l1.abrir();
        l1.folhear();
        l1.detalhes();
        l1.fechar();
        l1.avancarPagina();
        p1.fazerAniver();
    }
    
}
