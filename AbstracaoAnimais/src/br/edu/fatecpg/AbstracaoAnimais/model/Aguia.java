package br.edu.fatecpg.AbstracaoAnimais.model;

public class Aguia {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void voar() {
        System.out.println("A águia está voando.");
    }

    public void cacar() {
        System.out.println("A águia está caçando.");
    }
}