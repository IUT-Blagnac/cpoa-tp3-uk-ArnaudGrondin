package pizzaFactory;
import pizza.Pizza;
import pizza.PizzaCheeseStyleStrasbourg;
import pizza.PizzaGrecqueStyleStrasbourg;
public class PizzaFactoryStrasbourg extends PizzaFactory{
	static PizzaFactoryStrasbourg unique = new PizzaFactoryStrasbourg();

	private PizzaFactoryStrasbourg() {

	}

	static public PizzaFactoryStrasbourg getInstance() {
		if ( unique == null){
			unique = new PizzaFactoryStrasbourg();
		}
		return unique;

	}

	

	@Override
	public Pizza createPizza (String type) {
		Pizza pizza;
		switch (type) {
		case "cheese":
			pizza = new PizzaCheeseStyleStrasbourg();
			break;
		case "poivron":
			pizza = new PizzaGrecqueStyleStrasbourg();
		case "greek":
			pizza = new PizzaGrecqueStyleStrasbourg();
			break;
		}
		return null;
	}
}
