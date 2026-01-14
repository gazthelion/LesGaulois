package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	//8.Création de la méthode parler
	public void parler(String texte) {
		System.out.println("le romain " + nom + " : « " + texte + " ».");
	}
	
}
