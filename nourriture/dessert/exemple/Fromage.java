package nourriture.dessert.exemple;

import nourriture.dessert.Solide;

public class Fromage extends Solide {
    private int matiereGrasse;

    public Fromage(int quantite, double prix, int vitamineD, int matiereGrasse) {
        super(quantite, prix, vitamineD);
        this.matiereGrasse = matiereGrasse;
    }

    public Fromage() {
        this(50, 2.50, 30, 30);
    }

    public String accompagnement() {
        return "Du fromage sans pain ? Nous vous offrons du pain bien evidemment";
    }

    public String toString() {
        return super.toString() + "C'est du fromage compose de " + matiereGrasse + "g de matiere grasse. " + accompagnement();
    }

}


