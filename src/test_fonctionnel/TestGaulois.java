package test_fonctionnel;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 9);
		asterix.parler("Bonjour à tous");
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
		//}
	}	
}
