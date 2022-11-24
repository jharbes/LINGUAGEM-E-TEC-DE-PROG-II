/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula011poo;

/**
 *
 * @author Jorge
 */
public abstract class Pessoa {
    protected String nome;
    private int idade;
    private char sexo;
    
    public final void fazerAniv(){
            System.out.println("Parabéns " + this.getNome() + " pelo seu aniversário!"
                    + " Voce agora tem " + this.getIdade() + " anos!");
            setIdade(getIdade()+1);
    }

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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
