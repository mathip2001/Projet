import gestion.client.Client;
import gestion.client.Menu;
import gestion.fournisseur.Fournisseur;
import nourriture.dessert.Dessert;
import nourriture.entree.Entree;
import nourriture.plat.Plat;

import java.util.ArrayList;

public class Display {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\033[1;94m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String GREEN_BOLD_BRIGHT =  "\033[1;92m";
    public static final String BLUE_UNDERLINED = "\033[4;37m";

    public void displayFournisseurTurnover(Fournisseur f) {
        if (f.getTurnover() == 0) {
            System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

            System.out.print(ANSI_RED + "GET BACK TO WORK YOU HAVE NOTHING!!!!!                                                                                    \n" + ANSI_RESET);
            System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

        } else {
            System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

            System.out.print("                                                                                                                         \n");
            System.out.print("                  BENEFICE. " + f.getTurnover() + "€                                                                          \n");
            System.out.print("                                                                                                                         \n");
            System.out.print(ANSI_RED + "                  0. EXIT                                                                                                \n" + ANSI_RESET);
            System.out.print("                                                                                                                         \n");
            System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

        }
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void displayTitle(String title) {
        System.out.print(BLUE_UNDERLINED + title + "\n" + ANSI_RESET);
    }

    public void displayQuote(String quote) {


        System.out.println(GREEN_BOLD_BRIGHT + quote + ANSI_RESET);


    }

    public void displayWindow(String message1, String message2) {
        System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);
        System.out.print("                                                                                                                         \n");
        System.out.print("                  1. " + message1 + "                                                                                    \n");
        System.out.print("                  2. " + message2 + "                                                                                    \n");
        System.out.print("                                                                                                                         \n");
        System.out.print(ANSI_RED + "                  0. EXIT                                                                                                \n" + ANSI_RESET);
        System.out.print("                                                                                                                         \n");
        System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

    }

    public void displayMenuToAdd(Entree e, Plat p, Dessert d) {
        System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

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
        System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

    }

    public float displayMenuToAddClient(Entree e, Plat p, Dessert d, int n) {
        System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

        System.out.print("                                                                                                                         \n");
        System.out.print("                  Id : " + Menu.menuTotalCreated + "                                                                                                      \n");
        System.out.print("                  Entree : " + e.getName() + "                                                                                    \n");
        System.out.print("                  Plat : " + p.getName() + "                                                                                    \n");
        System.out.print("                  Dessert : " + d.getName() + "                                                                                    \n");
        System.out.print("                  Prix: " + (e.getPrix() + p.getPrix() + d.getPrix()) * n + "                                                                                    \n");
        System.out.print("                                                                                                                         \n");
        System.out.print("                  1. Confirm to add to your bag                                                                                     \n");
        System.out.print("                  0. EXIT                                                                                                \n");
        System.out.print("                                                                                                                         \n");
        System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

        return (float) ((e.getPrix() + p.getPrix() + d.getPrix()) * n);
    }

    public void displayClientBill(ArrayList<Client> clientArrayList, String clientName, ArrayList<Menu> panier) {
        float total = 0;
        for (Menu p : panier) {
            total = p.getMenuPrice() * p.getQuantite() + total;
        }
        for (Client c : clientArrayList) {
            if (c.getClient_name().equals(clientName)) {
                System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

                System.out.println("Client Id :" + c.getClientId());
                System.out.println("Client Name :" + c.getClient_name());
                System.out.println("Nombre achat precedent:" + c.getNombre_achat());
                System.out.println("Statut :" + c.getStatut());
                System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

            }

        }
        System.out.println("Facture avant reduction = " + total + "€");
    }

    public float displayClientWithReduction(ArrayList<Client> clientArrayList, String clientName, ArrayList<Menu> panier) {
        float total = 0;
        for (Menu p : panier) {
            total = p.getMenuPrice() * p.getQuantite() + total;
        }
        float discount = 0;
        for (Client c : clientArrayList) {
            if (c.getClient_name().equals(clientName)) {

                System.out.println("Vous avez le statut " + c.getStatut() + " vous avez droit a " + c.getDiscount() + "% de reduction");
                System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

                discount = c.getDiscount();
            }

        }
        total = (total - total * (discount / 100));
        System.out.println("Apres reduction, il vous reste a payer= " + total + "€");
        displayQuote("1. Proceed to payment \n0. Cancel payment");
        return total;
    }

    public void displayAllClient(ArrayList<Client> clientArrayList) {
        if (clientArrayList.isEmpty()) {

            System.out.println("Aucun Client pour le moment!");
            System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

        } else
            for (Client c : clientArrayList) {
                System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);

                System.out.println("Client Id:" + c.getClientId());
                System.out.println("Client Name:" + c.getClient_name());
                System.out.println("Nombre achat:" + c.getNombre_achat());
                System.out.print(ANSI_CYAN + "***************************************************************************************************************************\n" + ANSI_RESET);


            }
    }
}
