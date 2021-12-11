import gestion.client.Client;
import gestion.client.Menu;
import gestion.fournisseur.Fournisseur;
import nourriture.dessert.Dessert;
import nourriture.entree.Entree;
import nourriture.plat.Plat;

import java.util.ArrayList;

public class Display {

    public void displayFournisseurTurnover(Fournisseur f) {
        if (f.getTurnover() == 0) {
            System.out.print("***************************************************************************************************************************\n");
            System.out.print(" GET BACK TO WORK YOU HAVE NOTHING!!!!!                                                                                    \n");
            System.out.print("***************************************************************************************************************************\n");
        } else {
            System.out.print("***************************************************************************************************************************\n");
            System.out.print("                                                                                                                         \n");
            System.out.print("                  BENEFICE. " + f.getTurnover() + "$                                                                          \n");
            System.out.print("                                                                                                                         \n");
            System.out.print("                  0. EXIT                                                                                                \n");
            System.out.print("                                                                                                                         \n");
            System.out.print("***************************************************************************************************************************\n");
        }
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void displayTitle(String title) {
        System.out.print("*********************************************" + title + "**************************************************\n");
    }

    public void displayQuote(String quote) {
        System.out.print("***************************************************************************************************************************\n");
        System.out.println(quote);
        System.out.print("***************************************************************************************************************************\n");

    }

    public void displayWindow(String message1, String message2) {
        System.out.print("***************************************************************************************************************************\n");
        System.out.print("                                                                                                                         \n");
        System.out.print("                  1. " + message1 + "                                                                                    \n");
        System.out.print("                  2. " + message2 + "                                                                                    \n");
        System.out.print("                                                                                                                         \n");
        System.out.print("                  0. EXIT                                                                                                \n");
        System.out.print("                                                                                                                         \n");
        System.out.print("***************************************************************************************************************************\n");
    }

    public void displayMenuToAdd(Entree e, Plat p, Dessert d) {
        System.out.print("***************************************************************************************************************************\n");
        System.out.print("                                                                                                                         \n");
        System.out.print("                  Id : " + Menu.menuTotalCreated + "                                                                                                      \n");
        System.out.print("                  Entree : " + e.getName() + "                                                                                    \n");
        System.out.print("                  Plat : " + p.getName() + "                                                                                    \n");
        System.out.print("                  Dessert : " + d.getName() + "                                                                                    \n");
        System.out.print("                  Prix: " + (e.getPrix() + p.getPrix() + d.getPrix()) + "                                                                                    \n");
        System.out.print("                                                                                                                         \n");
        System.out.print("                  1. Confirm to add                                                                                      \n");
        System.out.print("                  0. EXIT                                                                                                \n");
        System.out.print("                                                                                                                         \n");
        System.out.print("***************************************************************************************************************************\n");
    }

    public float displayMenuToAddClient(Entree e, Plat p, Dessert d, int n) {
        System.out.print("***************************************************************************************************************************\n");
        System.out.print("                                                                                                                         \n");
        System.out.print("                  Id : " + Menu.menuTotalCreated + "                                                                                                      \n");
        System.out.print("                  Entree : " + e.getName() + "                                                                                    \n");
        System.out.print("                  Plat : " + p.getName() + "                                                                                    \n");
        System.out.print("                  Dessert : " + d.getName() + "                                                                                    \n");
        System.out.print("                  Prix: " + (e.getPrix() + p.getPrix() + d.getPrix()) * n + "                                                                                    \n");
        System.out.print("                                                                                                                         \n");
        System.out.print("                  1. Confirm to buy                                                                                      \n");
        System.out.print("                  0. EXIT                                                                                                \n");
        System.out.print("                                                                                                                         \n");
        System.out.print("***************************************************************************************************************************\n");
        return (float) ((e.getPrix() + p.getPrix() + d.getPrix()) * n);
    }

    public void displayClientBill(ArrayList<Client> clientArrayList, String clientName, ArrayList<Menu> panier, float total) {
        for (Client c : clientArrayList) {
            if (c.getClient_name().equals(clientName)) {
                System.out.print("***************************************************************************************************************************\n");
                System.out.println("Client Id :" + c.getClient_id());
                System.out.println("Client Name :" + c.getClient_name());
                System.out.println("Nombre achat :" + c.getNombre_achat());
                System.out.println("Statut :" + c.getStatut());
                System.out.print("***************************************************************************************************************************\n");
            }

        }
        System.out.println("Facture avant reduction = " + total);
    }

    public float displayClientWithReduction(ArrayList<Client> clientArrayList, String clientName, ArrayList<Menu> panier, float total) {
        float discount = 0;
        for (Client c : clientArrayList) {
            if (c.getClient_name().equals(clientName)) {
                System.out.print("***************************************************************************************************************************\n");
                System.out.println("Vous avez le statut " + c.getStatut() + " vous avez droit a " + c.getDiscount() + "% de reduction");
                System.out.print("***************************************************************************************************************************\n");
                discount = c.getDiscount();
            }

        }
        total = (total - total * (discount / 100));
        System.out.println("Somme a regler = " + total);
        displayQuote("1. Proceed to payment");
        return total;
    }

    public void displayAllClient(ArrayList<Client> clientArrayList) {
        if (clientArrayList.isEmpty()) {
            System.out.print("***************************************************************************************************************************\n");
            System.out.println("Aucun Client pour le moment!");
            System.out.print("***************************************************************************************************************************\n");
        } else
            for (Client c : clientArrayList) {
                System.out.print("***************************************************************************************************************************\n");
                System.out.println("Client Id:" + c.getClient_id());
                System.out.println("Client Name:" + c.getClient_name());
                System.out.println("Nombre achat:" + c.getNombre_achat());
                System.out.print("***************************************************************************************************************************\n");

            }
    }
}
