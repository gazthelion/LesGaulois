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
	
	//création de la méthode recevoirCoup
	public void recevoirCoup(int forceCoup) {
			force = force - forceCoup;
			if(force < 0 || force == 0){
				force = 0;
				System.out.println("le romain " + nom + " : « J'abandonne...».");
				}
			else {
				System.out.println("le romain " + nom + " : « Aie !».");
			}
			
	}
}
