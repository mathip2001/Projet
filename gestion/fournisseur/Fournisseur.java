package gestion.fournisseur;

import gestion.client.Client;

import java.util.ArrayList;

public class Fournisseur {
    private static int nbClient = 0;
    private String fournisseurName;
    private String fournisseurPhone;
    private String fournisseurMail;
    private String fournisseurAdress;
    private int chiffreAffaire = 0;
    private ArrayList<Client> tabClient;

    public Fournisseur(String fournisseurName, String fournisseurPhone, String fournisseurMail, String fournisseurAdress) {
        this.fournisseurName = fournisseurName;
        this.fournisseurPhone = fournisseurPhone;
        this.fournisseurMail = fournisseurMail;
        this.fournisseurAdress = fournisseurAdress;
        this.tabClient = new ArrayList<Client>();
        nbClient++;
    }

    public Fournisseur() {
        this("No name", "No phone", "No mail", "No address");
    }

    public void addTabClient(Client c) {
        tabClient.add(c);
    }

    public void afficherTabClient() {
        if (tabClient.isEmpty()) {
            System.out.println("Aucun client pour le moment");
        }
        for (Client client : tabClient) {
            System.out.println(client);
        }
    }

    public int getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void updateChiffreAffaire(int chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }
}
