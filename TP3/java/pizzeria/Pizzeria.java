package pizzeria;
import pizza.Pizza;
import pizza.PizzaGrecqueStyleBrest;
import pizza.PizzaPoivronStyleBrest;
import pizzaFactory.PizzaFactory;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public  abstract class Pizzeria  {
	PizzaFactory PizzaFactory ;
	/**
	 * @param type
	 * @return a Pizza object according to the type
	 */

	

	public Pizza orderPizza(String type) {
		Pizza instance = PizzaFactory.createPizza(type);
	
		
		instance.preparer();
		instance.bake();
		instance.cut();
		instance.pack();
		 return instance ;
				
	}

	

}	