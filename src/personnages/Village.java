package personnages;

public class Village {
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private String nom;
	private Chef chef;

	public Village(String nom, int nbVillageoisMaximum) {
		villageois = new Gaulois[nbVillageoisMaximum];
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gauloisAAjouter) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gauloisAAjouter;
			nbVillageois++;
		}

	}

	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];

	}

	public void afficherVillageois() {
		String info = "Dans village du chef " + chef.getNom() + " vivent les legendaires gaulois:";

		System.out.println(info);
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println(villageois[i].getNom());

		}
	}

	public static void main(String[] args) {
		// Gaulois gaulois = village.trouverHabitant(30);
		Village village = new Village("Village des Irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30)
		// impossible car l'index 30 depasse le nb villageois maximum

		Chef chef = new Chef("Abraracourcix", 6, village);
		village.setChef(chef);
		Gaulois asterix = new Gaulois("asterix", 8);
		village.ajouterHabitant(asterix);
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		// La reponse affiché est null car il ya pas de gaulois dans ce village à la
		// position 1
		Gaulois obélix = new Gaulois("obélix", 25);
		village.ajouterHabitant(obélix);
		village.afficherVillageois();

	}

}
