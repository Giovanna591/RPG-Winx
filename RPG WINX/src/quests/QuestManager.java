package quests;

import Modelos.Fada;

import java.util.ArrayList;
import java.util.List;

public class QuestManager {
    private List<Quest> activeQuests;
    private Fada player;

    public QuestManager(Fada player) {
        this.player = player;
        this.activeQuests = new ArrayList<>();
    }

    public void addQuest(Quest quest) {
        activeQuests.add(quest);
        quest.startQuest();
    }

    public void progressQuests() {
        for (Quest quest : activeQuests) {
            if (!quest.isCompleted()) {
                quest.progress();
                if (quest.isCompleted()) {
                    player.gainExperience(quest.getExperienceReward());
                }
            }
        }
    }

    public void showActiveQuests() {
        for (Quest quest : activeQuests) {
            System.out.println("Quest Ativa: " + quest.getName() + " - " + (quest.isCompleted() ? "Concluída" : "Em progresso"));
        }
    }
}
