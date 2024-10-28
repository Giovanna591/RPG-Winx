package quests;

public class AquaticQuest extends Quest {
    public AquaticQuest() {
        super(
                "Explorando as Profundezas",
                "Alcance Abyssus com segurança e descubra pistas sobre a fonte da escuridão.",
                "Tressa: Cuidado com as Medusas de Pedra! Suas toxinas podem paralisar até mesmo a magia de uma fada.",
                4, // Objetivo de derrotar 4 criaturas
                150, // Recompensa em XP
                2000 // Delay em milissegundos
        );

        // Adicione a descrição da quest aqui
        printQuestDescription();
    }

    // Método para imprimir a descrição da quest
    private void printQuestDescription() {
        printWithDelay(
                "********************************************************************************************************\n" +
                        "Durante uma visita ao Reino de Andros, Aisha recebe um chamado de sua prima Tressa, " +
                        "que relata estranhos eventos no fundo do oceano: monstros marinhos, redemoinhos e uma poderosa escuridão " +
                        "que ameaça o equilíbrio do mar. Tressa acredita que a fonte desses eventos está em um reino submerso chamado " +
                        "Abyssus, onde uma força misteriosa chamada Coração do Oceano foi corrompida.");
        printWithDelay(
                "********************************************************************************************************\n");
    }

    // Você pode adicionar outros métodos relacionados a essa quest aqui
}
