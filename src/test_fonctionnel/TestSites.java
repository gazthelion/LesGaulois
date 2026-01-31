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

		camp.afficherCamp();
	}
}
