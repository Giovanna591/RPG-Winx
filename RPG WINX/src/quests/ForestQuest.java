package quests;

public class ForestQuest extends Quest {
    public ForestQuest() {
        // Chamada ao construtor da superclasse deve ser a primeira linha
        super(
                "Explorando a Floresta",
                "Encontrar a entrada da Floresta Encantada e coletar informações.",
                "Gleam: \"Ouvi dizer que a bruxa, chamada Darcy, está por trás da névoa. Dizem que ela consegue manipular as sombras. Tenha cuidado.\"",
                3, // Objetivo de derrotar 3 criaturas
                100, // Recompensa em XP
                2000 // Atraso de 2 segundos para mensagens
        );

        // Agora você pode adicionar qualquer outro código aqui
        startIntro(); // Chama um método para iniciar a introdução da quest
    }

    private void startIntro() {
        printWithDelay(
                "********************************************************************************************************\n" +
                        "Em um planeta distante e mágico chamado Lunaris, o Colégio de Fadas Celestiais, conhecido como Lumina Academy, era um local de estudo e treinamento para jovens fadas que buscavam aprimorar seus poderes. Certa noite, durante uma celebração de luar, um estranho fenômeno aconteceu: a Floresta Encantada, que cercava o colégio, foi tomada por uma névoa escura e misteriosa envolvendo tudo em um silêncio assustador.");
        printWithDelay(
                "********************************************************************************************************\n");
    }
}
