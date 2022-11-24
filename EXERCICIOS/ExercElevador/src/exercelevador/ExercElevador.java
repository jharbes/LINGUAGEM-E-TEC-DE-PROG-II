/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercelevador;

/**
 *
 * @author Jorge
 */
public class ExercElevador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Elevador e1=new Elevador(20,6);
        
        e1.sobe();
        e1.sobe();
        e1.entra();
        
        System.out.println(e1.toString());
    }
    
}
