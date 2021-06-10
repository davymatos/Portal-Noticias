package view;

import controller.PortalController;
import util.Console;
import java.io.IOException;
import java.util.ArrayList;
import model.Jornalista;
import model.Noticia;

public class Main {

    public static void main(String[] args) throws IOException {
        PortalController controlador = new PortalController();
        int opcao;
        
        do{
           System.out.println("\nBem Vindo");
            System.out.println("+-------------------------------+");
            System.out.println("|0 - SAIR                       |"
                    + "\n+-------------------------------+\n"
                    + "|1 - LISTAGEM FUNCIONARIO       |"
                    + "\n+-------------------------------+\n"
                    + "|2 - CADASTRO FUNCIONARIO       |"
                    + "\n+-------------------------------+\n"
                    + "|3 - CADASTRO NOTICIA           |"
                    + "\n+-------------------------------+\n"
                    + "|4 - PUBLICACAO                 |"
                    );
            System.out.println("+-------------------------------+");
            System.out.printf("Digite um numero: "); 
            
            opcao = Console.readInt();
            if(opcao == 1){
                controlador.listarJornalista();
            }
            else if(opcao == 2){
                System.out.println("\nCADASTRO JORNALISTA");
                int idJor = controlador.gererIdJornalista();
                System.out.println("Seu id é: " + idJor);
                System.out.println("Insira um nome:");
                String nome = Console.readString();
                System.out.println("Insera Salario:");
                double salario = Console.readDouble();
                
                controlador.CadastrarJornalista(new Jornalista(nome, salario));
                System.out.println("Cadastrado com Sucesso");
            }
            else if(opcao == 3){
                System.out.println("\nNOVA PUBLICAÇÃO");
                int idNot = controlador.gererIdNoticia();
                System.out.println("Numero da publicação: " + idNot); 
                System.out.println("Insira titulo:");
                String titulo = Console.readString();
                System.out.println("Conteudo:");
                String conteudo = Console.readString();
                System.out.println("Anuncios:");
                String anuncio = Console.readString();
                System.out.println("Digital ou Impresso?");
                String tipo = Console.readString();
                System.out.println("Categoria da Publicação:");
                String categoria = Console.readString();
                System.out.println("Autor:");
                String jornalista = Console.readString();
                
                ArrayList<Noticia> ncadastrado = controlador.CadastrarNoticia(titulo, conteudo, anuncio, tipo, categoria, jornalista);
                System.out.println("Publicação "+ ncadastrado.get(idNot - 1).getTitulo()+ " cadastrado com Sucesso");
            }
            else if(opcao == 4){
                System.out.println("\n+---PUBLICAÇÃO---+");
                controlador.listarNoticia();
            }
            
        }while(opcao != 0);
    }
    
}
