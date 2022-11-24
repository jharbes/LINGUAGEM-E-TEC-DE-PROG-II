/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06poo;

/**
 *
 * @author Jorge
 */
public class ControleRemoto implements Controlador {
    
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Metodos especiais
    public ControleRemoto() {
        setVolume(5);
        setLigado(false);
        setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }
    
    //Metodos abstratos
    

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()){
            System.out.println("APARELHO LIGADO: " + this.isLigado());
            System.out.println("VOLUME ATUAL: " + this.getVolume());
            for (int i=0;i<=this.getVolume();i++){
                System.out.print("[]");
            }   
            System.out.println("");
            System.out.println("APARELHO TOCANDO: " + this.isTocando());
        }
        else{
            System.out.println("Aparelho desligado.\n");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado())
            System.out.println("FECHANDO MENU.\n");
        else
            System.out.println("APARELHO DESLIGADO.\n");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(getVolume()+1);
            System.out.println("VOLUME: " + this.getVolume());
            for (int i=0;i<=this.getVolume();i++)
                System.out.print("[]");
            System.out.println("\n");
        }
        else{
            System.out.println("APARELHO DESLIGADO.\n");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado() && this.getVolume()>0){
            this.setVolume(this.getVolume()-1);
            System.out.println("VOLUME: " + this.getVolume());
            for (int i=1;i<=this.getVolume();i++);
                System.out.print("[]");
        }
        else if(this.getVolume()==0){
            System.out.println("VOLUME JA ESTA NO MINIMO.\n");
        }
        else{
            System.out.println("APARELHO DESLIGADO.\n");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado()){
            this.setVolume(0);
            this.setTocando(false);
            System.out.println("MUDO LIGADO.\n");
        }
        else{
            System.out.println("APARELHO DESLIGADO.\n");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado()){
            if (this.isTocando()==false && this.getVolume()==0){
                this.setTocando(true);
                this.setVolume(5);
            }
            else
                System.out.println("APARELHO NAO ESTA NO MUDO.\n");
        }
        else
            System.out.println("APARELHO DESLIGADO.\n");
    }

    @Override
    public void play() {
        if (this.isLigado() && (this.isTocando()==false)){
            this.setTocando(true);
            System.out.println("APARELHO TOCANDO.\n");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
            System.out.println("APARELHO PAUSADO.\n");
        }
    }
    
}
