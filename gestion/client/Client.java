package gestion.client;

public class Client {
    private int client_id;
    private String client_name;
    private int nombre_achat;
    private Statut statut = Statut.BRONZE;


    private int discount;

    public Client(String name, int nombreAchat) {
        this.client_name = name;
        this.nombre_achat = nombreAchat;
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
                "client_id=" + client_id +
                ", client_name='" + client_name + '\'' +
                ", nombre_achat=" + nombre_achat +
                '}';
    }


    enum Statut {BRONZE, SILVER, GOLD, DIAMOND, PLATINE}
}
