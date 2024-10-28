package Batalhas;

import Modelos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainingGround {
    private List<Mob> mobs;

    public TrainingGround() {
        mobs = new ArrayList<>();
        initializeMobs();
    }

    private void initializeMobs() {
        mobs.add(new Goblin());
        mobs.add(new Troll());
        mobs.add(new Orc());
        // Adicione outros mobs conforme necessário
    }

    public void startTraining(Fada player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Campo de Treinamento! Escolha um mob para lutar:");
        for (int i = 0; i < mobs.size(); i++) {
            System.out.println((i + 1) + ". " + mobs.get(i).getName());
        }

        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < mobs.size()) {
            battle(player, mobs.get(choice));
        } else {
            System.out.println("Escolha inválida!");
        }
    }

    private void battle(Fada player, Mob mob) {
        System.out.println("Você encontrou um " + mob.getName() + "!");
        Scanner scanner = new Scanner(System.in);

        // Lógica de batalha
        while (player.isAlive() && mob.isAlive()) {
            System.out.println("O que você quer fazer?");
            System.out.println("1. Atacar");
            System.out.println("2. Usar feitiço");

            int action = scanner.nextInt();

            if (action == 1) {
                player.attack(mob);
            } else if (action == 2) {
                System.out.println("Escolha um feitiço:");
                for (int i = 0; i < player.getSpells().size(); i++) {
                    System.out.println((i + 1) + ". " + player.getSpells().get(i));
                }
                int spellIndex = scanner.nextInt() - 1; // Lê o índice do feitiço como um int
                if (spellIndex >= 0 && spellIndex < player.getSpells().size()) {
                    player.useSpell(spellIndex, mob); // Passa o índice correto
                } else {
                    System.out.println("Escolha de feitiço inválida!");
                }
            } else {
                System.out.println("Ação inválida!");
                continue; // Retorna ao início do loop se a ação for inválida
            }

            // Mob ataca de volta se ainda estiver vivo
            if (mob.isAlive()) {
                mob.attack(player);
            }
        }

        if (!player.isAlive()) {
            System.out.println(player.getName() + " foi derrotada!");
        } else {
            System.out.println("Você derrotou o " + mob.getName() + "!");
            player.gainExperience(mob.getExperienceReward());
        }
    }
}
