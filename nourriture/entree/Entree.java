package nourriture.entree;

import java.util.ArrayList;

public class Entree {
    protected int quantite;
    private double prix;
    private int kcal;
    private String description;

    public Entree(int quantite, double prix, String description, int kcal) {
        this.quantite = quantite;
        this.prix = prix;
        this.description = description;
        this.kcal = kcal;
    }

    public static void afficherArrayEntree(ArrayList<Entree> entreeArrayList) {
        for (int i = 0; i < entreeArrayList.size(); i++) {
            System.out.println("**********************************************************************************************************************\n");
            System.out.println("                 Choix : " + i);
            System.out.println("                 Nom :  " + entreeArrayList.get(i).getName());
            System.out.println("                 Prix :  " + entreeArrayList.get(i).getPrix());
            System.out.println("                 Quantite : " + entreeArrayList.get(i).getQuantite() + " g");
            System.out.println(entreeArrayList.get(i).getDescription() + entreeArrayList.get(i).getKcal() + "kcal");
            System.out.println("**********************************************************************************************************************\n");
        }
    }

    public String toString() {
        return "Entree de prix : " + prix + " euros, quantite : " + quantite + " g. ";
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

}