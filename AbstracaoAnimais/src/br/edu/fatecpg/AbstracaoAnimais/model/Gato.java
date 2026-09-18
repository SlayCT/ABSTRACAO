package br.edu.fatecpg.AbstracaoAnimais.model;

public class Gato {

    public String especie;
    public String cor;
    public String genero;
    public double tamanho;

    public void miar() {
        System.out.println("Miau Miau");
    }

    public void brincar() {
        System.out.println("O gato está brincando.");
    }
}
