
public enum EnumCategoriesPizza {
	// Valeurs possibles pour l'énum :
	VIANDE("Viande"),
	POISSON("Poisson"),
	CRUDITE("Crudité"),
	FROMAGE("Fromage"),
	AUTRE("Végétarien");
	
	private String nom=null;

	// Création du constructeur de l'Enum. Attention, déclaré en 'private'!
	private EnumCategoriesPizza(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	

}
