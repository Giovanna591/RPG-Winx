package Modelos;

public class Tecna extends Fada {
    public Tecna(String name) {
        super("Tecna");
    }

    @Override
    protected void initializeSpells() {
        spells.add("Barreira de Tecnologia");
        spells.add("Raio Digital");
        spells.add("Curar");
        // Feitiços adicionais para níveis mais avançados
    }
    @Override
    public String getTransformationMessage() {
        return "Tecna, a tecnologia é sua aliada! Prepare-se para se transformar e utilize seu intelecto em batalha!";
    }

}
