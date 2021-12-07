package gestion.client;

public class Personne {
    private static int compteur = 0;
    private final int id;
    private int solde;
    private double distance;

    public Personne() {
        solde = (int) (Math.random() * (100));
        this.id = compteur;
        compteur++;
    }

    //méthode baisser argent 

}