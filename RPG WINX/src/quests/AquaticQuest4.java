package quests;

import java.util.Scanner;

public class AquaticQuest4 extends Quest {
    private Scanner scanner;

    public AquaticQuest4() {
        // Chamada ao construtor da superclasse deve ser a primeira linha
        super(
                "Salvando o Coração do Oceano",
                "Use os dois cristais e todo o poder das Winx para purificar o Coração do Oceano e derrotar Storm.",
                "Storm: Você irá sofrer com todo meu poder, se prepare para a batalha!!",
                4, // Objetivo de derrotar 4 criaturas
                100, // Recompensa em XP
                2000 // Delay em milissegundos
        );

        scanner = new Scanner(System.in);

        // Mensagem de preparação
        printWithDelay("************************************************************************");
        prepareForBattle(); // Chama o método para preparar para a batalha
    }

    // Método para verificar se o jogador está preparado
    public void prepareForBattle() {
        printWithDelay("Você está pronto para enfrentar Storm? (sim/não)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("sim")) {
            startBattle();
        } else {
            printWithDelay("Você decidiu se preparar mais. Volte quando estiver pronto.");
            // Aqui você pode adicionar lógica para permitir que o jogador retorne mais tarde.
        }
    }

    private void startBattle() {
        // Lógica para iniciar a batalha com Storm
        printWithDelay("A batalha contra Storm começa agora!");
        // Aqui você pode adicionar a lógica real da batalha
    }
}
