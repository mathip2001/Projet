import gestion.client.Client;
import gestion.client.Menu;
import gestion.fournisseur.Fournisseur;
import nourriture.entree.Entree;
import nourriture.entree.exemple.OmeletteDinde;
import nourriture.entree.exemple.Quiche;
import nourriture.entree.exemple.SaladeAvocat;
import nourriture.entree.exemple.SaladeVegetarienne;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opt;
        Scanner scanner = new Scanner(System.in);

        Fournisseur fournisseur = new Fournisseur();
        Menu menu = new Menu();
        ArrayList<Entree> entreeArrayList = new ArrayList<Entree>();
        entreeArrayList.add((Entree) (new OmeletteDinde()));
        entreeArrayList.add((Entree) (new Quiche()));
        entreeArrayList.add((Entree) (new SaladeVegetarienne()));
        entreeArrayList.add((Entree) (new SaladeAvocat()));
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
                    break;
                case 2:
                    clientLogin(clientArrayList, scanner, panier, menuArrayList, menu, entreeArrayList);
                    break;

                default:
                    System.out.println("Enter a valid number");

            }
        }
        while (opt != 0);
    }

    static void menu() {
        System.out.println("******************************Nutrition-project-JAVA-2021*********************************\n");
        System.out.print("**********************************************************************************************\n");
        System.out.print("*                                                                                            *\n");
        System.out.print("*                  1. ENTREPRISE                                                             *\n");
        System.out.print("*                  2. CLIENT                                                                 *\n");
        System.out.print("*                                                                                            *\n");
        System.out.print("*                  0. EXIT                                                                   *\n");
        System.out.print("**********************************************************************************************\n");
    }

    private static void entrepriseLogin(Fournisseur fournisseur, Scanner scanner, ArrayList<Menu> menuArrayList, Menu menu) {
        int opt;
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
                case 1: {
                    System.out.println("Entrer numero menu:");
                    menu.setItemNum(scanner.nextInt());
                    System.out.println("Enter item name:");
                    menu.setItemName(scanner.next());
                    System.out.println("Enter item price:");
                    menu.setItemPrice(scanner.nextInt());
                    menu.addNewItem(menu);
                    menuArrayList.add(menu);
                    break;
                }
                case 2: {
                    menu.displayItems(menuArrayList);
                    break;
                }
                case 3: {
                    fournisseur.afficherTabClient();
                    break;
                }
                default:
                    System.out.println("Enter a valid number");
            }
        } while (opt != 0);
    }

    private static void clientLogin(ArrayList<Client> clientArrayList, Scanner
            scanner, ArrayList<Menu> panierArrayList, ArrayList<Menu> menuArrayList, Menu menu, ArrayList<Entree> entreeArrayList) {
        int opt;
//        Client client = new Client();
        System.out.println("******************************Bienvenue dans le portail client**********************************");
        System.out.print("**********************************************************************************************\n");
        System.out.print("*                                                                                            *\n");
        System.out.print("*                  1. Menu predefinie                                                        *\n");
        System.out.print("*                  2. Menu personalisable                                                    *\n");
        System.out.print("*                                                                                            *\n");
        System.out.print("*                  0. EXIT                                                                   *\n");
        System.out.print("**********************************************************************************************\n");
        do {
            opt = scanner.nextInt();
            switch (opt) {
                case 1: {
                    System.out.println("hello therere");
                    break;
                }
                case 2: {
                    entreeChoice(scanner, entreeArrayList);
                    break;
                }
                default:
                    System.out.println("Enter a valid number");
            }

        } while (opt != 0);

    }

    private static void entreeChoice(Scanner scanner, ArrayList<Entree> entreeArrayList) {

        System.out.print("**********************************************************************************************\n");
        System.out.print("*                  Choississez votre entree                                                  *\n");
        System.out.print("**********************************************************************************************\n");
        Entree.afficherArrayEntree(entreeArrayList);
    }

}
