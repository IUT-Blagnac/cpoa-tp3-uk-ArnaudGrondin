package pizzeria;

import pizza.Pizza;
import pizzaFactory.PizzaFactory;
import pizzaFactory.PizzaFactoryStrasbourg;

public class PizzeriaStrasbourg extends Pizzeria {

	public PizzeriaStrasbourg() {
		this.PizzaFactory = PizzaFactoryStrasbourg.getInstance();
	}

	

	
}
