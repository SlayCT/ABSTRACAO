package br.edu.fatecpg.AbstracaoAnimais.view;
import br.edu.fatecpg.AbstracaoAnimais.model.*;


public class Main {

    public static void main(String[] args) {
    	
    	// =========================
    	// CACHORRO
    	// =========================

    	Cachorro cachorro1 = new Cachorro();
    	Cachorro cachorro2 = new Cachorro();

    	cachorro1.especie = "SRD";
    	cachorro2.especie = "Poodle";

    	System.out.println("\nCACHORRO");
    	System.out.println("Espécie: " + cachorro1.especie);
    	cachorro1.latir();

    	System.out.println("Espécie: " + cachorro2.especie);
    	cachorro2.brincar();


    	// =========================
    	// GATO
    	// =========================

    	Gato gato1 = new Gato();
    	Gato gato2 = new Gato();

    	gato1.especie = "Siamês";
    	gato2.especie = "Persa";

    	System.out.println("\nGATO");
    	System.out.println("Espécie: " + gato1.especie);
    	gato1.miar();

    	System.out.println("Espécie: " + gato2.especie);
    	gato2.brincar();


    	// =========================
    	// CAVALO
    	// =========================

    	Cavalo cavalo1 = new Cavalo();
    	Cavalo cavalo2 = new Cavalo();

    	cavalo1.especie = "Mangalarga";
    	cavalo2.especie = "Puro-sangue";

    	System.out.println("\nCAVALO");
    	System.out.println("Espécie: " + cavalo1.especie);
    	cavalo1.correr();

    	System.out.println("Espécie: " + cavalo2.especie);
    	cavalo2.relinchar();


    	// =========================
    	// LEÃO
    	// =========================

    	Leao leao1 = new Leao();
    	Leao leao2 = new Leao();

    	leao1.especie = "Leão da Montanha";
    	leao2.especie = "Leão-asiático";

    	System.out.println("\nLEÃO");
    	System.out.println("Espécie: " + leao1.especie);
    	leao1.rugir();

    	System.out.println("Espécie: " + leao2.especie);
    	leao2.cacar();


    	// =========================
    	// TIGRE
    	// =========================

    	Tigre tigre1 = new Tigre();
    	Tigre tigre2 = new Tigre();

    	tigre1.especie = "Tigre-de-bengala";
    	tigre2.especie = "Tigre-siberiano";

    	System.out.println("\nTIGRE");
    	System.out.println("Espécie: " + tigre1.especie);
    	tigre1.rugir();

    	System.out.println("Espécie: " + tigre2.especie);
    	tigre2.rugir();


    	// =========================
    	// ELEFANTE
    	// =========================

    	Elefante elefante1 = new Elefante();
    	Elefante elefante2 = new Elefante();

    	elefante1.especie = "Elefante-africano";
    	elefante2.especie = "Elefante-asiático";

    	System.out.println("\nELEFANTE");
    	System.out.println("Espécie: " + elefante1.especie);
    	elefante1.andar();

    	System.out.println("Espécie: " + elefante2.especie);
    	elefante2.beberAgua();


    	// =========================
    	// MACACO
    	// =========================

    	Macaco macaco1 = new Macaco();
    	Macaco macaco2 = new Macaco();

    	macaco1.especie = "Macaco-prego";
    	macaco2.especie = "Mico-leão-dourado";

    	System.out.println("\nMACACO");
    	System.out.println("Espécie: " + macaco1.especie);
    	macaco1.pular();

    	System.out.println("Espécie: " + macaco2.especie);
    	macaco2.subirArvore();


    	// =========================
    	// GIRAFA
    	// =========================

    	Girafa girafa1 = new Girafa();
    	Girafa girafa2 = new Girafa();

    	girafa1.especie = "Girafa-do-sul";
    	girafa2.especie = "Girafa-masai";

    	System.out.println("\nGIRAFA");
    	System.out.println("Espécie: " + girafa1.especie);
    	girafa1.andar();

    	System.out.println("Espécie: " + girafa2.especie);
    	girafa2.comerFolhas();


    	// =========================
    	// JACARÉ
    	// =========================

    	Jacare jacare1 = new Jacare();
    	Jacare jacare2 = new Jacare();

    	jacare1.especie = "Jacaré-açu";
    	jacare2.especie = "Jacaré-do-pantanal";

    	System.out.println("\nJACARÉ");
    	System.out.println("Espécie: " + jacare1.especie);
    	jacare1.nadar();

    	System.out.println("Espécie: " + jacare2.especie);
    	jacare2.cacar();


    	// =========================
    	// TUBARÃO
    	// =========================

    	Tubarao tubarao1 = new Tubarao();
    	Tubarao tubarao2 = new Tubarao();

    	tubarao1.especie = "Tubarão-branco";
    	tubarao2.especie = "Tubarão-martelo";

    	System.out.println("\nTUBARÃO");
    	System.out.println("Espécie: " + tubarao1.especie);
    	tubarao1.cacar();

    	System.out.println("Espécie: " + tubarao2.especie);
    	tubarao2.nadar();
        

        // =========================
        // GOLFINHO
        // =========================

        Golfinho golfinho1 = new Golfinho();
        Golfinho golfinho2 = new Golfinho();

        golfinho1.especie = "Golfinho-comum";
        golfinho2.especie = "Golfinho-nariz-de-garrafa";

        System.out.println("GOLFINHO");
        System.out.println("Espécie: " + golfinho1.especie);
        golfinho1.nadar();

        System.out.println("Espécie: " + golfinho2.especie);
        golfinho2.saltar();


        // =========================
        // ÁGUIA
        // =========================

        Aguia aguia1 = new Aguia();
        Aguia aguia2 = new Aguia();

        aguia1.especie = "Águia-real";
        aguia2.especie = "Águia-careca";

        System.out.println("\nÁGUIA");
        System.out.println("Espécie: " + aguia1.especie);
        aguia1.voar();

        System.out.println("Espécie: " + aguia2.especie);
        aguia2.cacar();


        // =========================
        // CORUJA
        // =========================

        Coruja coruja1 = new Coruja();
        Coruja coruja2 = new Coruja();

        coruja1.especie = "Coruja-buraqueira";
        coruja2.especie = "Coruja-das-torres";

        System.out.println("\nCORUJA");
        System.out.println("Espécie: " + coruja1.especie);
        coruja1.voar();

        System.out.println("Espécie: " + coruja2.especie);
        coruja2.cacar();


        // =========================
        // PINGUIM
        // =========================

        Pinguim pinguim1 = new Pinguim();
        Pinguim pinguim2 = new Pinguim();

        pinguim1.especie = "Pinguim-imperador";
        pinguim2.especie = "Pinguim-de-adélia";

        System.out.println("\nPINGUIM");
        System.out.println("Espécie: " + pinguim1.especie);
        pinguim1.nadar();

        System.out.println("Espécie: " + pinguim2.especie);
        pinguim2.caminhar();


        // =========================
        // URSO
        // =========================

        Urso urso1 = new Urso();
        Urso urso2 = new Urso();

        urso1.especie = "Urso-pardo";
        urso2.especie = "Urso-polar";

        System.out.println("\nURSO");
        System.out.println("Espécie: " + urso1.especie);
        urso1.andar();

        System.out.println("Espécie: " + urso2.especie);
        urso2.pescar();


        // =========================
        // COELHO
        // =========================

        Coelho coelho1 = new Coelho();
        Coelho coelho2 = new Coelho();

        coelho1.especie = "Coelho-europeu";
        coelho2.especie = "Coelho-doméstico";

        System.out.println("\nCOELHO");
        System.out.println("Espécie: " + coelho1.especie);
        coelho1.pular();

        System.out.println("Espécie: " + coelho2.especie);
        coelho2.correr();


        // =========================
        // RAPOSA
        // =========================

        Raposa raposa1 = new Raposa();
        Raposa raposa2 = new Raposa();

        raposa1.especie = "Raposa-vermelha";
        raposa2.especie = "Raposa-do-ártico";

        System.out.println("\nRAPOSA");
        System.out.println("Espécie: " + raposa1.especie);
        raposa1.cacar();

        System.out.println("Espécie: " + raposa2.especie);
        raposa2.correr();


        // =========================
        // ZEBRA
        // =========================

        Zebra zebra1 = new Zebra();
        Zebra zebra2 = new Zebra();

        zebra1.especie = "Zebra-da-planície";
        zebra2.especie = "Zebra-de-Grevy";

        System.out.println("\nZEBRA");
        System.out.println("Espécie: " + zebra1.especie);
        zebra1.correr();

        System.out.println("Espécie: " + zebra2.especie);
        zebra2.pastar();


        // =========================
        // PAPAGAIO
        // =========================

        Papagaio papagaio1 = new Papagaio();
        Papagaio papagaio2 = new Papagaio();

        papagaio1.especie = "Papagaio-verdadeiro";
        papagaio2.especie = "Papagaio-do-mangue";

        System.out.println("\nPAPAGAIO");
        System.out.println("Espécie: " + papagaio1.especie);
        papagaio1.voar();

        System.out.println("Espécie: " + papagaio2.especie);
        papagaio2.falar();


        // =========================
        // CAMELO
        // =========================

        Camelo camelo1 = new Camelo();
        Camelo camelo2 = new Camelo();

        camelo1.especie = "Camelo-bactriano";
        camelo2.especie = "Dromedário";

        System.out.println("\nCAMELO");
        System.out.println("Espécie: " + camelo1.especie);
        camelo1.andar();

        System.out.println("Espécie: " + camelo2.especie);
        camelo2.protegerAreia();
    }
}