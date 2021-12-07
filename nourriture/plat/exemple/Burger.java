package nourriture.plat.exemple;

import nourriture.plat.PlatChaud;

public class Burger extends PlatChaud {
    private final int glucides;
    private final int lipides;
    private final int protides;

    public Burger(int quantite, int tempsDeCuisson, double prix, int conservation, int glucides, int lipides, int protides) {
        super(quantite, tempsDeCuisson, prix, conservation);
        this.glucides = glucides;
        this.lipides = lipides;
        this.protides = protides;
    }

    public Burger() {
        this(300, 2, 2.50, 1, 50, 150, 115);
    }

    public String toString() {
        return super.toString() +
                "Le plat est un burger (glucides = " + glucides + " g, lipides = " + lipides + " g, protides = " + protides + " g). ";
    }
}
