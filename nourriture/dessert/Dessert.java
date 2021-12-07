package nourriture.dessert;

public abstract class Dessert {
    private int quantite;
    private double prix;

    public Dessert(int quantite, double prix) {
        this.quantite = quantite;
        this.prix = prix;
    }

    public abstract String accompagnement();

    public String toString() {
        return "Dessert de prix : " + prix + " euros, quantite : " + quantite + " g. ";
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
