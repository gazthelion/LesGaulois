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
	        gaulois.parler("Désolé " + gaulois.getNom() + " mon village est déjà bien rempli.");
	    }
	}

	//Méthode afficher villageois
	public void afficherVillageois() {
	    System.out.println("Le village dirigé par " + chef.getNom() + " est habité par :");

	    for (int i = 0; i < nombreVillageois; i++) {
	        System.out.println("- " + villageois[i].getNom());
	    }
	}
	
	public void changerChef(Gaulois nouveauChef) {
	    if (nouveauChef != null) {
	        // Ancien chef devient villageois
	        Gaulois ancienChef = this.chef;
	        this.chef = nouveauChef;

	        // Message
	        ancienChef.parler("Je laisse mon grand bouclier au grand " + nouveauChef.getNom());
	        nouveauChef.parler("Merci !");

	        // On peut réintégrer l'ancien chef comme villageois
	        ajouterVillageois(ancienChef);
	    }
	}

	
}
