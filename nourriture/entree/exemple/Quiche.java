package nourriture.entree.exemple;

import nourriture.entree.AvecViande;

public class Quiche extends AvecViande {
    private final boolean aRechauffer;

    public Quiche(int quantite, double prix, int kcal, boolean aRechauffer) {
        super(quantite, prix, kcal);
        this.aRechauffer = aRechauffer;
    }

    public Quiche() {
        this(200, 3.0, 250, true);
    }


    public String toString() {
        String s = super.toString() + "C'est une quiche. ";
        if (aRechauffer) {
            s = s + "Il faut penser a rechauffer cette entree pour de meilleurs saveurs.";
        } else {
            s = s + "L'entree est livree chaude, vous pouvez la deguster sans la rechauffer.";
        }
        return s;
    }
}
