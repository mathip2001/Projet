package nourriture.dessert.exemple;

import nourriture.dessert.Liquide;

public class Yaourt extends Liquide {

    public Yaourt(int quantite, double prix,int vitamineD) {
        super(quantite, prix, vitamineD);
    }

    public Yaourt() {
        this(150, 0.5, 30);
    }

    public String accompagnement() {
        return "Le dessert n'est pas sucre, selon vos gouts, il faudra ou non ajouter du sucre. Le sucre vous est founis.";
    }

    public String toString() {
        return super.toString() + "C'est un yaourt non sucre. " + accompagnement();
    }
}