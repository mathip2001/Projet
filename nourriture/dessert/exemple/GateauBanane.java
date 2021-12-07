package nourriture.dessert.exemple;

import nourriture.dessert.Fruit;

public class GateauBanane extends Fruit {


    public GateauBanane(int quantite, double prix, boolean antiOxydant) {
        super(quantite, prix, antiOxydant);
    }

    public GateauBanane() {
        this(100, 0.5, false);
    }

    public String accompagnement() {
        return "Nous vous offrons la sauce chocolat. ";
    }

    public String toString() {
        return super.toString() + "C'est un gateau a la banane. " + accompagnement();
    }
}