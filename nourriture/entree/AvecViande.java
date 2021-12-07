package nourriture.entree;

public class AvecViande extends Entree {

    public AvecViande(int quantite, double prix, int kcal) {
        super(quantite, prix, "C'est une entree avec viande, elle contient donc plus de calories que celle sans viande, nb de calories : ", kcal);
    }

    public String toString() {
        return super.toString() +
                "C'est une entree avec viande, elle contient donc plus de calories que celle sans viande, nb de calories : " +
                super.getKcal() + " kcal. ";
    }


}
