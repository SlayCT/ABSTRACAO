package br.edu.fatecpg.AbstracaoAnimais.model;

public class Urso {

    public String especie;
    public String cor;
    public String genero;
    public double peso;

    public void andar() {
        System.out.println("O urso está andando.");
    }

    public void pescar() {
        System.out.println("O urso está pescando.");
    }
}