package pizza;

public class PizzaPoivronStyleStrasbourg extends Pizza {
	public PizzaPoivronStyleStrasbourg() {
		this.name = "Pizza with Strasbourg sauce Style and pepper";
		this.garnitures.add("pepper");
	}

	@Override
	public void cut() {
		//  Auto-generated method stub
		System.out.println("Cut in square portions");
	}
	
}
