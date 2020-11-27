package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaGrecqueStyleBrest extends Pizza {
	
	public PizzaGrecqueStyleBrest(){
	this.name = " greek Pizza with Brest style sauce ";
}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		super.cut();
		System.out.println("Cut the pizza in triangles");
	}
	
}