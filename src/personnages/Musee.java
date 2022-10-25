package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophees = 0;

	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophees[nbTrophees] = new Trophee(gaulois, equipement);
		nbTrophees++;

	}

	
	public String extraireInstructionsCaml(){
		StringBuilder bld = new StringBuilder( );


		for (int i = 0; i < nbTrophees; i++){
			bld.append("     \"" + trophees[i].donnerNom()+ "\",");
			bld.append("\"" + trophees[i].getEquipement().toString()+ "\"");
			if (i!=nbTrophees-1) {
				bld.append(" ;");
			}
			bld.append("\n");
			
		}
		
		String texte =bld.toString();
		
		return "let musee=[\n" + texte +"]";
		
			}

}