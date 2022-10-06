package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() +" << " + texte + " >> ");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}
	
	public static  void main(String[] args){
			 
		Gaulois asterix = new Gaulois ("asterix",8);
		Romain Beta = new Romain ("Beta",6);
			 
		asterix.parler("Salut mariama");
		System.out.println(asterix);
		System.out.println("le gaulois " + asterix.getNom() + " vient d'atterir sur terre merci à tous.");
		asterix.frapper(Beta);
			 	 
		}
	}

