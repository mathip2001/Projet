public class TarteAuxMyrtilles extends Fruit {

    public TarteAuxMyrtilles(int quantite, double prix, boolean antiOxydant) {
        super(quantite, prix, antiOxydant);
    }

    public TarteAuxMyrtilles() {
        this(150,3,true);
    }

    public String toString() {
        return super.toString() + "C'est une tarte aux myrtilles.";
    }

    
}
