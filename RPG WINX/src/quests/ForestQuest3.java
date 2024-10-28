package quests;

import java.util.Scanner;

public class ForestQuest3 extends Quest {
    private Scanner scanner;

    public ForestQuest3() {
        // Chamada ao construtor da superclasse com o parâmetro delay
        super(
                "A Batalha Final",
                "Derrote Darcy no Templo do Coração da Floresta usando os três Cristais e o Amuleto de Elara.",
                "Darcy: Você irá sofrer com todo meu poder, se prepare para a batalha!!",
                3, // Objetivo de derrotar 3 criaturas
                100, // Recompensa em XP
                2000 // Por exemplo, 2000ms de delay
        );

        scanner = new Scanner(System.in);

        // Mensagem de preparação
        printWithDelay("************************************************************************");
        prepareForBattle(); // Chama o método para preparar para a batalha
    }

    // Método para verificar se o jogador está preparado
    public void prepareForBattle() {
        printWithDelay("Você está pronto para enfrentar Darcy? (sim/não)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("sim")) {
            startBattle();
        } else {
            printWithDelay("Você decidiu se preparar mais. Volte quando estiver pronto.");
            // Aqui você pode adicionar lógica para permitir que o jogador retorne mais
            // tarde.
        }
    }

    private void startBattle() {
        // Lógica para iniciar a batalha com Darcy
        printWithDelay("A batalha contra Darcy começa agora!");
        // Aqui você pode adicionar a lógica real da batalha
    }
}
