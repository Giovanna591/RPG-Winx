package Modelos;

public class Bloom extends Fada {
    public Bloom(String name) {
        super(name);  // Chama o construtor da classe pai Fada
    }

    @Override
    protected void initializeSpells() {
        spells.add("Fogo do Dragão");
        spells.add("Curar");
        // Adicione outros feitiços que a Bloom pode ter
    }
    @Override
    public String getTransformationMessage() {
        return "Bloom, você está pronta para se transformar! A magia do dragão está com você!";
    }
}
