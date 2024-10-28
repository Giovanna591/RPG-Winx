package main;

import Batalhas.Battle;
import Batalhas.TrainingGround;
import Modelos.Enemy;
import Modelos.Fada;
import quests.*;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fada player;

        // Tutorial inicial
        Tutorial tutorial = new Tutorial();
        player = tutorial.start(); // Acesso ao tutorial e escolha da fada


        QuestManager questManager = new QuestManager(player);


        // Loop principal do jogo
        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Ir ao Campo de Treinamento");
            System.out.println("2. Começar uma Quest");
            System.out.println("0. Sair do Jogo");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    TrainingGround trainingGround = new TrainingGround();
                    trainingGround.startTraining(player);
                    break;
                case 2:
                    // Adicionando as quests
                    questManager.addQuest(new ForestQuest());
                    Enemy aranha = new Enemy("Aranha", 30, 3);
                    Battle battle = new Battle(player, aranha);
                    battle.start();
                    questManager.progressQuests();

                    questManager.addQuest(new ForestQuest2());
                    Enemy lobo = new Enemy("Lobo Sangrento", 30, 6);
                    Battle battle2 = new Battle(player, lobo);
                    battle2.start();
                    questManager.progressQuests();

                    // Adicionando a batalha final com preparação
                    ForestQuest3 quest3 = new ForestQuest3();
                    questManager.addQuest(quest3);
                    quest3.prepareForBattle(); // Chama o método para preparar para a batalha
                    Enemy darcy = new Enemy("Darcy, uma das Trix", 30, 6);
                    Battle battle3 = new Battle(player, darcy);
                    battle3.start();
                    questManager.progressQuests();

                    AquaticQuest quest4 = new AquaticQuest();
                    questManager.addQuest(quest4);
                    Enemy medusa = new Enemy("Medusa de Pedra", 70, 8);
                    Battle battle4 = new Battle(player, medusa);
                    battle4.start();
                    questManager.progressQuests();

                    AquaticQuest2 quest5 = new AquaticQuest2();
                    questManager.addQuest(quest5);
                    questManager.progressQuests();

                    AquaticQuest3 quest6 = new AquaticQuest3();
                    questManager.addQuest(quest6);
                    Enemy guardiao = new Enemy("Guardiões das Sombras", 70, 8);
                    Battle battle6 = new Battle(player, guardiao);
                    battle6.start();
                    questManager.progressQuests();

                    AquaticQuest4 quest7 = new AquaticQuest4();
                    questManager.addQuest(quest7);
                    quest7.prepareForBattle(); // Chama o método para preparar para a batalha
                    Enemy storm = new Enemy("Storm, Tempestade no Oceano", 70, 25);
                    Battle battle7 = new Battle(player, storm);
                    battle7.start();
                    questManager.progressQuests();

                    break;
                case 0:
                    System.out.println("Saindo do jogo. Até logo!");
                    scanner.close();
                    return; // Encerra o jogo
                default:
                    System.out.println("Escolha inválida! Tente novamente.");
            }
        }
    }
}
