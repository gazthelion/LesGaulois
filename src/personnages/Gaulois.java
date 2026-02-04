package personnages;

public class Gaulois extends Personnage {

    protected double puissancePotion = 1; // multiplicateur pour la potion

    public Gaulois(String nom, int force) {
        super(nom, force);
    }

    // méthode pour boire une potion
    public void boirePotion(double puissance) {
        if (getNom().equalsIgnoreCase("Obélix")) {
            System.out.println("Le gaulois " + getNom() + " : « Non, Obélix Non !... Et tu le sais très bien ! »");
        } else {
            this.puissancePotion = puissance;
        }
    }

    @Override
    public String donnerAuteur() {
        return "Le gaulois";
    }

    @Override
    public void frapper(Personnage adversaire) {
        int forceCoup = (int) (getForce() * puissancePotion);

        System.out.println("Le gaulois " + getNom() +
                " donne un grand coup de force " + forceCoup +
                " au " + adversaire.getNom()  + ".");

        adversaire.recevoirCoup(forceCoup);

        if (puissancePotion > 1) {
            puissancePotion -= 0.5;
            if (puissancePotion < 1) {
                puissancePotion = 1;
            }
        }
    }
}
