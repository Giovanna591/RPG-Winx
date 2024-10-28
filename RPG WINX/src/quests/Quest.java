package quests;

public class Quest {
    private String name;
    private String description;
    private String npcDialog;
    private int requiredKills;
    private int currentKills;
    private int experienceReward;
    private boolean isCompleted;
    private int delay; // Atributo para o delay

    public Quest(String name, String description, String npcDialog, int requiredKills, int experienceReward, int delay) {
        this.name = name;
        this.description = description;
        this.npcDialog = npcDialog;
        this.requiredKills = requiredKills;
        this.currentKills = 0;
        this.experienceReward = experienceReward;
        this.isCompleted = false;
        this.delay = delay; // Inicializa o delay
    }

    public void printWithDelay(String message) {
        System.out.print(message); // Imprime a mensagem sem nova linha
        try {
            Thread.sleep(delay); // Pausa o programa pelo tempo especificado
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaura o estado de interrupção
        }
        System.out.println(); // Adiciona nova linha após o delay
    }

    public void startQuest() {
        printWithDelay("Missão: " + name);
        printWithDelay("Descrição: " + description);
        printWithDelay("NPC: " + npcDialog);
    }

    public void progress() {
        if (!isCompleted) {
            currentKills++;
            printWithDelay("Progresso da missão: " + currentKills + "/" + requiredKills + " inimigos derrotados.");
            if (currentKills >= requiredKills) {
                complete();
            }
        }
    }

    private void complete() {
        isCompleted = true;
        printWithDelay("Parabéns! Você completou a missão: " + name);
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int getExperienceReward() {
        return experienceReward;
    }

    public String getName() {
        return name;
    }
}
