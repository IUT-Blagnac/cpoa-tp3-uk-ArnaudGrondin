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

	/**
	 * @param type
	 * @return a Pizza object according to the type
	 */

	public Pizzeria(PizzaFactory pizzafcatory) {
		// TODO Auto-generated constructor stub
	}

	public Pizza orderPizza(String type) {

	
		/*
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		*/
		return pizza;
	}

	abstract  Pizza createPizza(String type);

}