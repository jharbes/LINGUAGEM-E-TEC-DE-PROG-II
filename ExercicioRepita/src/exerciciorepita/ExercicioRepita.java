/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        JOptionPane.showMessageDialog(null,"Hello world!","Boas Vindas!",JOptionPane.WARNING_MESSAGE);
        do{
        n=Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um numero: <br><em>(valor 0 para finalizar)</br></em> </html>"));
        JOptionPane.showMessageDialog(null,"Voce digitou o valor " + n);
    } while (n!=0);
    
    }
