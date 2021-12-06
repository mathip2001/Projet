public class GateauBanane extends Fruit{
    

    public GateauBanane(int quantite, double prix, boolean antiOxydant) {
        super(quantite, prix, antiOxydant);
    }

    public GateauBanane() {
        this(100,0.5,false);
    }

    public String toString() {
        return super.toString() + "C'est un gateau a la banane.";
    }
}
