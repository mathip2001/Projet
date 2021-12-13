import gestion.client.Client;
import gestion.client.Menu;
import gestion.fournisseur.Fournisseur;
import nourriture.dessert.Dessert;
import nourriture.entree.Entree;
import nourriture.plat.Plat;

import java.util.ArrayList;

public class ManageChoice extends Thread {
    private static int numScreen = 1;
    private final Display display;
    private final UserInput userInput;
    private final ArrayList<Menu> menuDisponible;
    private final ArrayList<Entree> entreeDisponible;
    private final ArrayList<Plat> platDisponible;
    private final ArrayList<Dessert> dessertsDisponible;
    private final ArrayList<Menu> panier;
    private final ArrayList<Client> clients;
    private final Fournisseur fournisseur;
    private String clientName;
    private int item;
    private float total;

    public ManageChoice(Display display, UserInput userInput, ArrayList<Menu> menuDisponible, ArrayList<Entree> entreeDisponible, ArrayList<Plat> platDisponible, ArrayList<Dessert> dessertsDisponible, ArrayList<Menu> panier, Fournisseur fournisseur) {
        this.display = display;
        this.userInput = userInput;
        this.menuDisponible = menuDisponible;
        this.entreeDisponible = entreeDisponible;
        this.platDisponible = platDisponible;
        this.dessertsDisponible = dessertsDisponible;
        this.panier = panier;
        this.clients = fournisseur.getTabClient();
        this.fournisseur = fournisseur;
        clientName = "";
        total = 0;
    }

    public void getToScreen(String i) {
        try {
            numScreen = Integer.parseInt(i);
        } catch (Exception e) {
            System.out.println("Entrer un nombre valide");
        }
    }

    public void iteration() throws InterruptedException {
        switch (numScreen) {
            case 0:
                break;
            case 1://First screen
                display.displayWindow("Entreprise", "Client");
                break;
            case 11:
                display.displayTitle("Bienvenue dans le portail entreprise");
                display.displayWindow("Manage menu ressource", "Manage finance");
                break;
            case 111:
                display.displayWindow("Ajouter un menu", "Afficher tous les menus");
                break;
            case 1111:
                int choice;
                Entree tmpEmtree;
                Plat tmpPlat;
                Dessert tmpDessert;
                display.displayQuote("Enter menu name:");
                String name = userInput.getUserChoice();

                Entree.afficherArrayEntree(entreeDisponible);
                display.displayQuote("Select a Entree in the list (Enter only one number plz)");
                choice = userInput.getIndexValue(entreeDisponible.size());
                tmpEmtree = entreeDisponible.get(choice);

                Plat.afficherArrayPlat(platDisponible);
                display.displayQuote("Select a Plat in the list (Enter only one number plz)");
                choice = userInput.getIndexValue(platDisponible.size());
                tmpPlat = platDisponible.get(choice);

                Dessert.afficherArrayDessert(dessertsDisponible);
                display.displayQuote("Select a Dessert in the list (Enter only one number plz)");
                choice = userInput.getIndexValue(dessertsDisponible.size());
                tmpDessert = dessertsDisponible.get(choice);

                display.displayMenuToAdd(tmpEmtree, tmpPlat, tmpDessert);

                if (userInput.getUserChoice().equals("1")) {
                    menuDisponible.add(new Menu(tmpEmtree, tmpPlat, tmpDessert,1));
                    display.displayQuote("Menu correctly add");
                } else display.displayQuote("Menu not add");
                display.displayQuote("Press 0 to go back");
                break;
            case 1112:
                Menu.displayItems(menuDisponible);
                display.displayQuote("Press 0 to go back");

                break;
            case 112:
                display.displayWindow("Show all client", "See profit");
                break;
            case 1121:
                display.displayAllClient(clients);
                display.displayQuote("Press 0 to go back");
                break;
            case 1122:
                display.displayFournisseurTurnover(fournisseur);
                display.displayQuote("Press 0 to go back");
                break;
            case 12:
                display.displayTitle("Bienvenue dans le portail client");
                display.displayWindow("Achat ", "Paiement");
                break;
            case 121:
                display.displayWindow("Menu predefinie ", "Menu personalisable");
                break;
            case 1211:
                display.displayQuote("This functionality will be availaible soon. Get back in few month :)");
                display.displayQuote("Press 0 to go back");
                break;
            case 1212:
                display.displayQuote("Enter your name:");
                clientName = userInput.getUserChoice();
                if (fournisseur.checkIfClientPresent(clientName)) {
                    display.displayQuote("Ravi de vous revoir " + clientName);
                } else {
                    fournisseur.addTabClient(clientName);
                    display.displayQuote("Bienvenue pour la premiere fois " + clientName + " sur la meilleure boutique");
                    panier.clear();
                }
                sleep(2000);

                Entree.afficherArrayEntree(entreeDisponible);
                display.displayQuote("Select a Entree in the list (Enter only one number plz)");
                choice = userInput.getIndexValue(entreeDisponible.size());
                tmpEmtree = entreeDisponible.get(choice);

                Plat.afficherArrayPlat(platDisponible);
                display.displayQuote("Select a Plat in the list (Enter only one number plz)");
                choice = userInput.getIndexValue(platDisponible.size());
                tmpPlat = platDisponible.get(choice);

                Dessert.afficherArrayDessert(dessertsDisponible);
                display.displayQuote("Select a Dessert in the list (Enter only one number plz)");
                choice = userInput.getIndexValue(dessertsDisponible.size());
                tmpDessert = dessertsDisponible.get(choice);
                display.displayQuote("How much do you want to buy?");
                choice = userInput.getIndexValue(1000);
                item = choice;
                total = display.displayMenuToAddClient(tmpEmtree, tmpPlat, tmpDessert, item);
                if (userInput.getUserChoice().equals("1")) {
                    panier.add(new Menu(tmpEmtree, tmpPlat, tmpDessert,item));
                    display.displayQuote("Menu correctly add to your bag");
                } else display.displayQuote("Menu not add to your bag");
                display.displayQuote("Press 0 to go back");
                break;
            case 122:
                display.displayClientBill(clients, clientName, panier);
                sleep(5000);
                System.out.println(clientName);
                float price = display.displayClientWithReduction(clients, clientName, panier);
                if (userInput.getUserChoice().equals("1")) {
                    for(Menu menuPanier:panier) {
                        fournisseur.updateClientData(clientName, menuPanier.getQuantite());
                        fournisseur.updateTurnover(menuPanier.getMenuPrice());
                    }
                    panier.clear();
                    display.displayQuote("Congratulation you finish the transaction");
                } else display.displayQuote("Dommage!");
                display.displayQuote("Press 0 to go back");
                break;
            default:
                System.out.println("Please enter a valid number");
        }
    }

}
