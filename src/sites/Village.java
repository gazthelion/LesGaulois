package sites;
import personnages.Gaulois;
import personnages.Soldat;

public class Village {
	
	//Création de l'attribut chef;
	private Gaulois chef;
	private Gaulois []villageois;
	int nombreVillageois=0;
	
	//Création du constructeur
	public Village(Gaulois chef) {
		this.chef=chef;
		this.villageois=new Gaulois[4];
		this.nombreVillageois=0;
	}
	
	//methode getChef
	public Gaulois getChef() {
		return chef;
	}
	
	//Méthode ajouterSoldat dans le camp //
	public void ajouterVillageois(Gaulois gaulois) {
	    if (nombreVillageois < villageois.length) {
	        villageois[nombreVillageois] = gaulois;
	        nombreVillageois++;
	        chef.parler("Bienvenue " + gaulois.getNom() + " !");
	    } else {
	        chef.parler("Désolé " + gaulois.getNom() + " mon village est déjà bien rempli.");
	    }
	}


}
