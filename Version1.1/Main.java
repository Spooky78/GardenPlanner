/**
 * Main.java
 * Main method for testing purposes.
 * @author Spooky78
 * @version 1.1
 */
public class Main {

	public static void main(String[] args) {
		Plant tomato = new Plant("Cherry Tomato", 3, 8);
		Plant cucumber = new Plant("Cucumber", 4, 8);
		Garden garden = new Garden(5, 3);
		garden.addPlant(tomato, 0, 0);
		garden.addPlant(tomato, 0, 1);
		garden.addPlant(cucumber, 1, 0);
		garden.printGarden();

	}

}
