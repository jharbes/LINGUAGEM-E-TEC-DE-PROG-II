/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercelevador;

/**
 *
 * @author Jorge
 */
public class Elevador {
    private int andarAtual;
    private int numAndares;
    private int capacidade;
    private int numPessoas;
    
    public void entra(){
        if (getNumPessoas()<getCapacidade()){
            System.out.println("Uma essoa entrou no elevador.\n");
            this.setNumPessoas(getNumPessoas()+1);
        }
        else
            System.out.println("Elevador lotado, nao foi possivel entrar a pessoa.\n");
    }
    
    public void sai(){
        if (getNumPessoas()>0){
            System.out.println("Uma pessoa saiu do elevador.\n");
            this.setNumPessoas(this.getNumPessoas()-1);
        }
        else
            System.out.println("Elevador vazio, nao eh possivel sair ninguem.\n");
    }
    
    public void sobe(){
        if (this.getAndarAtual()<this.getNumAndares()){
            System.out.println("Elevador subiu um andar.\n");
            this.setAndarAtual(this.getAndarAtual()+1);
        }
        else
            System.out.println("Elevador ja esta no ultimo andar.\n");
        
    }
    
    public void desce(){
        if (this.getAndarAtual()!=0){
            System.out.println("Elevador desceu um andar.\n");
            this.setAndarAtual(getAndarAtual()-1);
        }
        else
            System.out.println("Elevador ja esta no terreo.\n");
    }

    public Elevador(int numAndares, int capacidade) {
        this.numAndares = numAndares;
        this.capacidade = capacidade;
        this.setAndarAtual(0);
        this.setNumPessoas(0);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    @Override
    public String toString() {
        return "Elevador{" + "andarAtual=" + andarAtual + ", numAndares="
                + "" + numAndares + ", capacidade=" + capacidade + ", "
                + "numPessoas=" + numPessoas + '}';
    }
    
    
}
