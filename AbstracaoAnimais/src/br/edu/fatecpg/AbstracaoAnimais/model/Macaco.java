package br.edu.fatecpg.AbstracaoAnimais.model;

public class Macaco {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void subirArvore() {
        System.out.println("O macaco está subindo na árvore.");
    }

    public void pular() {
        System.out.println("O macaco está pulando.");
    }
}