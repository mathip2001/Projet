package gestion.client;

import java.util.ArrayList;

public class Client {
    private int client_id;
    private String client_name;
    private int nombre_achat;
    private int item_num;

    public void addCustomerDetails(Client c) {
        this.client_name = c.client_name;
        this.item_num = c.item_num;
        this.nombre_achat = c.nombre_achat;
    }

    public void displayClientBill(ArrayList<Client> clientArrayList, String clientName, ArrayList<Menu> menuArrayList) {
        float total = 0;
        float discount = 0;
        for (Client c : clientArrayList) {
            if (c.getClient_name().equals(clientName)) {
                System.out.println("--------------------------------------");
                System.out.println("Client Id:" + c.getClient_id());
                System.out.println("Client Name:" + c.getClient_name());
                System.out.println("Nombre achat:" + c.getNombre_achat());
                System.out.println("--------------------------------------");
            }
            for (Menu menu : menuArrayList) {
                if (menu.getItemNum() == c.item_num) {
                    total += c.nombre_achat * menu.getItemPrice();
                }
            }
        }
        System.out.println("Facture avant reduction = " + total);

        if (total < 200) {
            discount = (total * 15) / 100;
        } else {
            if (total >= 200 && total < 700) {
                discount = (total * 25) / 100;
            } else {
                if (total > 700) {
                    discount = (total * 50) / 100;
                }
            }
        }
        System.out.println("Facture après reduction = " + (total - discount));


    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public int getNombre_achat() {
        return nombre_achat;
    }

    public void setNombre_achat(int nombre_achat) {
        this.nombre_achat = nombre_achat;
    }

    public int getItem_num() {
        return item_num;
    }

    public void setItem_num(int item_num) {
        this.item_num = item_num;
    }

    @Override
    public String toString() {
        return "Client{" +
                "client_id=" + client_id +
                ", client_name='" + client_name + '\'' +
                ", nombre_achat=" + nombre_achat +
                '}';
    }
}
