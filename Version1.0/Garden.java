/**
 * Garden.java
 * Conatins garden class which is used to store 2d array of plant objects
 * @author Spooky78
 * @version 1.0
 */

public class Garden {
	private Plant[][] garden;

	public Garden(int x, int y) {
		garden = new Plant[x][y];
	}

	/**
	 * @return the garden
	 */
	public Plant[][] getGarden() {
		return garden;
	}

	/**
	 * @param garden the garden to set
	 */
	public void setGarden(Plant[][] garden) {
		this.garden = garden;
	}
	
	public void addPlant(Plant plant, int x, int y) {
		garden[x][y] = plant;
	}
	
	public void printGarden() {
		for (int i = 0; i<garden.length; i++) {
			System.out.println();
			for (int j = 0; j<garden[i].length; j++) {
				System.out.print("| ");
				System.out.print(garden[i][j]);
				System.out.print(" |");
			}
		}
	}
	
}
