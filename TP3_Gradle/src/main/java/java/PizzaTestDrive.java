package java;

import pizza.Pizza;
import pizzaFactory.PizzaFactory;
import pizzaFactory.PizzaFactoryBrest;
import pizzaFactory.PizzaFactoryStrasbourg;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaBrest;
import pizzeria.PizzeriaFactory;
import pizzeria.PizzeriaStrasbourg;

public class PizzaTestDrive {

	public static void main(String[] args) {
		Pizzeria shopFromBrest = new PizzeriaFactory().create("Brest");
        Pizzeria shopFromStrasbourg = new PizzeriaFactory().create("Strasbourg");
        Pizza pizza = shopFromBrest.orderPizza("cheese");
        System.out.println("JMB has ordered a " + pizza.getName() + "\n");

        pizza = shopFromStrasbourg.orderPizza("cheese");
        System.out.println("JMI has ordered a " + pizza.getName() + "\n");

	}

}
