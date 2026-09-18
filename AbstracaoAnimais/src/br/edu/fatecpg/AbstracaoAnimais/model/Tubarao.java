package br.edu.fatecpg.AbstracaoAnimais.model;

public class Tubarao {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void nadar() {
        System.out.println("O tubarão está nadando.");
    }

    public void cacar() {
        System.out.println("O tubarão está caçando.");
    }
}