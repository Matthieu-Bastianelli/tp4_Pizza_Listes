

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//===============================================================================================================
		//TEST Pizza :
		//==============

		System.out.println("\r\n" + 
				"===============================================================================================================\nTEST Pizza! \r\n");
		
		//Création de pizzas:
		Pizza pizzaMAR = new Pizza("MAR","Margarita",8, EnumCategoriesPizza.AUTRE);
		Pizza pizza4FR = new Pizza("4FR","4 Fromage",10,EnumCategoriesPizza.FROMAGE);
		Pizza pizzaCAL = new Pizza("CAL","Calzone",9,EnumCategoriesPizza.AUTRE);
		Pizza pizzaJOF = new Pizza("JOF","Jambon Oeuf Fromage",7,EnumCategoriesPizza.VIANDE);
		
		//Affichage test :
		System.out.println("Pizza 1 :\n"+pizzaMAR.toString());
		System.out.println("Pizza 2 :\n"+pizza4FR.toString());
		System.out.println("Pizza 3 :\n"+pizzaCAL.toString());
		System.out.println("Pizza 4 :\n"+pizzaJOF.toString());
		
		System.out.println("Fin TEST Pizza! \r\n\r\n" + 
				"===============================================================================================================\n");

		//===============================================================================================================
		// TEST PizzaMemDAO :
		//===================

		System.out.println("===============================================================================================================\nTEST PizzaMemDAO! \r\n");
		
		//Création d'un PizzaMemDAO :
		PizzaMemDAO ensemblePizza = new PizzaMemDAO();
		
		for (int i=0;i<ensemblePizza.findAllPizzas().size();i++) {
			System.out.println(ensemblePizza.findAllPizzas().get(i).toString());
		}
		
		System.out.println(ensemblePizza.toString());
		
		ensemblePizza.updatePizza("MAR", new Pizza("MAR","Marinière",11,EnumCategoriesPizza.POISSON));

		System.out.println(ensemblePizza.toString());
		
		System.out.println("Fin TEST PizzaMemDAO! \r\n\r\n" + 
				"===============================================================================================================\n");

	}

}
