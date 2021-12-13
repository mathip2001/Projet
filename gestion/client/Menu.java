package gestion.client;

import nourriture.dessert.Dessert;
import nourriture.entree.Entree;
import nourriture.plat.Plat;

import java.util.ArrayList;

public class Menu {
    public static int menuTotalCreated = 0;
    private final int menuNumber;
    private  int quantite;
    private Entree entree;
    private Plat plat;
    private Dessert dessert;


    public Menu(Entree entree, Plat plat, Dessert dessert,int quantite) {
        this.menuNumber = menuTotalCreated;
        this.entree = entree;
        this.plat = plat;
        this.dessert = dessert;
        this.quantite = quantite;
        menuTotalCreated++;
    }


    public static void displayItems(ArrayList<Menu> menuArrayList) {
        if (menuArrayList.isEmpty()) {
            System.out.println("Il n y a pas de menus disponible pour le moment");
        }
        for (Menu menu : menuArrayList) {
            System.out.println("**********************************************************************************************************************");
            System.out.println("Item Num: " + menu.getMenuNumber());
            System.out.println("Entree : " + menu.entree.getName());
            System.out.println("Plat : " + menu.plat.getName());
            System.out.println("Dessert : " +menu.dessert.getName());
            System.out.println("Item Price: " + menu.getMenuPrice());
            System.out.println("**********************************************************************************************************************\n");

        }
    }
    public int getItemNum() {
        return menuNumber;
    }

    public float getMenuPrice() {
        return (float) (entree.getPrix()+plat.getPrix()+dessert.getPrix());
    }

    public int getMenuNumber() {
        return menuNumber;
    }

    public Entree getEntree() {
        return entree;
    }

    public void setEntree(Entree entree) {
        this.entree = entree;
    }

    public Plat getPlat() {
        return plat;
    }

    public void setPlat(Plat plat) {
        this.plat = plat;
    }
    public int setQuantite() {
        return quantite;
    }
    public Dessert getDessert() {
        return dessert;
    }
    public int getQuantite() {
        return quantite;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
