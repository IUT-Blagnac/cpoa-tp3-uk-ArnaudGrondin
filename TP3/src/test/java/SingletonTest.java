import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import pizzaFactory.PizzaFactoryBrest;
import pizzaFactory.PizzaFactoryStrasbourg;

public class SingletonTest {

	@Test
	public void TwoBrestPizzaFactoryAreIndeedOne() {
	PizzaFactoryBrest p1 = PizzaFactoryBrest.getInstance();
	PizzaFactoryBrest p2 = PizzaFactoryBrest.getInstance();
	
		assertTrue(p1 == p2);
	}
	
	public void TwoStrasbourgPizzaFactoryAreIndeedOne() {
		PizzaFactoryStrasbourg p1 = PizzaFactoryStrasbourg.getInstance();
		PizzaFactoryStrasbourg p2 = PizzaFactoryStrasbourg.getInstance();
		
			assertTrue(p1 == p2);
		}

}
