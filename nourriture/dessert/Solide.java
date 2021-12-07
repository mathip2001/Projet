package nourriture.dessert;

public abstract class Solide extends ProduitLaitier {

    public Solide(int quantite, double prix, int vitamineD) {
        super(quantite, prix, vitamineD);
    }

    public abstract String accompagnement();

    public String toString() {
        return super.toString() + "Le produit laitier est solide. ";
    }


}