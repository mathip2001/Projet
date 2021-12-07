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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    
    
}
