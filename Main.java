import gestion.client.Client;
import gestion.client.Menu;
import gestion.fournisseur.Fournisseur;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opt;
        Scanner scanner = new Scanner(System.in);

        Fournisseur fournisseur = new Fournisseur();
        Menu menu = new Menu();

        ArrayList<Menu> menuArrayList = new ArrayList<Menu>();
        ArrayList<Menu> panier = new ArrayList<Menu>();
        ArrayList<Client> clientArrayList = new ArrayList<Client>();
        do {
            menu();
            opt = scanner.nextInt();//exception
            switch (opt) {
                case 0:
                    break;
                case 1:
                    entrepriseLogin(fournisseur, scanner, menuArrayList, menu);
                case 2:
                    clientLogin(clientArrayList, scanner, panier, menuArrayList, menu);

                default:
                    System.out.println("Enter a valid number");

            }
        }
        while (opt != 0);
    }

    static void menu() {
        System.out.println("\n\t******************************Nutrition-project-JAVA-2021*********************************\n");
        System.out.print("\t**********************************************************************************************\n");
        System.out.print("\t*                                                                                            *\n");
        System.out.print("\t*                  1. ENTREPRISE                                                             *\n");
        System.out.print("\t*                  2. CLIENT                                                                 *\n");
        System.out.print("\t*                                                                                            *\n");
        System.out.print("\t*                  0. EXIT                                                                   *\n");
        System.out.print("\t**********************************************************************************************\n");
    }

    private static void entrepriseLogin(Fournisseur fournisseur, Scanner scanner, ArrayList<Menu> menuArrayList, Menu menu) {
        int opt;
//        boolean checkadmin = false;
        System.out.println("*****************Bienvenue dans le portail entreprise***********************");
        String userName;
        String userPassword;
        System.out.print("USERNAME-->");
        userName = scanner.next();
        System.out.print("Password-->");
        userPassword = scanner.next();
        do {
            System.out.println("1- Ajouter un nouveau menu");
            System.out.println("2- Afficher tous les menus");
            System.out.println("3- Information sur vos client");
            System.out.println("0- Exit");
            opt = scanner.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("Entrer numero menu:");
                    menu.setItemNum(scanner.nextInt());
                    System.out.println("Enter item name:");
                    menu.setItemName(scanner.next());
                    System.out.println("Enter item price:");
                    menu.setItemPrice(scanner.nextInt());
                    menu.addNewItem(menu);
                    menuArrayList.add(menu);
                }
                case 2 -> menu.displayItems(menuArrayList);
                case 3 -> fournisseur.afficherTabClient();
            }
        } while (opt != 0);
    }

    private static void clientLogin(ArrayList<Client> clientArrayList, Scanner scanner, ArrayList<Menu> panierArrayList, ArrayList<Menu> menuArrayList, Menu menu) {
        Client client = new Client();
        System.out.println("*****************Bienvenue dans le portail client***********************");
        System.out.println("Entrer votre nom ");
        client.setClient_name(scanner.next());
        System.out.println("Que souhaitez vous acheter?");
        System.out.println("Liste d'items qui s'affiche");
        menu.displayItems(menuArrayList);
        //Verifier si produit est trouve
        client.setItem_num(scanner.nextInt());
        System.out.println("Quel quantite vous voulez?");
        client.setNombre_achat(scanner.nextInt());
        System.out.println("Voulez vous poursuivre vos achat? (Yes/No)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            clientLogin(clientArrayList, scanner, panierArrayList, menuArrayList, menu);
        } else {
            client.displayClientBill(clientArrayList, client.getClient_name(), panierArrayList);
        }
    }

}
