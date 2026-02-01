package test_fonctionnel;
import personnages.Gaulois;
import personnages.Druide;
public class TestGaulois {
	public static void main(String[] args) {
		
		//Création du gaulois Panoramix
		Druide panoramix = new Druide("Panoramix",3);
		
		//appeler la méthode
		panoramix.fabriquerPotion();
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
	}	
}
