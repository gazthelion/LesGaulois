	package personnages;

	public abstract class Personnage {

	    private String nom;
	    private int force;

	    public Personnage(String nom, int force) {
	        this.nom = nom;
	        this.force = force;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public int getForce() {
	        return force;
	    }

	    // Méthode abstraite (en italique dans le diagramme)
	    public abstract String donnerAuteur();

	    // La méthode parler UTILISE donnerAuteur()
	    public void parler(String texte) {
	        System.out.println(donnerAuteur() + " " + nom + " : « " + texte + " ».");
	    }

	    // Tous les personnages peuvent frapper
	    public void frapper(Personnage adversaire) {
	        System.out.println(
	            donnerAuteur() + " " + nom +
	            " envoie un grand coup dans la mâchoire de " + adversaire.getNom()
	        );
	        adversaire.recevoirCoup(3);
	    }

	    // Tous les personnages peuvent recevoir un coup
	    public void recevoirCoup(int forceCoup) {
	        force -= forceCoup;
	        if (force < 0) {
	            force = 0;
	        }

	        if (force > 0) {
	            parler("Aïe !");
	        } else {
	            parler("J'abandonne...");
	        }
	    }
	}


