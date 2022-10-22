
package histoire;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Musee;
import personnages.Romain;
//import villagegaulois.Musee;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		if (minus.getForce() > 0) {
			asterix.frapper(milexcus);
		}

//		Partie a decommenter

		Musee musee = new Musee();
		asterix.faireUneDonnation(musee);
		// test
		System.out.println(asterix.extraireInstructionsCaml());

	}
}

//package histoire;

//
//import personnages.Druide;
//import personnages.equipement;
//import personnages.Gaulois;
//import personnages.Romain;
//import personnages.Village;
//import personnages.Musee;

//public class Scenario {

//public static void main(String[] args) {
//	personnages.Gaulois Asterix = new personnages.Gaulois("Asterix", 8);
//	personnages.Romain Minus = new personnages.Romain("Minus",30);
//	personnages.Druide panoramix = new personnages.Druide("panoramix",5,10);
//	personnages.Gaulois Obélix =new personnages.Gaulois("Obélix",18);
//panoramix.parler("je vais aller preparer une petite potion...");
//	panoramix.preparerPotion();
//	panoramix.booster(Obélix);
//	Obélix.parler("par Bélénos , ce n'est pas juste!");
//	
//panoramix.booster(Asterix);
//	
//	Asterix.parler("Bonjour à tous");
//	Minus.parler("UN GAU... UN GAUGAU...");
//	for(int i =0 ;i < 3; i++){
//		Asterix.frapper(Minus);
//	}
//}
//}
