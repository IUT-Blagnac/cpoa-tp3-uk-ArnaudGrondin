package pizzeria;

import pizza.Pizza;
import pizza.PizzaCheeseStyleBrest;
import pizza.PizzaGrecqueStyleBrest;
import pizza.PizzaPoivronStyleBrest;
import pizzaFactory.PizzaFactory;

public class PizzeriaBrest extends Pizzeria {

	public PizzeriaBrest(PizzaFactory pizzafcatory) {
		super(pizzafcatory);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
				switch (type) {
				case "fromage":
					return new PizzaCheeseStyleBrest();
				case "poivron":
					return new PizzaPoivronStyleBrest();
				case "grecque":
					return new PizzaGrecqueStyleBrest();	 
				default:
					break;
				}
				return null;
	}

}
