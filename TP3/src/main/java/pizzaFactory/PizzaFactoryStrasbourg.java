package pizzaFactory;
import pizza.Pizza;
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

	Pizza create (String name) {
		return null;
	}
}
