package br.edu.fatecpg.AbstracaoAnimais.model;

public class Raposa {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void correr() {
        System.out.println("A raposa está correndo.");
    }

    public void cacar() {
        System.out.println("A raposa está caçando.");
    }
}