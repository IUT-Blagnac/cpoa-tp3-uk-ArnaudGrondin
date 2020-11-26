import pizza.Pizza;
import pizzaFactory.PizzaFactory;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaBrest;
import pizzeria.PizzeriaFactory;
import pizzaFactory;
public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaFactory shopFromBrest = PizzeriaBrest.getInstance();
		PizzaFactory shopFromStrasbourg =  PizzeriaFactory.getInstance("Strasbourg");

        Pizza pizza = shopFromBrest.orderPizza("cheese");
        System.out.println("JMB has ordered a " + pizza.getName() + "\n");

        pizza = shopFromStrasbourg.orderPizza("cheese");
        System.out.println("JMI has ordered a " + pizza.getName() + "\n");

	}

}
