package model;

public class Jornalista {
    public String nome;
    public double salario;

    public Jornalista(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Jornalista() {
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
}
