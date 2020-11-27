package pizzeria;

import pizza.Pizza;
import pizza.PizzaCheeseStyleBrest;
import pizza.PizzaGrecqueStyleBrest;
import pizza.PizzaPoivronStyleBrest;
import pizzaFactory.PizzaFactory;
import pizzaFactory.PizzaFactoryBrest;

public class PizzeriaBrest extends Pizzeria {

	public PizzeriaBrest() {
		this.PizzaFactory = PizzaFactoryBrest.getInstance();
		// TODO Auto-generated constructor stub
	}

	

	
	

}
