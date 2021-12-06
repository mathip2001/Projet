public class Solide extends ProduitLaitier{

    public Solide(int quantite, double prix, int vitamineD) {
        super(quantite, prix, vitamineD);
    }

    public String toString() {
        return super.toString() + "Le produit laitier est solide. ";
    }

    
}
