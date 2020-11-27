package pizza;

public class PizzaCheeseStyleStrasbourg extends Pizza {
	
	public PizzaCheeseStyleStrasbourg() {
		this.name = " Pizza Strasbourg style with cheese"; 
		this.garnitures.add("Mozzarella");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println(" Cut in square portions");
	}
	
	
}
