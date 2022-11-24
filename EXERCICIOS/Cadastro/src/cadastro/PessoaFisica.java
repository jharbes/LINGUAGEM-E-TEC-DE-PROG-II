/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

/**
 *
 * @author Jorge
 */
public class PessoaFisica {
    
    private String nome;
    private int dnDia;
    private int dnMes;
    private int dnAno;
    private float altura;

    
    public void todosDados(){
        System.out.println("DADOS PESSOA FISICA SOLICITADA:\n");
        System.out.println("NOME:               " + this.getNome());
        System.out.println("DATA DE NASCIMENTO: " + this.getDnDia() + "/" 
                + this.getDnMes() + "/" + this.getDnAno());
        System.out.println("ALTURA:             " + this.getAltura());
        System.out.println("IDADE:              " + this.idade());
    }
    
    public int idade(){
        return 2022-this.getDnAno();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDnDia() {
        return this.dnDia;
    }

    public void setDnDia(int dnDia) {
        this.dnDia = dnDia;
    }

    public int getDnMes() {
        return this.dnMes;
    }

    public void setDnMes(int dnMes) {
        this.dnMes = dnMes;
    }

    public int getDnAno() {
        return this.dnAno;
    }

    public void setDnAno(int dnAno) {
        this.dnAno = dnAno;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    
}
