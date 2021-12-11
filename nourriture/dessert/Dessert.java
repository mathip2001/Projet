package nourriture.dessert;

import java.util.ArrayList;

public abstract class Dessert {
    private int quantite;
    private double prix;
    private String description;

    public Dessert(int quantite, double prix, String description) {
        this.quantite = quantite;
        this.prix = prix;
        this.description = description;
    }

    public static void afficherArrayDessert(ArrayList<Dessert> dessertArrayList) {
        for (int i = 0; i < dessertArrayList.size(); i++) {
            System.out.println("**********************************************************************************************************************\n");
            System.out.println("                 Choix : " + i);
            System.out.println("                 Nom :  " + dessertArrayList.get(i).getName());
            System.out.println("                 Prix :  " + dessertArrayList.get(i).getPrix());
            System.out.println("                 Quantite : " + dessertArrayList.get(i).getQuantite() + " g");
            System.out.println(dessertArrayList.get(i).getDescription());
            System.out.println("**********************************************************************************************************************\n");
        }
    }


    public abstract String accompagnement();

    public String toString() {
        return "Dessert de prix : " + prix + " euros, quantite : " + quantite + " g. ";
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


}
