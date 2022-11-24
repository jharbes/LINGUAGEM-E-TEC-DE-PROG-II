/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;


import java.util.Random;

/**
 *
 * @author Jorge
 */
public class Luta {
    
    Random random = new Random();
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Metodos abstratos
    
    public void statusLuta(){
        System.out.println("SEGUEM INFORMACOES DA LUTA");
        System.out.println("DESAFIADO:     " + this.getDesafiado().getNome());
        System.out.println("DESAFIANTE:    " + this.getDesafiante().getNome());
        System.out.println("NUMERO ROUNDS: " + this.getRounds());
        System.out.println("LUTA APROVADA: " + this.isAprovada() + "\n");
    }
    
    public void marcarLuta(Lutador l1,Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && l1!=l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta de " + this.getDesafiado().getNome() + " e "
                    + this.getDesafiante().getNome() + " marcada com sucesso!\n");
            this.statusLuta();
        }
        else{
            this.setAprovada(false);
            System.out.println("NAO FOI POSSIVEL MARCAR A LUTA.\n");
        }
    }
    
    public void lutar(){
        int vencedor=0;
        if (this.isAprovada()){
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            vencedor=random.nextInt(3);
            switch(vencedor){
                case 0 ->
                {
                    //empate
                    System.out.println("A luta foi um empate!\n");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                }
                case 1 ->
                {
                    //Ganhou desafiado
                    System.out.println("O desafiado venceu!\n");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                }
                case 2 ->
                {
                    //Ganhou desafiante
                    System.out.println("O desafiante venceu!\n");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                }
                default ->
                {
                }
            
            }
        }
    }
    
    //Metodos especiais

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
