package quests;

public class AquaticQuest3 extends Quest {
    public AquaticQuest3() {
        super(
                "O Cristal das Tempestades",
                "Derrote os Guardiões das Sombras e obtenha o Cristal das Tempestades.",
                "Stella: “Esses monstros são tão sombrios que quase não posso enxergar minha própria luz!”\n" +
                        "Aisha: “Vamos unir nossos poderes e fazer a luz atravessar!”",
                4, // Objetivo de derrotar 4 criaturas
                150, // Recompensa em XP
                2000 // Delay em milissegundos
        );

        // Imprimir a descrição da quest
        printQuestDescription();
    }

    // Método para imprimir a descrição da quest
    private void printQuestDescription() {
        printWithDelay(
                "********************************************************************************************************\n" +
                        "As fadas descobriram que o Cristal das Tempestades está protegido pelos Guardiões das Sombras, criaturas de trevas que " +
                        "têm o poder de manipular a escuridão. Para conseguir o cristal, elas precisam derrotar esses guardiões e unir suas forças.\n");
        printWithDelay(
                "********************************************************************************************************\n");
    }

    // Método para preparar a batalha
    public void prepareForBattle() {
        printWithDelay("As fadas se reúnem para planejar sua estratégia contra os Guardiões das Sombras.");
    }

    // Método para iniciar a batalha
    public void startBattle() {
        printWithDelay("A batalha contra os Guardiões das Sombras começa agora! Preparem-se!");
        // Aqui você pode adicionar a lógica real da batalha
    }
}
