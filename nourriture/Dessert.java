package nourriture;

public class Dessert {
    private int quantite;
    private double prix;

    public Dessert(int quantite, double prix) {
        this.quantite = quantite;
        this.prix = prix;
    }

    public String toString() {
        return "Dessert de prix : " + prix + " euros, quantite : " + quantite + " g. ";
    }


}
