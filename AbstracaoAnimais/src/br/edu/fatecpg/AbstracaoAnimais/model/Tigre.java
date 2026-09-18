package br.edu.fatecpg.AbstracaoAnimais.model;

public class Tigre {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void rugir() {
        System.out.println("Rawwrr");
    }

    public void cacar() {
        System.out.println("O tigre está caçando.");
    }
}