package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaCheeseStyleBrest extends Pizza {
	
	@Override
	public void preparer() {
		// TODO Auto-generated method stub
		System.out.println("Preparation ");
	}

	@Override
	public void cuire() {
		// TODO Auto-generated method stub
		super.cuire();
	}

	@Override
	public void couper() {
		// TODO Auto-generated method stub
		super.couper();
	}

	@Override
	public void emballer() {
		// TODO Auto-generated method stub
		super.emballer();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Pizza with Brest style sauce and cheese";
	}

}
