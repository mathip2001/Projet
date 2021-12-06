public class SaladeAvocat extends SansViande {
    private boolean consistant;

    public SaladeAvocat(int quantite, double prix, int conservation) {
        super(quantite, prix, conservation);
        this.consistant = false;
    }

    public SaladeAvocat() {
        this(150,3.5,2);
    }
    
    public void doublerLaPortion() {
        quantite = quantite * 2;
        consistant = true;
    }

    public String toString() {
        String s = super.toString() + "C'est une salade avocat. ";
        if (consistant) {
            s = s + "La portion est genereuse. ";
        } else {
            s = s + "Pour information, la portion est petite. ";
        }
        return s;
    }

    public boolean isConsistant() {
        return consistant;
    }

    public void setConsistant(boolean consistant) {
        this.consistant = consistant;
    }
}
