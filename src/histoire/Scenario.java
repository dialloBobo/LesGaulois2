package histoire;


public class Scenario {



public static void main(String[] args) {
	personnages.Gaulois Asterix = new personnages.Gaulois("Asterix", 8);
	personnages.Romain Minus = new personnages.Romain("Minus",30);
	personnages.Druide panoramix = new personnages.Druide("panoramix",5,10);
	personnages.Gaulois Obélix =new personnages.Gaulois("Obélix",18);
	panoramix.parler("je vais aller preparer une petite potion...");
	panoramix.preparerPotion();
	panoramix.booster(Obélix);
	Obélix.parler("par Bélénos , ce n'est pas juste!");
	
	panoramix.booster(Asterix);
	
	Asterix.parler("Bonjour à tous");
	Minus.parler("UN GAU... UN GAUGAU...");
	for(int i =0 ;i < 3; i++){
		Asterix.frapper(Minus);
	}
}
}
