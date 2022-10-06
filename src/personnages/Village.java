package personnages;


public class Village {
	private  Gaulois[] villageois;
	private int nbVillageois=0;
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	

	public Village(String nom,int nbVillageoisMaximum) {
		villageois=new Gaulois[nbVillageoisMaximum];
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void  ajouterHabitant(Gaulois GauloisAAjouter) {
		if (nbVillageois < nbVillageoisMaximum){
			villageois[nbVillageois]= GauloisAAjouter;
			nbVillageois++;
			
		}

	}
	public Gaulois trouverHabitant(int numVillageois) {
			return villageois[numVillageois];
			
		}
		
}


