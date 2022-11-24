/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendax;

/**
 *
 * @author Jorge
 */
public class Agenda {
    
    
    private String nome;
    private int idade;
    private float altura;
    
    public void armazenaPessoa(String n,int i,float a){
        this.setNome(n);
        this.setIdade(i);
        this.setAltura(a);
    }
    
    public void imprimeAgenda(){
        for (int a=0;a<10;a++){
            imprimePessoa(a);
        }
    }
    
    public void imprimePessoa(int index){
        System.out.println("IMPRIME PESSOA NUMERO " + index);
        System.out.println("NOME: " + this.getNome());
        System.out.println("IDADE: " + this.getIdade());
        System.out.println("");
    }
    
    public void removePessoa(String nome){
        
    }

    public Agenda() {
        System.out.println("Pessoa criada com sucesso!");
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


}
