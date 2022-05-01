/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo9b;

/**
 *
 * @author Jorge
 */
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
    public void fazerAniver(){
        setIdade(getIdade()+1);
        System.out.println("Parabens " + this.getNome() + "!! Feliz aniversario!!\n");
    }
    
    //Metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
}
