package pizza;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	protected String name;

	protected String dough;
	protected String sauce;
	protected ArrayList<String> garnitures;
	
	protected Pizza() {
		this.name = "";
		this.dough = "";
		this.sauce = "";
		this.garnitures = new ArrayList<String>();

	}

	public void preparer() {
		System.out.println("PreÌ?paration de " + this.name );
		System.out.println("Spread the pizza dough...");
		System.out.println("Add the sauce... ");
		System.out.println("Add the garnitures:");
		/*
		for (int i=0; i<garnitures.size(); i++) {
			System.out.println(" " + this.garnitures.get(i));
		}
		*/
	}

	public void bake() {
		System.out.println("Bake 25 minutes at 180Â°");
	

	}

	public void cut() {
		System.out.println("cut pizza " );

	}

	public void pack() {
		System.out.println("Put the pizza in the official box");
		

	}

	public String getName() {
		return this.name;
	}

}
