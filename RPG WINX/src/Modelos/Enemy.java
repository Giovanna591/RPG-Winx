package Modelos;

public class Enemy {
    protected String name;
    protected int health;
    protected int attackPower; // Mantenha este atributo

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() { // Método adicionado
        return attackPower;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " recebeu " + damage + " de dano. Vida restante: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Fada player) {
        System.out.println(name + " ataca " + player.getName() + " com poder de " + attackPower);
        player.takeDamage(attackPower);
    }
}
