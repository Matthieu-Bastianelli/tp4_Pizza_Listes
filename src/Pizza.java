


public class Pizza implements Comparable<Pizza>{
	
	/**
	 * Attributs
	 */
	private String code = null;
	private String nom = null;
	private float prix = Float.MIN_VALUE;
	private EnumCategoriesPizza categorie; //Ajout de la catégorie liée à l'Enum créé.
	//--------------------------------------------------------------------------------------
	/**
	 * Création de constructeurs :
	 * @param code
	 * @param nom
	 * @param prix
	 */
	public Pizza(String code, String nom, float prix, EnumCategoriesPizza categorie) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.categorie =categorie;
	}
	

	//Constructeur par défaut :
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * Méthode toString : génère une chaine de caractères présentant les attributs de l'objet.
	 */
	@Override
	public String toString() {
		return "Pizza [code=" + code + ", nom=" + nom + ", prix=" + prix + "\u20ac, catégorie="+ categorie +" ]\n";
	}
	
	/**
	 * Comparateur :
	 */


	@Override
	public int compareTo(Pizza pizzaCompare) {
		
		
		if (this.getPrix() > pizzaCompare.getPrix()) {
			return 1;
			}else if (this.getPrix() < pizzaCompare.getPrix()){
				return (-1);
				}else {
					return 0;
		}
	}

//	@Override
//	public int compare(Pizza pizza1, Pizza pizza2) {
//		
////		Pizza pizza1 = (Pizza) objet1;
////		Pizza pizza2 = (Pizza) objet2;
//		
//		//Tri par rapport au prix des Pizzas
//		if (pizza1.getPrix() > pizza2.getPrix()) {
//			return 1;
//			}else if (pizza1.getPrix() < pizza2.getPrix()){
//				return (-1);
//				}else {
//					return 0;
//		}
//		
//	}

	//--------------------------------------------------------------------------------------
	// Getter et Setter :
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}






	
	//--------------------------------------------------------------------------------------

	
	

}
