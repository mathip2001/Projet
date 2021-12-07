package nourriture.entree.exemple;

import nourriture.Sauce;
import nourriture.entree.SansViande;

public class SaladeAvocat extends SansViande implements Sauce {
    private boolean consistant;

    public SaladeAvocat(int quantite, double prix, int conservation, int kcal) {
        super(quantite, prix, conservation, kcal);
        this.consistant = false;
    }

    public SaladeAvocat() {
        this(150, 3.5, 2, 80);
    }

    public void doublerLaPortion() {
        quantite = quantite * 2;
        consistant = true;
    }

    public String toString() {
        String s = super.toString() + "C'est une salade avocat. " + ajouterSauce();
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

    public String ajouterSauce() {
        return "Nous vous ajoutons la sauce qui accompagne la salade avocat. ";
    }

}
