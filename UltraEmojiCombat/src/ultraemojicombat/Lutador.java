/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author Jorge
 */
public class Lutador {
    
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Metodos abstratos
    
    public void apresentar(){
        System.out.println("Diretamente de(a) " + getNacionalidade());
        System.out.println("Esse eh o lutador " + this.getNome() +"\n");
    }
    
    public void status(){
        System.out.println("***SEGUEM OS DADOS DO LUTADOR***");
        System.out.println("NOME:               " + this.getNome());
        System.out.println("NACIONALIDADE:      " + this.getNacionalidade());
        System.out.println("IDADE:              " + this.getIdade());
        System.out.println("ALTURA:             " + this.getAltura() + " metros");
        System.out.println("PESO:               " + this.getPeso() + " kg");
        System.out.println("CATEGORIA:          " + this.getCategoria());
        System.out.println("NUMERO DE VITORIAS: " + this.getVitorias());
        System.out.println("NUMERO DE DERROTAS: " + this.getDerrotas());
        System.out.println("NUMERO DE EMPATES:  " + this.getEmpates() + "\n");
    }
    
    
    public void ganharLuta(){
        System.out.println(this.getNome() + " venceu a luta!\n");
        this.setVitorias(this.getVitorias()+1);
    }    
    
    public void perderLuta(){
        System.out.println(this.getNome() + " perdeu a luta!\n");
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        System.out.println(this.getNome() + " empatou a luta!\n");
        this.setEmpates(this.getEmpates()+1);
    }
    
    //Metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, 
            float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso()<52.2)
            this.categoria="INVALIDO";
        else if (this.getPeso()<=70.3)
            this.categoria="LEVE";
        else if (this.getPeso()<=83.89)
            this.categoria="MEDIO";
        else if (this.getPeso()<=120.2)
            this.categoria="PESADO";
        else
            this.categoria="INVALIDO";
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
