

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PizzaMemDAO implements IPizzaDao{
	
	//Attribut
	private String nomBddPizza =null;
	private ArrayList<Pizza> listeDePizza = null;

	
//	/**
//	 * Constructeur :	
//	 * @param nomBddPizza
//	 * @param tableauDePizza
//	 */
//	public PizzaMemDAO(String nomBddPizza, Pizza[] tableauDePizza) {
//		super();
//		this.nomBddPizza = nomBddPizza;
//		this.tableauDePizza = tableauDePizza;
//	}
	/**
	 * Constructeur
	 */
	public PizzaMemDAO() {
		super();
		this.listeDePizza = new ArrayList<Pizza>();
		this.listeDePizza.add(new Pizza("MAR","Margarita",8, EnumCategoriesPizza.AUTRE));
		this.listeDePizza.add(new Pizza("4FR","4 Fromage",10,EnumCategoriesPizza.FROMAGE));
		this.listeDePizza.add(new Pizza("CAL","Calzone",9,EnumCategoriesPizza.AUTRE));
		this.listeDePizza.add(new Pizza("JOF","Jambon Oeuf Fromage",7,EnumCategoriesPizza.VIANDE));
		
	}
	
	//Implémentation de l'interface IPizzaDao :
	
	/**
	 * Renvoie toutes les Pizzas de l'objet sous forme de liste.
	 */
	public ArrayList<Pizza> findAllPizzas(){
		return this.listeDePizza;
	}
	
	@Override
	public void saveNewPizza(Pizza pizza) {
		this.listeDePizza.add(pizza);
		
	}

	/**
	 * Retourne la Pizza de l'objet dont le code est en entrée.
	 */
	@Override
	public Pizza findPizzaByCode(String codePizza){
		for(int i=0 ; i<this.listeDePizza.size() ;i++){
			if (this.listeDePizza.get(i).getCode().equals(codePizza))	{
				return this.listeDePizza.get(i);	
			}
		}
		return null;
	}
	
	/**
	 * Supprime de la listePizza la pizza associée au code donné en entrée.
	 */
	@Override
	public void deletePizza(String codePizza) {
		Pizza delete = this.findPizzaByCode(codePizza);
		
		if(delete != null) {
			listeDePizza.remove(delete);
		}
		
	}

	/**
	 * Indique si la pizza dont le codePizza est en entrée existe dans l'objet.
	 */
	@Override
	public boolean PizzaExists(String codePizza) {
		if (this.findPizzaByCode(codePizza) ==null) {
			return false;
		}else {
			return true;
		}
	}
	
	/**
	 * Mise à jour à partir de la 'pizza' en entrée de la Pizza associée au code 'codePizza' en entrée.
	 */
	public void updatePizza(String codePizza, Pizza pizza){
		for(int i=0 ; i<this.listeDePizza.size() ;i++){
			if (this.listeDePizza.get(i).getCode().equals(codePizza))	{
				this.listeDePizza.remove(i);
				this.listeDePizza.add(pizza);
			}
		}
	}
	

	
	@Override
	public String toString() {
		Collections.sort(listeDePizza); // Attention Collection plutôt que ArrayList ici!
		return "PizzaMemDAO [listeDePizza=" + listeDePizza + "]";
	}
		
	//Getter et Setter :
	
//	public Pizza[] getTableauDePizza() {
//		return tableauDePizza;
//	}
	
		public String getNomBddPizza() {
		return nomBddPizza;
	}
	

	public void setNomBddPizza(String nomBddPizza) {
		this.nomBddPizza = nomBddPizza;
	}
	



}
