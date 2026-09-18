package br.edu.fatecpg.AbstracaoAnimais.model;

public class Cavalo {

    public String especie;
    public String cor;
    public String genero;
    public double altura;

    public void correr() {
        System.out.println("O cavalo está correndo.");
    }

    public void relinchar() {
        System.out.println("Irrriiiiií");
    }
}
