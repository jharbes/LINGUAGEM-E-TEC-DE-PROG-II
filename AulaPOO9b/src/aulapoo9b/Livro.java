/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo9b;

/**
 *
 * @author Jorge
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public void detalhes(){
        System.out.println("\nINFORMACOES SOBRE O LIVRO SOLICITADO: ");
        System.out.println("TITULO:           " + this.getTitulo());
        System.out.println("AUTOR:            " + this.getAutor());
        System.out.println("TOTAL DE PAGINAS: " + this.getTotPaginas());
        System.out.println("PAGINA ATUAL:     " + this.getPagAtual());
        System.out.println("LIVRO ABERTO:     " + this.isAberto());
        System.out.println("PESSOA LENDO:     " + this.getLeitor().getNome());
        System.out.println("");
    }
    
    //Metodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (!this.isAberto()){
            this.setAberto(true);
            this.setPagAtual(1);
            System.out.println("Livro aberto, pagina atual: " + this.getPagAtual());
            System.out.println("");
        }
        else
            System.out.println("Livro ja está aberto.\n");
    }

    @Override
    public void fechar() {
        if (this.isAberto()){
            this.setAberto(false);
            this.setPagAtual(0);
            System.out.println("Livro fechado, pagina atual: 0");
        }
        else
            System.out.println("Livro ja esta fechado.\n");
        
    }

    @Override
    public void folhear() {
        if (this.isAberto()){
            this.setPagAtual(getPagAtual()+1);
            System.out.println("Folha passada, pagina atual: " + this.getPagAtual());
            System.out.println("");
        }
        else
            System.out.println("Livro esta fechado, impossivel folhear.\n");
    }

    @Override
    public void avancarPagina() {
        if (this.isAberto() && this.getPagAtual()<this.getTotPaginas()){
            this.setPagAtual(getPagAtual()+1);
            System.out.println("Folha avancada, pagina atual: " + this.getPagAtual());
            System.out.println("");
        }
        else if (this.getPagAtual()==this.getTotPaginas())
            System.out.println("Livro na ultima pagina, impossivel avancar pagina.\n");
        else
            System.out.println("Livro esta fechado, impossivel avancar pagina.\n");
    }

    @Override
    public void voltarPag() {
        if (this.isAberto() && this.getPagAtual()>1){
            this.setPagAtual(this.getPagAtual()-1);
            System.out.println("Voltando a folha, pagina atual: " + this.getPagAtual());
            System.out.println("");
        }
        else if (this.isAberto() && this.getPagAtual()==1)
            System.out.println("Impossivel voltar, pagina atual eh a primeira"
                    + ", favor fechar livro.");
        else
            System.out.println("Livro está fechado, impossivel voltar pagina.");
        
    }
    
    
    
}
