package br.edu.fatecpg.AbstracaoAnimais.model;

public class Pinguim {

    public String especie;
    public String cor;
    public String genero;
    public double altura;

    public void nadar() {
        System.out.println("O pinguim está nadando.");
    }

    public void caminhar() {
        System.out.println("O pinguim está caminhando.");
    }
}