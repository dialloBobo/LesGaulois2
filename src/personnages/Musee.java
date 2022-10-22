package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophees=0;
	
	public void donnerTrophees(Gaulois gaulois,Equipement equipement){
		 trophees[nbTrophees]=new Trophee(gaulois,equipement);
		 nbTrophees++;

		 	
	}
	
	

}
