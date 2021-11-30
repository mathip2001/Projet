package nourriture;

public class PlatFroid extends Plat {
    private double conservation;

    public PlatFroid(Aliment []tabAliment,int quantite,double conservation,double prix) {
        super(tabAliment,quantite);
        this.conservation = conservation;
    }

    /* creer methode plat froid */
}