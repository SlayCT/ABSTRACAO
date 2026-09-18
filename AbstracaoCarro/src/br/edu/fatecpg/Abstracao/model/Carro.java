package br.edu.fatecpg.Abstracao.model;

public class Carro {

    // Atributos
    public String cor;
    public String modelo;
    public double capacidadeTanque;

    // Estado do carro
    public boolean ligado = false;

    // Construtor
    public Carro(String cor, String modelo, double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Método ligar
    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado!");
        } else {
            ligado = true;
            System.out.println("O carro está ligado!");
        }
    }

    // Método acelerar
    public void acelerar() {
        if (ligado) {
            System.out.println("Acelerando... VRUM!");
        } else {
            System.out.println("Ligue o carro antes de acelerar!");
        }
    }

    // Método frear
    public void frear() {
        if (ligado) {
            System.out.println("O carro está freando!");
        } else {
            System.out.println("O carro está desligado!");
        }
    }

    // Método buzinar
    public void buzinar() {
        System.out.println("BIBI! O carro " + modelo + " está buzinando!");
    }
}