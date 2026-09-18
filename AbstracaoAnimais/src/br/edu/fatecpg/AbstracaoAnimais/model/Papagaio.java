package br.edu.fatecpg.AbstracaoAnimais.model;

public class Papagaio {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void voar() {
        System.out.println("O papagaio está voando.");
    }

    public void falar() {
        System.out.println("O papagaio está imitando sons.");
    }
}