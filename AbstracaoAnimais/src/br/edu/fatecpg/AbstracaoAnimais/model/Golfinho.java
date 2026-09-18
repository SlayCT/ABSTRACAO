package br.edu.fatecpg.AbstracaoAnimais.model;

public class Golfinho {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void nadar() {
        System.out.println("O golfinho está nadando.");
    }

    public void saltar() {
        System.out.println("O golfinho está saltando.");
    }
}