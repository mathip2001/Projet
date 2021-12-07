package nourriture.entree.exemple;

import nourriture.entree.AvecViande;

public class OmeletteDinde extends AvecViande {
    private boolean aRechauffer;

    public OmeletteDinde(int quantite, double prix, int kcal, boolean aRechauffer) {
        super(quantite, prix, kcal);
        this.aRechauffer = aRechauffer;
    }

    public OmeletteDinde() {
        this(300, 5.0, 400, true);
    }

    public void livrerChaud() {
        aRechauffer = false;
    }

    public String toString() {
        String s = super.toString() + "C'est une omelette avec des morceaux de dindes. ";
        if (aRechauffer) {
            s = s + "Il faut penser a rechauffer cette entree pour de meilleurs saveurs.";
        } else {
            s = s + "L'entree est livree chaude, vous pouvez la deguster sans la rechauffer.";
        }
        return s;
    }
}
