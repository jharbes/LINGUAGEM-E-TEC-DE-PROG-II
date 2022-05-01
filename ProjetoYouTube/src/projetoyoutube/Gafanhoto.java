/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Jorge
 */
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo,String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.setTotAssistido(0);
    }
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
        System.out.println("Mais um video assistido! O total de video assistidos por"
                +this.getNome()+" sao de "+this.getTotAssistido()+".\n");
    }

    @Override
    public String toString() {
        return "Gafanhoto{"+super.toString()+"login=" + login + ", totAssistido=" + totAssistido + '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
}
