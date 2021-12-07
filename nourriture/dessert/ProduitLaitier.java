package nourriture.dessert;

public abstract class ProduitLaitier extends Dessert {
    private int vitamineD;

    public ProduitLaitier(int quantite, double prix, int vitamineD) {
        super(quantite, prix);
        this.vitamineD = vitamineD;
    }

    public abstract String accompagnement();

    public String toString() {
        return super.toString() + " C'est un produit laitier qui contient " + vitamineD + " g de vitamine D. ";
    }

}