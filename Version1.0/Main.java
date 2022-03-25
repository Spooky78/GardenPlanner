/**
 * Main.java
 * Main method for testing purposes.
 * @author Spooky78
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		Plant tomato = new Plant("Tomato");
		Plant cucumber = new Plant("Cucumber");
		Garden garden = new Garden(5, 5);
		garden.addPlant(tomato, 0, 0);
		garden.addPlant(cucumber, 1, 0);
		garden.printGarden();

	}

}
