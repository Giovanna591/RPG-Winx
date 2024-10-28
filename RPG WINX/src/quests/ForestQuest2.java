package quests;

public class ForestQuest2 extends Quest {
    public ForestQuest2() {
        // Chamada ao construtor da superclasse deve ser a primeira linha
        super(
                "Segredos da Névoa",
                "Encontrar a Árvore Anciã para pedir sua ajuda.",
                "A Árvore Anciã conhece segredos da floresta e pode revelar onde está a fonte da névoa.",
                3, // Objetivo de derrotar 3 criaturas
                100, // Recompensa em XP
                2000 // Delay em milissegundos
        );

        // Mensagem da Árvore Anciã
        talkToAncientTree();
    }

    // Método para interagir com a Árvore Anciã
    public void talkToAncientTree() {
        printWithDelay("Árvore Anciã: Ah... uma fada jovem e corajosa. Há uma magia escura no coração da floresta. "
                + "Para chegar lá, você deve desbloquear os três Cristais da Pureza. Vá ao Lago das Almas para o primeiro cristal.");
    }
}


