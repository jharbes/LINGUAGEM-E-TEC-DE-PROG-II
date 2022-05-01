/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Jorge
 */
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }

    @Override
    public void play() {
        if (!this.isReproduzindo()){
            this.setReproduzindo(true);
            System.out.println("Video "+this.getTitulo()+" comecou a reproduzir.\n");
        }
        else
            System.out.println("Video "+this.getTitulo()+" ja esta reproduzindo.\n");
    }

    @Override
    public void pause() {
        if (this.isReproduzindo()){
            this.setReproduzindo(false);
            System.out.println("Video "+this.getTitulo()+" pausado.\n");
        }
        else
            System.out.println("Video "+this.getTitulo()+" ja está pausado.\n");
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
        System.out.println("Video "+this.getTitulo()+" curtido com sucesso.");
        System.out.println("Numero de curtidas atual eh "+this.getCurtidas());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        //this.avaliacao = (avaliacao+(this.getAvaliacao()*(this.getViews()-1)))/this.getViews();
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    void setAvaliacao(float percentual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
