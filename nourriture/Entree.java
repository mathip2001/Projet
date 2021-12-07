package nourriture;

import java.util.ArrayList;

public class Entree {
    protected int quantite;
    private double prix;

    public Entree(int quantite, double prix) {
        this.quantite = quantite;
        this.prix = prix;
    }

    public static void afficherArrayEntree(ArrayList<Entree> entreeArrayList) {
        for (int i = 0; i < entreeArrayList.size(); i++) {
            System.out.print("**********************************************************************************************\n");
            System.out.print("*                 Choix :" + i + "                                                           *\n");
            System.out.print("*                 Prix :" + entreeArrayList.get(i).prix"                                                        *\n");
            System.out.print("*                  2. Menu personalisable                                                    *\n");
            System.out.print("*                                                                                            *\n");
            System.out.print("*                  0. EXIT                                                                   *\n");
            System.out.print("**********************************************************************************************\n");
            System.out.println(i + " " + entreeArrayList.get(i));
        }
    }

    public String toString() {
        return "Entree de prix : " + prix + " euros, quantite : " + quantite + " g. ";
    }

}
