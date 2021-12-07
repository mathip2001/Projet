package nourriture.entree;

public class SansViande extends Entree {
    private int conservation;

    public SansViande(int quantite, double prix, int conservation, int kcal) {
        super(quantite, prix, "C'est une entree sans viande donc elle peut se conserver plus de temps que celles sans viande : ", kcal);
        this.conservation = conservation;
    }

    public String toString() {
        return super.toString() +
                "C'est une entree sans viande donc elle peut se conserver plus de temps que celles sans viande : " +
                conservation + " jours. ";
    }
}
