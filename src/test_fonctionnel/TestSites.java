package test_fonctionnel;
import personnages.Gaulois;
import personnages.Romain;
//import personnages.Personnage;
import personnages.Soldat;
import personnages.Grade;
import personnages.Romain;
import sites.Village;
import sites.Camp;
public class TestSites {
	public static void main(String[] args) {
		//Création du gaulois Vercingétorix
		Gaulois vercingétorix = new Gaulois ("Vercingétorix", 5);
		//Création du chef du village
		Village village = new Village(vercingétorix);
		
		//Création du gaulois Agecanonix 
		Gaulois agecanonix = new Gaulois ("agecanonix", 1);
		
		//Création du gaulois Assurancetourix
		Gaulois assurancetourix = new Gaulois ("Assurancetourix", 2);
		
		//Création du gaulois Asterix
		Gaulois asterix = new Gaulois ("Asterix", 5);
		
		//Création du gaulois Asterix
		Gaulois obelix = new Gaulois ("Obelix", 15);
		
		//Création du gaulois Asterix
		Gaulois prolix = new Gaulois ("Prolix", 2);
				
		
		//Création du romain Minus
		Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
		
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		
		// Nouveau chef gaulois
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);

		// Nouveaux soldats
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);


		//création du camp avec  Minus comme commandant
		Camp camp = new Camp(minus);
		
		//vercingétorix.parler("Je suis un grand guerrier et je vais créer mon village");
		//minus.parler("Je suis en charge de créer un nouveau camp romain");
		//brutus.parler("Je mets mon épée au service de Rome dans le camp dirigé par Minus");
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(ballondebaudrus);

		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);

		village.afficherVillageois();
		camp.afficherCamp();
		
		// Changement de chef
		village.changerChef(abraracourcix);

		// Changement de commandant
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
	}
}
