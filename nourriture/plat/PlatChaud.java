package nourriture.plat;

public class PlatChaud extends Plat {
    private int tempsDeCuisson;
    private int conservation;

    public PlatChaud(int quantite, int tempsDeCuisson, double prix, int conservation) {
        super(quantite, prix, "C'est un plat chaud, il faut " + tempsDeCuisson
                + " minute(s) pour le rechauffer. "
                + "Ce plat peut se conserver " + conservation + " jour(s). ");
        this.tempsDeCuisson = tempsDeCuisson;
        this.conservation = conservation;
    }

    public String toString() {
        return super.toString()
                + "C'est un plat chaud, il faut " + tempsDeCuisson
                + " minute(s) pour le rechauffer. "
                + "Ce plat peut se conserver " + conservation + " jour(s). ";
    }


}