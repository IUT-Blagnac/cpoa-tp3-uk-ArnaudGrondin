
public class SimpleFabriquePizza {

	public Pizza creerPizza(String pfType) {
		Pizza pizza;
		switch (pfType) {
		case "fromage":
			pizza = new PizzaFromage();
			return pizza;	
			
		case "poivron":
			pizza = new PizzaPoivrons();
			return pizza;	

		case "grecque":
			pizza = new PizzaGrecque();
			return pizza; 
			
		}
		return null;
	}
}
