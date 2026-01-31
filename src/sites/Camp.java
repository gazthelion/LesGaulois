package sites;
import personnages.Soldat;
import personnages.Grade;

public class Camp {
	
	private Soldat commandant;
	private Soldat []soldats;
	private int nombreSoldats;
	
	public Camp(Soldat commandant) {
		this.commandant=commandant;
		this.soldats=new Soldat[5];
		this.nombreSoldats=0;
		
		}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
	    if (nombreSoldats < soldats.length) {
	        soldats[nombreSoldats] = soldat;
	        nombreSoldats++;
	        soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " 
	                      + commandant.getNom());
	    } else {
	        commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet !");
	    }
	}

	//Méthode afficher camp //
	public void afficherCamp() {
	    System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");

	    for (int i = 0; i < nombreSoldats; i++) {
	        System.out.println("- " + soldats[i].getNom());
	    }
	}
	
	public void changerCommandant(Soldat nouveauCommandant) {
	    if (nouveauCommandant.getGrade() == Grade.CENTURION) {
	        Soldat ancienCommandant = this.commandant;
	        this.commandant = nouveauCommandant;
	        nouveauCommandant.parler("Moi " + nouveauCommandant.getNom() + " je prends la direction du camp romain.");
	    } else {
	        nouveauCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
	    }
	}


		
		
	}