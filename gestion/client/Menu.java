package gestion.client;

import nourriture.dessert.Dessert;
import nourriture.entree.Entree;
import nourriture.plat.Plat;

import java.util.ArrayList;

public class Menu {
    public static int menuTotalCreated = 0;
    private final int menuNumber;
    private String itemName;
    private int itemPrice;


    private Entree entree;
    private Plat plat;
    private Dessert dessert;


    public Menu(Entree entree, Plat plat, Dessert dessert) {
        this.menuNumber = menuTotalCreated;
        this.entree = entree;
        this.plat = plat;
        this.dessert = dessert;
        menuTotalCreated++;
    }


    public static void displayItems(ArrayList<Menu> shopArrayList) {
        if (shopArrayList.isEmpty()) {
            System.out.println("Il n y a pas de menus disponible pour le moment");
        }
        for (Menu menu : shopArrayList) {
            System.out.println("--------------------------------------");
            System.out.println("Item Num:" + menu.menuNumber);
            System.out.println("Item Name:" + menu.itemName);
            System.out.println("Item Price:" + menu.itemPrice);
            System.out.println(menu.entree);
            System.out.println(menu.plat);
            System.out.println(menu.dessert);
            System.out.println("--------------------------------------");

        }
    }

    public Menu addNewMenu(Menu m) {
        return new Menu(m.getEntree(), m.getPlat(), m.getDessert());
    }

    public int getItemNum() {
        return menuNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
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

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
