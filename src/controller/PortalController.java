package controller;

import java.util.ArrayList;
import model.ChefeRedacao;
import model.Editor;
import model.Jornalista;
import model.Noticia;
import model.Revisor;
import java.util.Iterator;

public class PortalController {
    
    public PortalController(){
        
    }
    private ArrayList <Jornalista> listaJornalista = new ArrayList<>();
    private ArrayList <Editor> listaEditor = new ArrayList<>();
    private ArrayList <Revisor> listaRevisor = new ArrayList<>();
    private ArrayList <ChefeRedacao> listaChefe = new ArrayList<>();
    private ArrayList <Noticia> listaNoticia = new ArrayList<>();
    
    //CADASTRO
    public void CadastrarJornalista(Jornalista jornalista){
        listaJornalista.add(jornalista);
    }
    
    //NOTICIA
    public ArrayList<Noticia> CadastrarNoticia(String titulo, String conteudo, String anuncio, String tipo, String categoria, String jornalista){
        Noticia not = new Noticia();
        not.setTitulo(titulo);
        not.setConteudo(conteudo);
        not.setAnuncio(anuncio);
        not.setTipo(tipo);
        not.setCategoria(categoria);
        not.setJornalista(jornalista);
        
        listaNoticia.add(new Noticia(titulo, conteudo, anuncio, tipo, categoria, jornalista));
        return listaNoticia;
    }
    
    //LISTAGEM
    public void listarJornalista(){
        for(int i = 0; i < listaJornalista.size();i++){
            System.out.println("\n"+ listaJornalista.get(i).getNome());
        }
    }
    
    public void listarNoticia(){
        for(int i = 0; i < listaNoticia.size();i++){
            System.out.println("\n"+ listaNoticia.get(i).getTitulo());
            System.out.println("\n"+ listaNoticia.get(i).getConteudo());
            System.out.println("\n"+ listaNoticia.get(i).getAnuncio());
            System.out.println("\n"+ listaNoticia.get(i).getJornalista());
        }
    }
    
    //ID
    public int gererIdJornalista(){
        int novaMat;
        novaMat = this.listaJornalista.size() + 1;
        return novaMat;
    }
    
    public int gererIdNoticia(){
        int novaMat;
        novaMat = this.listaNoticia.size() + 1;
        return novaMat;
    }
}
