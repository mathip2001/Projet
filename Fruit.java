public abstract class Fruit extends Dessert{
    private boolean antiOxydant;

    public Fruit(int quantite, double prix, boolean antiOxydant) {
        super(quantite, prix);
        this.antiOxydant = antiOxydant;
    }
    
    public abstract String accompagnement();

    public String toString() {
        if (antiOxydant) {
            return super.toString() + "Il contient un fruit. Il contient des anti-oxydants. ";
        } else {
            return super.toString() + "Il contient un fruit. Il contient peu d'anti-oxydants. ";
        }
    }
}
