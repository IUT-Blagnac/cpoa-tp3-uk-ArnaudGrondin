package pizzeria;

public class PizzeriaFactory {
	static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	public PizzeriaFactory() {
		
	}
	  public static PizzeriaFactory getInstance() {
		
		return uniqueInstance;

	}
	public Pizzeria create(String type) {
		Pizzeria pizzeria = null ;
		switch (type) {
		case "Brest":
			pizzeria = new PizzeriaBrest();
		case "Strasbourg":
			pizzeria = new PizzeriaStrasbourg();
		}
		return pizzeria;
		
	}
	
}
