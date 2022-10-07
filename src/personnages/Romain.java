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

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force>0;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
			assert force <0;
		}
	}
	
	public static void main(String[] args) {
		Romain Minus = new Romain("Minus",6);
		System.out.println(Minus);
		Minus.prendreParole();
		Minus.parler("je suis le romain Minus ");
		Minus.recevoirCoup(8);
			
	}
}