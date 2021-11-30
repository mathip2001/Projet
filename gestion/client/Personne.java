package gestion.client;

public class Personne {
    private final int id;
    private static int compteur = 0;
    private int solde;
    private Fidelite fid;

    public Personne() {
        solde = (int)(Math.random()*(100));
        this.id = compteur;
        compteur++;
    }

    //méthode baisser argent 

}