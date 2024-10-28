package Modelos;

public class Aisha extends Fada {
    public Aisha(String name) {
        super("Aisha");
    }

    @Override
    protected void initializeSpells() {
        spells.add("Tsunami da Coragem");
        spells.add("Escudo de Água");
        spells.add("Curar");
        // Feitiços adicionais para níveis mais altos
    }

    public String getTransformationMessage() {
        return "Aisha, o poder da água está em suas mãos! Prepare-se para se transformar e domar as ondas da magia!";
    }

}
