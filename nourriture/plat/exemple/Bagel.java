package nourriture.plat.exemple;

import nourriture.plat.PlatFroid;

public class Bagel extends PlatFroid {
    private final int glucides;
    private final int lipides;
    private final int protides;

    public Bagel(int quantite, int conservation, double prix, int glucides, int lipides, int protides) {
        super(quantite, conservation, prix);
        this.glucides = glucides;
        this.lipides = lipides;
        this.protides = protides;
    }

    public Bagel() {
        this(300, 2, 4.0, 30, 60, 45);
    }

    public String toString() {
        return super.toString() +
                "Le plat est un bagel (glucides = "
                + glucides + " g, lipides = " + lipides + " g, protides = " + protides + " g). ";
    }


}
