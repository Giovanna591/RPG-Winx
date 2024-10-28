package Batalhas;


import Modelos.Enemy;
import Modelos.Fada;

import java.util.Scanner;

public class Battle {
    private Fada player;
    private Enemy enemy;

    public Battle(Fada player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A batalha começou entre " + player.getName() + " e " + enemy.getName() + "!");

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\nEscolha sua ação:");
            System.out.println("1. Ataque normal");
            System.out.println("2. Usar feitiço");
            System.out.println("3. Curar"); // Opção de cura adicionada

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    player.attack(enemy);
                    break;
                case 2:
                    System.out.println("Escolha o feitiço para usar:");
                    for (int i = 0; i < player.getSpells().size(); i++) {
                        System.out.println((i + 1) + ". " + player.getSpells().get(i));
                    }
                    int spellChoice = scanner.nextInt() - 1;
                    player.useSpell(spellChoice, enemy);
                    break;
                case 3:
                    player.heal(20); // A fada se cura por 20 pontos de vida
                    break;
                default:
                    System.out.println("Ação inválida.");
                    continue;
            }

            // Verificar se o inimigo está vivo após o ataque da fada
            if (enemy.isAlive()) {
                System.out.println(enemy.getName() + " contra-ataca!");
                player.takeDamage(enemy.getAttackPower());
            }
        }

        if (player.isAlive()) {
            System.out.println(player.getName() + " venceu a batalha!");
            player.gainExperience(50);  // Ganha experiência ao vencer a batalha
        } else {
            System.out.println(player.getName() + " foi derrotada.");
        }
    }
}
