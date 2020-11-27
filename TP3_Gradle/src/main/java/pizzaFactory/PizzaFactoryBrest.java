package pizzaFactory;
import pizza.Pizza;
import pizza.PizzaCheeseStyleBrest;
import pizza.PizzaGrecqueStyleBrest;
import pizza.PizzaPoivronStyleBrest;
public class PizzaFactoryBrest extends PizzaFactory{
	static PizzaFactoryBrest unique = new PizzaFactoryBrest();

	private PizzaFactoryBrest() {

	}

	static	public PizzaFactoryBrest getInstance() {

		return unique;

	}



	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		switch (type) {
		case "cheese":
			pizza = new PizzaCheeseStyleBrest();
			break;
		case "greek":
			pizza = new PizzaGrecqueStyleBrest();
		case "poivron":
			pizza = new PizzaPoivronStyleBrest();
			break;
		}
		return null;
	}
}
