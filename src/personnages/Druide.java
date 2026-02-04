package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {

    private Random random;
    private int dosesDisponibles;

    public Druide(String nom) {
        super(nom, 0); // les druides n'ont pas de force
        dosesDisponibles = 3; // tu peux changer le nombre de doses
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   /* public void fabriquerPotion() {
        int puissance = random.nextInt(5) + 2; // 2 à 6
        System.out.println("Le gaulois " + getNom() + " : « J'ai concocté " + dosesDisponibles
                + " doses de potion magique. Elle a une force de " + puissance + ". »");
    }*/

    public void donnerPotion(Gaulois gaulois) {
        if (dosesDisponibles <= 0) {
            System.out.println("Le gaulois " + getNom() + " : « Désolé " + gaulois.getNom()
                    + " il n'y a plus une seule goutte de potion. »");
            return;
        }

        dosesDisponibles--;

        System.out.println("Le gaulois " + getNom() + " : « Tiens " + gaulois.getNom()
                + " un peu de potion magique. »");

        gaulois.boirePotion( 2); // puissance 2 ou 3 pour correspondre à l'exemple
    }
}
