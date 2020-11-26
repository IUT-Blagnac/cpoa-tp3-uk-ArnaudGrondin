package pizzaFactory;
import pizza.Pizza;
public class PizzaFactoryBrest extends PizzaFactory{
	static PizzaFactoryBrest unique = new PizzaFactoryBrest();

	private PizzaFactoryBrest() {

	}

	static	public PizzaFactoryBrest getInstance() {

		return unique;

	}

	Pizza create (String name) {
		return null;
	}
}
