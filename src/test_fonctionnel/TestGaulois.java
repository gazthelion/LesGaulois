package test_fonctionnel;
import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;
import personnages.Soldat;

public class TestGaulois {
	public static void main(String[] args) {
		
		//Création du gaulois Panoramix
		Druide panoramix = new Druide("Panoramix");
		
		//appeler la méthode
		//panoramix.fabriquerPotion();
		/*
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 9);
		*/
		/*asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...>>.");
		
		//for(int i = 1; i<=3; i++) {
			//minus.recevoirCoup(3);
		//}
		
		//for (int i=1; i<=3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
			asterix.frapper(minus);
			minus.frapper(asterix);
			asterix.frapper(minus);
		//}*/
	
		        /// Création des gaulois
        Gaulois asterix = new Gaulois("Asterix", 5);
        Gaulois obelix = new Gaulois("Obelix", 8);
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 3);
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 4);
        Gaulois agecanonix = new Gaulois("Agecanonix", 2);
        
     // Druide donne potion
        panoramix.donnerPotion(asterix);
        panoramix.donnerPotion(obelix); // doit refuser
        panoramix.donnerPotion(assurancetourix);
        panoramix.donnerPotion(abraracourcix);
        panoramix.donnerPotion(agecanonix); // plus de doses

     // Début de la bataille
        System.out.println();
        asterix.parler("Bonjour à tous");

        Romain minus = new Romain("Minus", 6);

        minus.parler("UN GAU... UN GAUGAU...");

        // Combat jusqu'à ce qu'un adversaire tombe
        while (asterix.estVivant() && minus.estVivant()) {
            asterix.frapper(minus);
            if (!minus.estVivant()) break;
            minus.frapper(asterix);
		        }
		    }

	}	
