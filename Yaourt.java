public class Yaourt extends Liquide{
    private boolean sucre;
    public Yaourt(int quantite,double prix,boolean sucre,int vitamineD) {
        super(quantite,prix,vitamineD);
        this.sucre = sucre;
    }

    public Yaourt() {
        this(150,0.5,false,30);
    }

    public String ajouterSucre() {
        this.sucre = true;
        return "Le dessert n'est pas sucre, selon vos gouts, il faudra ou non ajouter du sucre";
    }

    public String toString() {
        if (sucre) {
            return super.toString() + "Comme demande, le sucre a ete ajoute. ";
        }
        return super.toString() + "C'est un yaourt non sucre. " + ajouterSucre();
    }
}
