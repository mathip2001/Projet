package gestion.client;

import java.util.ArrayList;

public class Menu {

    private int itemNum;
    private String itemName;
    private int itemPrice;

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
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

    public void addNewItem(Menu m) {
        this.itemNum = m.itemNum;
        this.itemName = m.itemName;
        this.itemPrice = m.itemPrice;
    }

    public void displayItems(ArrayList<Menu> shopArrayList) {
        if (shopArrayList.isEmpty()) {
            System.out.println("Il n y a pas de menus disponible pour le moment");
        }
        for (Menu menu : shopArrayList) {
            System.out.println("--------------------------------------");
            System.out.println("Item Num:" + menu.itemNum);
            System.out.println("Item Name:" + menu.itemName);
            System.out.println("Item Price:" + menu.itemPrice);
            System.out.println("--------------------------------------");

        }
    }
}
