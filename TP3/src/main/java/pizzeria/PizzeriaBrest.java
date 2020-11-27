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
					 PizzaCheeseStyleBrest p = new PizzaCheeseStyleBrest();
					 p.preparer();
				case "poivron":
					PizzaPoivronStyleBrest p1 = new PizzaPoivronStyleBrest();
					p1.preparer();
				case "grecque":
					return new PizzaGrecqueStyleBrest();	 
				default:
					break;
				}
				return null;
	}

}
