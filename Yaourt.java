public class Yaourt extends Liquide{

    public Yaourt(int quantite,double prix,boolean sucre,int vitamineD) {
        super(quantite,prix,vitamineD);
    }

    public Yaourt() {
        this(150,0.5,false,30);
    }

    public String accompagnement() {
        return "Le dessert n'est pas sucre, selon vos gouts, il faudra ou non ajouter du sucre. Le sucre vous est founis.";
    }

    public String toString() {
        return super.toString() + "C'est un yaourt non sucre. " + accompagnement();
    }
}
