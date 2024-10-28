package Modelos;

public class Stella extends Fada {
    public Stella(String name) {
        super("Stella");
    }

    @Override
    protected void initializeSpells() {
        spells.add("Luz Solar");
        spells.add("Raio Dourado");
        spells.add("Curar");
    }

    @Override
    public String getTransformationMessage() {
        return "Stella, sua luz brilha intensamente! Prepare-se para a transformação e ilumine o caminho com sua magia!";
    }

}
