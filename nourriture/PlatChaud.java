package nourriture;

public class PlatChaud extends Plat {
    private double tempsDeCuisson;

    public PlatChaud(Aliment []tabAliment,int quantite,double tempsDeCuisson,double prix) {
        super(tabAliment,quantite);
        this.tempsDeCuisson = tempsDeCuisson;
    }


}