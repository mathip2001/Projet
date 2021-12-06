public class Entree {
    protected int quantite;
    private double prix;

    public Entree(int quantite, double prix) {
        this.quantite = quantite;
        this.prix = prix;
    }

    public String toString() {
        return "Entree de prix : " + prix + " euros, quantite : " + quantite + " g. ";
    }

    
    
}
