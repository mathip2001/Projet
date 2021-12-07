package nourriture.dessert;

import nourriture.entree.Entree;
import nourriture.plat.Plat;

public class Menu {
    private Entree[] tabEntree;
    private Plat[] tabPlat;
    private Dessert[] tabDessert;
    private int nbEntree;
    private int nbPlat;
    private int nbDessert;

    public Menu() {
        tabEntree = new Entree[4];
        tabPlat = new Plat[4];
        tabDessert = new Dessert[4];
        nbEntree = tabEntree.length;
        nbPlat = tabPlat.length;
        nbDessert = tabDessert.length;
    }

    /*e0 = vegetarien; e1 = fitness; e2 = prise de masse; e3 = cheatmeal*/
    public void ajouterEntree(Entree e0, Entree e1, Entree e2, Entree e3) {
        tabEntree[0] = e0;
        tabEntree[1] = e1;
        tabEntree[2] = e2;
        tabEntree[3] = e3;
    }

    public void ajouterPlat(Plat p0, Plat p1, Plat p2, Plat p3) {
        tabPlat[0] = p0;
        tabPlat[1] = p1;
        tabPlat[2] = p2;
        tabPlat[3] = p3;
    }

    public void ajouterDessert(Dessert d0, Dessert d1, Dessert d2, Dessert d3) {
        tabDessert[0] = d0;
        tabDessert[1] = d1;
        tabDessert[2] = d2;
        tabDessert[3] = d3;
    }

    public String toString() {
        String s = "Notre boutique propose " + nbEntree + " entrees, " + nbPlat + " plats, " + nbDessert + " desserts.";
        s = s + "Voici la liste des entrees :\n";
        for (int i = 0; i < tabEntree.length; i++) {
            s = s + tabEntree[i] + "\n";
        }

        s = s + "Voici la liste des plats : \n";
        for (int i = 0; i < tabPlat.length; i++) {
            s = s + tabPlat[i] + "\n";
        }

        s = s + "Voici la liste des desserts : \n";
        for (int i = 0; i < tabDessert.length; i++) {
            s = s + tabDessert[i] + "\n";
        }

        return s;
    }

}