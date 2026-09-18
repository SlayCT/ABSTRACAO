package br.edu.fatecpg.AbstracaoAnimais.model;

public class Elefante {

    public String especie;
    public String cor;
    public String genero;
    public double peso;

    public void andar() {
        System.out.println("O elefante está andando.");
    }

    public void beberAgua() {
        System.out.println("O elefante está bebendo água.");
    }
}