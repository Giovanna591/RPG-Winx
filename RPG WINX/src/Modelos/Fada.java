package Modelos; // Certifique-se de que este é o pacote correto

import quests.Quest;

import java.util.ArrayList;
import java.util.List;

public abstract class Fada {
    protected String name;
    protected int level;
    protected int experience;
    protected PowerLevel powerLevel;
    protected List<String> spells;
    protected int health;
    protected int attackPower;
    protected List<Quest> quests;

    public Fada(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.powerLevel = PowerLevel.CHARMIX;
        this.spells = new ArrayList<>();
        this.health = 100;
        this.attackPower = 15;
        this.quests = new ArrayList<>();
        initializeSpells();
    }

    protected abstract void initializeSpells();

    public List<String> getSpells() {
        return spells;
    }

    public void gainExperience(int amount) {
        this.experience += amount;
        while (experience >= getExperienceToLevelUp()) {
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        experience = 0; // Resetar experiência ou calcular o excedente, se desejado
        System.out.println(name + " subiu para o nível " + level + "!");
    }

    private int getExperienceToLevelUp() {
        return level * 100; // Exemplo: 100 XP por nível
    }

    public void addQuest(Quest quest) {
        quests.add(quest);
        System.out.println("Nova missão recebida: " + quest.getName());
    }

    public void progressQuest() {
        for (Quest quest : quests) {
            if (!quest.isCompleted()) {
                quest.progress();
                if (quest.isCompleted()) {
                    gainExperience(quest.getExperienceReward());
                }
            }
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " recebeu " + damage + " de dano. Vida restante: " + health);
        if (!isAlive()) {
            System.out.println(name + " foi derrotada!");
            // Lógica adicional ao ser derrotada (por exemplo, perder XP)
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Enemy enemy) {
        System.out.println(name + " ataca " + enemy.getName() + " com poder de " + attackPower);
        enemy.takeDamage(attackPower);
    }

    public void useSpell(int spellIndex, Enemy enemy) {
        if (spellIndex >= 0 && spellIndex < spells.size()) {
            System.out.println(name + " usa " + spells.get(spellIndex) + "!");
            int spellDamage = attackPower + 10; // Dano aumentado para o feitiço
            enemy.takeDamage(spellDamage);
        } else {
            System.out.println("Feitiço inválido.");
        }
    }
    // Método para curar a fada
    public void heal(int healAmount) {
        health += healAmount;
        System.out.println(name + " se cura por " + healAmount + ". Vida atual: " + health);
        if (health > 100) { // Limitar a vida máxima
            health = 100;
            System.out.println(name + " já está com vida cheia!");
        }
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
    public abstract String getTransformationMessage();
}
