package quests;

import Modelos.*;

import java.util.Scanner;

public class Tutorial {
    private Scanner scanner;

    public Tutorial() {
        scanner = new Scanner(System.in);
    }

    // Método para imprimir mensagens com atraso
    private void printWithDelay(String message, int delay) {
        System.out.println(message);
        try {
            Thread.sleep(delay); // Atraso em milissegundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaura o estado de interrupção
        }
    }

    public Fada start() {
        printWithDelay("Griselda: Olá, seja bem-vindo a Alfea! Por favor, digite seu nome:", 2000);
        String playerName = scanner.nextLine();

        printWithDelay("Jogador: Eu estou muito feliz de estar aqui!", 2000);

        printWithDelay("Griselda: Bonito nome! Eu me chamo Griselda e sou a diretora desta escola.", 2000);
        printWithDelay("Alfea é o lugar onde jovens fadas vêm para desenvolver suas habilidades e descobrir seu verdadeiro potencial.", 2000);
        printWithDelay("Sob a orientação de professores altamente qualificados, as alunas aprendem magia, poções e combate.", 2000);

        printWithDelay("Escolha sua fada do Winx Club: 1. Bloom 2. Stella 3. Flora 4. Musa 5. Aisha 6. Tecna", 2000);

        int choice = scanner.nextInt();
        Fada player;

        switch (choice) {
            case 1:
                player = new Bloom(playerName);
                break;
            case 2:
                player = new Stella(playerName);
                break;
            case 3:
                player = new Flora(playerName);
                break;
            case 4:
                player = new Musa(playerName);
                break;
            case 5:
                player = new Aisha(playerName);
                break;
            case 6:
                player = new Tecna(playerName);
                break;
            default:
                printWithDelay("Escolha inválida! Você será a Bloom por padrão.", 2000);
                player = new Bloom(playerName);
                break;
        }

        printWithDelay("Griselda: Mas o que é aquilo?! ", 2000);
        printWithDelay("*Magias estão sendo soltas em direção à torre de Alfea*", 2000);
        printWithDelay("Professor Palladium: São as Trix! Meninas, preparem-se para a defesa!", 2000);

        printWithDelay("Jogador: Aqui você irá aprender a usar a magia DEFENDER para se proteger de uma pedra que está caindo em sua direção.", 2000);

        // Aqui o jogador pode escolher se quer tentar usar a magia ou não
        printWithDelay("Você quer tentar usar a magia DEFENDER? (1 para sim, 2 para não)", 2000);
        int magicChoice = scanner.nextInt();

        if (magicChoice == 1) {
            printWithDelay("Griselda: Muito bem! Você acertou a sua primeira magia!", 2000);
        } else {
            printWithDelay("Griselda: Você precisará aprender a se defender em breve, prepare-se!", 2000);
        }

        printWithDelay("Griselda: Agora, você precisa se transformar para isso. Prepare-se para a batalha!", 2000);

        // Introduzindo a parte da transformação
        printWithDelay("Storm: Irei acabar com Alfea antes mesmo dessa fadinha mixuruca se formar e vocês vão pagar todo o mal que nos fez!", 2000);
        printWithDelay("Ice: Isso vocês irão pagar, TRANSFORMAÇÃO DE GELO!", 2000);

        printWithDelay("A mágica da Ice transformou a Griselda e todos os professores em estátuas de gelo.", 2000);

        printWithDelay("Bloom: Essa não! O que faremos agora?", 2000);

        printWithDelay("*Monstro cospe na Estella!*", 2000);

        printWithDelay("Estella: Eu acabei de hidratar meu cabelo, vocês me pagam seu monstro!", 2000);

        // Removendo a verificação redundante
        printWithDelay(player.getTransformationMessage(), 2000);

        printWithDelay("Bloom: Usa o Fogo do Dragão, quebrando a camada de gelo que prende Griselda e os professores, permitindo que eles possam ajudar na luta.", 2000);

        // Finalizando o tutorial
        printWithDelay("Griselda e professores: Após serem libertados, combinamos nossas habilidades para conjurar uma barreira protetora em Alfea.", 2000);
        printWithDelay("Jogador e Bloom: Juntos, canalizamos poder suficiente para empurrar Storm e Ice para fora dos portões de Alfea!", 2000);

        printWithDelay("Resultado: Com Storm, Icy e Darcy temporariamente derrotados, Alfea fica segura.", 2000);
        printWithDelay("Griselda: Parabéns pela coragem e habilidades em batalha! Você está pronta para a próxima missão.", 2000);

        return player;
    }
}
