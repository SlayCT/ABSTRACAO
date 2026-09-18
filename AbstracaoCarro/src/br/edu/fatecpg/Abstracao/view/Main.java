
package br.edu.fatecpg.Abstracao.view;

import br.edu.fatecpg.Abstracao.model.Carro;

public class Main {

    public static void main(String[] args) {

        // Criando o primeiro carro
        Carro c1 = new Carro("Prata", "Logan", 50);

        // Criando o segundo carro
        Carro c2 = new Carro("Preta", "Argo", 48);

        // Exibindo os atributos
        System.out.println("=== CARRO 1 ===");
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Cor: " + c1.cor);
        System.out.println("Capacidade do tanque: "
                + c1.capacidadeTanque + " litros");

        System.out.println("\n=== CARRO 2 ===");
        System.out.println("Modelo: " + c2.modelo);
        System.out.println("Cor: " + c2.cor);
        System.out.println("Capacidade do tanque: "
                + c2.capacidadeTanque + " litros");

        // Testando os metodos
        System.out.println("\n=== TESTANDO CARRO 1 ===");

        c1.acelerar();
        c1.ligar();
        c1.acelerar();
        c1.frear();
        c1.buzinar();

        System.out.println("\n=== TESTANDO CARRO 2 ===");

        c2.ligar();
        c2.buzinar();
        c2.frear();
    }
}