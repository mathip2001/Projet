public class AvecViande extends Entree{
    private int kcal;

    public AvecViande(int quantite, double prix, int kcal) {
        super(quantite, prix);
        this.kcal = kcal;
    }

    public String toString() {
        return super.toString() + 
        "C'est une entree avec viande, elle contient donc plus de calories que celle sans viande, nb de calories : " +
        kcal + " kcal. ";
    }
    




}
