public class Plat {
    private int quantite;
    private double prix;

    public Plat (int quantite,double prix) { 
        this.quantite = quantite;
        this.prix = prix;
    }

    public String toString() {
        return "Plat de prix : " + prix + " euros, quantite : " + quantite + " g. ";
    }
    
}