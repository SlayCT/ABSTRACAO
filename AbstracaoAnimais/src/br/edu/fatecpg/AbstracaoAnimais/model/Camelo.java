package br.edu.fatecpg.AbstracaoAnimais.model;

public class Camelo {

    public String especie;
    public String cor;
    public String genero;
    public double altura;

    public void andar() {
        System.out.println("O camelo está andando.");
    }

    public void protegerAreia() {
        System.out.println("O camelo está protegendo os olhos da areia");
    }
}