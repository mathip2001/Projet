package nourriture;

public class PlatFroid extends Plat {
    private int conservation;

    public PlatFroid(int quantite, int conservation, double prix) {
        super(quantite, prix);
        this.conservation = conservation;
    }

    public String toString() {
        return super.toString()
                + "C'est un plat froid, aucun temps de cuisson est necessaire. "
                + "Ce plat peut se conserver " + conservation + " jour(s). ";
    }
}