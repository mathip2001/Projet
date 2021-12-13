package gestion.client;

public class Client {
    private final int clientId;
    private static int id = 0;
    private String client_name;
    private int nombre_achat;
    private Statut statut = Statut.BRONZE;


    private int discount;

    public Client(String name, int nombreAchat) {
        this.client_name = name;
        this.nombre_achat = nombreAchat;
        this.clientId = id;
        id++;
    }


    public Client(String name) {
        this(name, 0);
    }

    public Statut getStatut() {
        if (nombre_achat > 5) {
            statut = Statut.SILVER;
            discount = 5;
        }
        if (nombre_achat > 5 && nombre_achat < 20) {
            statut = Statut.GOLD;
            discount = 10;

        }
        if (nombre_achat > 20 && nombre_achat < 50) {
            statut = Statut.DIAMOND;
            discount = 20;
        }
        if (nombre_achat > 50) {
            statut = Statut.PLATINE;
            discount = 30;
        }
        return statut;
    }

    public int getClientId() {
        return clientId;
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

    public void updateNombreAchat(int nombre_achat) {
        this.nombre_achat = this.nombre_achat + nombre_achat;
        statut = getStatut();
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "client_id=" + clientId +
                ", client_name='" + client_name + '\'' +
                ", nombre_achat=" + nombre_achat +
                '}';
    }


    enum Statut {BRONZE, SILVER, GOLD, DIAMOND, PLATINE}
}
