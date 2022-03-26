/**
 * Garden.java
 * Contains garden class which is used to store 2d array of plant objects
 * @author Spooky78
 * @version 1.1
 */

public class Garden {
	final int lineLength = 15;		//Max line length in grid
	private Plant[][] garden;		//2d array of plants forms garden

	/**
	 * Constructor of Garden object
	 * @param x number of columns
	 * @param y number of rows
	 */
	public Garden(int x, int y) {
		garden = new Plant[y][x];
	}

	/**
	 * @return garden - return garden array
	 */
	public Plant[][] getGarden() {
		return garden;
	}

	/**
	 * @param garden - the garden is set to an array
	 */
	public void setGarden(Plant[][] garden) {
		this.garden = garden;
	}
	
	/**
	 * Method to add a plant to the garden at specific location
	 * @param plant - plant object to add
	 * @param x coordinate to place at
	 * @param y coordinate to place at
	 */
	public void addPlant(Plant plant, int x, int y) {
		garden[y][x] = plant;
	}
	
	/**
	 * Print to console garden in grid
	 */
	public void printGarden() {
		for (int i = 0; i<garden.length; i++) {
			System.out.println();
			for (int j = 0; j<garden[i].length; j++) {
				System.out.print("| ");
				if (garden[i][j] != null) {
					
					System.out.print(centreString(lineLength, garden[i][j].getName()));
				} else {
					System.out.print(centreString(lineLength, "null"));
				}
				System.out.print(" |");
			}
		}
	}
	
	/**
	 * Method to centre text
	 * @param width - width of line 
	 * @param s - string to centre
	 * @return return centred string
	 */
	private String centreString(int width, String s) {
		int numChar = s.length();
		int charleft = width - numChar;
		if (charleft < 0) {
			s = s.substring(0, width);
		} else {
			s = String.format("%-" + width  + "s", String.format("%" + (s.length() + 
					(width - s.length()) / 2) + "s", s));
		}
		return s;
	}
	
}
