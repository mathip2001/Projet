import gestion.client.Menu;
import gestion.fournisseur.Fournisseur;
import nourriture.dessert.Dessert;
import nourriture.dessert.exemple.Fromage;
import nourriture.dessert.exemple.GateauBanane;
import nourriture.dessert.exemple.TarteAuxMyrtilles;
import nourriture.dessert.exemple.Yaourt;
import nourriture.entree.Entree;
import nourriture.entree.exemple.OmeletteDinde;
import nourriture.entree.exemple.Quiche;
import nourriture.entree.exemple.SaladeAvocat;
import nourriture.entree.exemple.SaladeVegetarienne;
import nourriture.plat.Plat;
import nourriture.plat.exemple.Bagel;
import nourriture.plat.exemple.Burger;
import nourriture.plat.exemple.PatesPesto;
import nourriture.plat.exemple.RizDinde;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String option = "1";
        Display display = new Display();
        UserInput userInput = new UserInput();
        ArrayList<Menu> menuDisponible = new ArrayList<Menu>();
        ArrayList<Menu> panier = new ArrayList<Menu>();
        ArrayList<Entree> entreeDisponible = new ArrayList<Entree>();
        ArrayList<Plat> platDisponible = new ArrayList<Plat>();
        ArrayList<Dessert> dessertsDisponible = new ArrayList<Dessert>();
        Fournisseur fournisseur = Fournisseur.getInstance("Carrefour", "0123456789", "carrefour@gmail.com", "Jussieu");

        initElementAvailable(entreeDisponible, platDisponible, dessertsDisponible);

        ManageChoice manageChoice = new ManageChoice(display, userInput, menuDisponible, entreeDisponible, platDisponible, dessertsDisponible, panier, fournisseur);

        while (!option.equals("Error") && !option.equals("")) {
            manageChoice.iteration();
            option = option + userInput.getUserChoice();
            if (option.endsWith("0")) {
                option = option.substring(0, option.length() - 2);
            }
            display.clearConsole();
            if(!option.equals("")){
            manageChoice.getToScreen(option);
        }}
        System.out.println("Au revoir");
    }

    private static void initElementAvailable
            (ArrayList<Entree> entreeDisponible, ArrayList<Plat> platDisponible, ArrayList<Dessert> dessertsDisponible) {
        //Ajout des plats
        entreeDisponible.add(new OmeletteDinde());
        entreeDisponible.add(new Quiche());
        entreeDisponible.add(new SaladeAvocat());
        entreeDisponible.add(new SaladeVegetarienne());

        platDisponible.add(new Bagel());
        platDisponible.add(new Burger());
        platDisponible.add(new PatesPesto());
        platDisponible.add(new RizDinde());

        dessertsDisponible.add(new Fromage());
        dessertsDisponible.add(new GateauBanane());
        dessertsDisponible.add(new TarteAuxMyrtilles());
        dessertsDisponible.add(new Yaourt());
    }


}
