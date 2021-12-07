package nourriture;

import nourriture.Entree;

public class SansViande extends Entree {
    private int conservation;

    public SansViande(int quantite, double prix, int conservation) {
        super(quantite, prix);
        this.conservation = conservation;
    }

    public String toString() {
        return super.toString() +
                "C'est une entree sans viande donc elle peut se conserver plus de temps que celles sans viande : " +
                conservation + " jours. ";
    }
}
