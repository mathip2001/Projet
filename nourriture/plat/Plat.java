package nourriture.plat;

import java.util.ArrayList;

public class Plat {
    private int quantite;
    private double prix;
    private String description;

    public Plat(int quantite, double prix, String description) {
        this.quantite = quantite;
        this.prix = prix;
        this.description = description;
    }

    public static void afficherArrayPlat(ArrayList<Plat> platArrayList) {
        for (int i = 0; i < platArrayList.size(); i++) {
            System.out.println("**********************************************************************************************************************\n");
            System.out.println("                 Choix : " + i);
            System.out.println("                 Nom :  " + platArrayList.get(i).getName());
            System.out.println("                 Prix :  " + platArrayList.get(i).getPrix());
            System.out.println("                 Quantite : " + platArrayList.get(i).getQuantite() + " g");
            System.out.println(platArrayList.get(i).getDescription());
            System.out.println("**********************************************************************************************************************\n");
        }
    }

    public String toString() {
        return "Plat de prix : " + prix + " euros, quantite : " + quantite + " g. ";
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

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public Plat clone() {
        return new Plat(quantite, prix, description);
    }
}