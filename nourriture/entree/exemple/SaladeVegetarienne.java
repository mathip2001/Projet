package nourriture.entree.exemple;

import nourriture.entree.SansViande;

public class SaladeVegetarienne extends SansViande {
    private boolean consistant;

    public SaladeVegetarienne(int quantite, double prix, int conservation, int kcal) {
        super(quantite, prix, conservation, kcal);
        this.consistant = false;
    }

    public SaladeVegetarienne() {
        this(150, 4.5, 3, 50);
    }

    public void doublerLaPortion() {
        quantite = quantite * 2;
        consistant = true;
    }

    public String toString() {
        String s = super.toString() + "C'est une salade vegetarienne. ";
        if (consistant) {
            s = s + "La portion est genereuse. ";
        } else {
            s = s + "Pour information, la portion est petite. ";
        }
        return s;
    }

    public boolean isConsistant() {
        return consistant;
    }

    public void setConsistant(boolean consistant) {
        this.consistant = consistant;
    }


}
