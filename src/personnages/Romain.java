package personnages;

public class Romain {
	private String nom;
	private int force;
	private equipement[] equipements = new equipement[2];
	private int nbEquipement=0;

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
	
	public void sEquiper(equipement equipement) {
		switch(nbEquipement){
		case 2:{
			System.out.println("le soldat " + nom +  " est deja bien protegé! ");
			break;
		}
		case 1 :{
			if (equipements[0]==equipement){
				System.out.println("le soldat " + nom + " posséde deja un " + equipement+"!" );
			break;
			}
			
			else {
				equipement(equipement);
				break;
			}
		}
		
		default:{
			equipement(equipement);
			break;
			
		}
		
		
		}
		
	}
	
	
	
	private void equipement(equipement equipement) {
		equipements[nbEquipement]=equipement;
		nbEquipement ++;
		System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement + ".");
		
	}

	public static void main(String[] args) {
		Romain Minus = new Romain("Minus",6);
		System.out.println(Minus);
		Minus.prendreParole();
		Minus.parler("je suis le romain Minus ");
		Minus.recevoirCoup(8);
		System.out.println(equipement.CASQUE);
		System.out.println(equipement.BOUCLIER);
		Minus.sEquiper(equipement.CASQUE);
		Minus.sEquiper(equipement.CASQUE);
		Minus.sEquiper(equipement.BOUCLIER);
		Minus.sEquiper(equipement.CASQUE);
			
	}
}