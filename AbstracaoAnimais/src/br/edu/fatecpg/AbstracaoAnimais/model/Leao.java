package br.edu.fatecpg.AbstracaoAnimais.model;

public class Leao {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void rugir() {
        System.out.println("Roaaarrr");
    }

    public void cacar() {
        System.out.println("O leão está caçando.");
    }
}