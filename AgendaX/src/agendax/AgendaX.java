/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendax;

/**
 *
 * @author Jorge
 */
public class AgendaX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda agenda1[]=new Agenda[10];
    
        agenda1[0]=new Agenda();
        agenda1[0].armazenaPessoa("Jorge Nami Harbes",38,1.82f);
        agenda1[0].imprimePessoa(0);
        agenda1[0].imprimeAgenda();
    }
   
}
