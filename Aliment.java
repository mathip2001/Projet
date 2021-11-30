public abstract class Aliment {
    private final int glucides;
    private final int lipides;
    private final int protides;
    private double poids;
    private double prix;

    public Aliment(int glucides,int lipides,int protides,double poids,double prix) {
       this.glucides = glucides;
       this.lipides = lipides;
       this.protides = protides;
       this.poids = poids;
       this.prix = prix;
    }

    //méthode pour changer le prix

}