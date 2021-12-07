package nourriture.plat.exemple;

import nourriture.plat.PlatChaud;

public class RizDinde extends PlatChaud {
    private final int glucides;
    private final int lipides;
    private final int protides;

    public RizDinde(int quantite, int tempsDeCuisson, double prix, int conservation, int glucides, int lipides, int protides) {
        super(quantite, tempsDeCuisson, prix, conservation);
        this.glucides = glucides;
        this.lipides = lipides;
        this.protides = protides;
    }

    public RizDinde() {
        this(300, 3, 5.50, 2, 10, 30, 150);
    }

    public String toString() {
        return super.toString() +
                "Le plat est un riz accompagne de morceaux de blancs dinde" +
                "(glucides = " + glucides + " g, lipides = " + lipides + " g, protides = " + protides + " g). ";
    }

}
