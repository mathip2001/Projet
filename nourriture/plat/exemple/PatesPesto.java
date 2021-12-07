package nourriture.plat.exemple;

import nourriture.plat.PlatFroid;

public class PatesPesto extends PlatFroid {
    private final int glucides;
    private final int lipides;
    private final int protides;

    public PatesPesto(int quantite, int conservation, double prix, int glucides, int lipides, int protides) {
        super(quantite, conservation, prix);
        this.glucides = glucides;
        this.lipides = lipides;
        this.protides = protides;
    }

    public PatesPesto() {
        this(250, 3, 4.5, 30, 50, 35);
    }

    public String toString() {
        return super.toString() +
                "Le plat est des pates avec du pesto (glucides = " + glucides + " g, lipides = " + lipides + " g, protides = " + protides + " g). ";
    }

}
