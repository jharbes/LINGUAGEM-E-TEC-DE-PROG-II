/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Jorge
 */
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.getEspectador().setTotAssistido(this.getEspectador().getTotAssistido()+1);
        this.getFilme().setViews(this.getFilme().getViews()+1);
    }
    
    public void avaliar(){
        System.out.println("Avaliando o video "+this.getFilme().getTitulo()+" pelo"
                + " usuario "+this.getEspectador().getNome()+" com mais uma curtida!\n");
        this.getFilme().setCurtidas(this.getFilme().getCurtidas()+1);
        this.getFilme().setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        System.out.println("Avaliando o video "+this.getFilme().getTitulo()+" pelo"
                + " usuario "+this.getEspectador().getNome()+" com a nota "
                        +nota+".\n");
        this.getFilme().setAvaliacao(nota);
    }
    
    public void avaliar(float percentual){
        int tot=0;
        if (percentual<=20)
            tot=2;
        else if (percentual<=50)
            tot=5;
        else if (percentual<=80)
            tot=8;
        else
            tot=10;
        System.out.println("Avaliando o video "+this.getFilme().getTitulo()+" pelo"
                + " usuario "+this.getEspectador().getNome()+" com a nota "
                        +tot+".\n");
        this.getFilme().setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + this.getEspectador() + ", "
                + "filme=" + this.getFilme() + '}';
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
}
