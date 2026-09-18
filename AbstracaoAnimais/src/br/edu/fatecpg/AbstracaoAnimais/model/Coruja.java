package br.edu.fatecpg.AbstracaoAnimais.model;

public class Coruja {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void voar() {
        System.out.println("A coruja está voando.");
    }

    public void cacar() {
        System.out.println("A coruja está caçando.");
    }
}