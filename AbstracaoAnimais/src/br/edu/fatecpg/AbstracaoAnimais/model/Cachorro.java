package br.edu.fatecpg.AbstracaoAnimais.model;


public class Cachorro {

    public String especie;
    public String cor;
    public String genero;
    double tamanho;

    public void latir() {
        System.out.println("AU AU");
    }

    public void sentar() {
        System.out.println("O Cachorro sentou.");
    }
    
    public void brincar() {
        System.out.println("O Cachorro está brincando.");
    }
}