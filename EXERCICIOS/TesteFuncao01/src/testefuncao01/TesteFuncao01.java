/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author Jorge
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    static void soma(int a,int b){
        int s=a+b;
        System.out.println("A soma eh " + s);
    }
    
    static int somax(int a,int b){
        int s=a+b;
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        soma(5,2);
        int y=somax(2,2);
        System.out.println(y);
    }
    
}
