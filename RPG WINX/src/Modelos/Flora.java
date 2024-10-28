package Modelos;

public class Flora extends Fada {
    public Flora(String name) {
        super("Flora");
    }

    @Override
    protected void initializeSpells() {
        spells.add("Força da Natureza");
        spells.add("Escudo de Plantas");
        spells.add("Curar");
    }
    @Override
    public String getTransformationMessage() {
        return "Flora, a natureza está ao seu lado! Prepare-se para se transformar e canalizar o poder das plantas!";
    }

}
