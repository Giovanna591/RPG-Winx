package Modelos;

public class Mob extends Enemy {
    protected int experienceReward;

    public Mob(String name, int health, int attackPower, int experienceReward) {
        super(name, health, attackPower);
        this.experienceReward = experienceReward;
    }

    public int getExperienceReward() {
        return experienceReward;
    }
}

