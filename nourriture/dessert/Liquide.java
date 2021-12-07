package nourriture.dessert;

public abstract class Liquide extends ProduitLaitier {

    public Liquide(int quantite, double prix, int vitamineD) {
        super(quantite, prix, vitamineD);
    }

    public abstract String accompagnement();

    public String toString() {
        return super.toString() + "Le produit laitier est liquide. ";
    }

}