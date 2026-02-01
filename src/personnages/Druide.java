package personnages;
import java.util.Random;
import java.util.random.*;

public class Druide extends Gaulois {

	//création des attributs
	private int forcePotion;
	
	//Création du constructeur
	public Druide(String nom, int force) {
		super(nom,force);
	}
	
	//Méthode pour fabriquer la potion
	public void fabriquerPotion() {
		Random random = new Random();
		int doses = random.nextInt(5)+1;
		forcePotion = random.nextInt(5)+2;
		
		parler("j'ai concocté " + doses + " doses de potion magiques. Elle a une force de " + forcePotion + ".");
	}
	
	public int getForcePotion() {
		return forcePotion;
	}
}
