package Modelos;

public class Musa extends Fada {
    public Musa(String name) {
        super("Musa");
    }

    @Override
    protected void initializeSpells() {
        spells.add("Melodia da Harmonia");
        spells.add("Escudo Sonoro");
        spells.add("Curar");
        // Feitiços adicionais podem ser adicionados em níveis mais altos
    }
    @Override
    public String getTransformationMessage() {
        return "Musa, a música ressoa dentro de você! Prepare-se para se transformar e deixe sua melodia guiar a batalha!";
    }

}
