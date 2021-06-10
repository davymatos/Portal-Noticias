package model;

public class Noticia {
    public String titulo;
    public String conteudo;
    public String anuncio;
    public String tipo;
    public String categoria;
    public String jornalista;

    public Noticia(String titulo, String conteudo, String anuncio, String tipo, String categoria, String jornalista) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.anuncio = anuncio;
        this.tipo = tipo;
        this.categoria = categoria;
        this.jornalista = jornalista;
    }

    public Noticia() {
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(String anuncio) {
        this.anuncio = anuncio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getJornalista() {
        return jornalista;
    }

    public void setJornalista(String jornalista) {
        this.jornalista = jornalista;
    }
}
