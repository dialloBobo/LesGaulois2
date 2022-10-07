package personnages;

public enum equipement {
	CASQUE("casque"),BOUCLIER("bouclier");
	
	
	private String nom;
	
	private equipement(String nom){
		this.nom=nom;

		
	}

	@Override
	public String toString() {
		return nom;
	}
}
