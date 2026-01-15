package personnages;

//a.Création de la classe 'Gaulois'
public class Gaulois {
	String nom;
	int force;
	
	//b.Constructeur de la classe
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	//c.un getteur sur le nom
	 public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		 Gaulois asterix = new Gaulois("Astérix", 8);
	        System.out.println(asterix.getNom());
	}
	
	public void parler(String texte) {
		System.out.println("le gaulois " + nom + " : « " + texte + " ».");
		
	}
	public void frapper(Romain aFrapper) {
		System.out.println("le gaulois " + nom + " envoie un grand coup dans la machoire de " + aFrapper.getNom());
		aFrapper.recevoirCoup(this.force / 3 );
		
	}
}
