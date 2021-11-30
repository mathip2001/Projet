public class Plat {
    private Aliment[] tabAliment;
    private int quantite;
    private int nbAliment;
    private double prix;


    public Plat (int quantite,int taille,double prix) {
        tabAliment = new Aliment[taille];
        this.quantite = quantite;
        this.prix = prix;
    }

    public void ajouterPlat(Plat p) {
        if (nbAliment < tabAliment.length) {
            tabAliment[nbAliment] = p;
            nbAliment++;
            System.out.println("Aliment ajoute avec succes");
        } else {
            System.out.println("Impossible d'ajouter le plat");
        }
    }

    //faire une methode qui additionne le poids de tous les aliments

    //faire une méthode qui calcule le prix
}