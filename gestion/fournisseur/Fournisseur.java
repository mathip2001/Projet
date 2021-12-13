package gestion.fournisseur;

import gestion.client.Client;

import java.util.ArrayList;

public class Fournisseur {
    private static Fournisseur instance;


    private static int nbClient = 0;


    private final ArrayList<Client> tabClient;
    private String fournisseurName;
    private String fournisseurPhone;
    private String fournisseurMail;
    private String fournisseurAdress;
    private float turnover = 0;

    private Fournisseur(String fournisseurName, String fournisseurPhone, String fournisseurMail, String fournisseurAdress) {
        this.fournisseurName = fournisseurName;
        this.fournisseurPhone = fournisseurPhone;
        this.fournisseurMail = fournisseurMail;
        this.fournisseurAdress = fournisseurAdress;
        this.tabClient = new ArrayList<Client>();
        nbClient++;
    }

    private Fournisseur() {
        this("No name", "No phone", "No mail", "No address");
    }

    public static Fournisseur getInstance(String fournisseurName, String fournisseurPhone, String fournisseurMail, String fournisseurAdress) {
        if (instance == null) {
            instance = new Fournisseur(fournisseurName, fournisseurPhone, fournisseurMail, fournisseurAdress);
        }
        return instance;
    }

    public void addTabClient(String c) {
        tabClient.add(new Client(c, 0));
    }

    public boolean checkIfClientPresent(String name) {
        for (Client c : tabClient) {
            if (c.getClient_name().equals(name)) return true;
        }
        return false;
    }

    public float getTurnover() {
        return turnover;
    }

    public ArrayList<Client> getTabClient() {
        return tabClient;
    }

    public void updateClientData(String name, int nbAchat) {
        for (Client c : tabClient) {
            if (c.getClient_name().equals(name)) {
                c.updateNombreAchat(nbAchat);
            }
        }
    }

    public void updateTurnover(float chiffreAffaire) {
        this.turnover = this.turnover + chiffreAffaire;
    }
}
