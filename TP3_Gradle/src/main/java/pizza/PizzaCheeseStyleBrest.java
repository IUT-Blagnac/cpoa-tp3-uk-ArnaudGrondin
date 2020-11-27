package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaCheeseStyleBrest extends Pizza {
	
	public PizzaCheeseStyleBrest() {
		this.name = "Pizza with Brest style sauce and cheese ";
		this.garnitures.add("Parmigiano reggiano ");
	}
	
	@Override
	public void cut() {
		
		System.out.println("Cut the pizza in triangles");
	}

}
