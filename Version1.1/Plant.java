/**
 * Plant.java
 * @author Spooky78
 * @version 1.1
 */
public class Plant {
	private String name;		//Name of plant
	private int plant; 			//Month to plant 
	private int harvest;		//Month to harvest
	
	/**
	 * Constructor of Plant Object
	 * @param name of plant
	 * @param plant - month for planting
	 * @param harvest - month for harvesting
	 */
	protected Plant(String name, int plant, int harvest) {
		this.name = name;
		this.plant = plant;
		this.harvest = harvest;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the plant
	 */
	public int getPlant() {
		return plant;
	}

	/**
	 * @return the harvest
	 */
	public int getHarvest() {
		return harvest;
	}

	/**
	 * @param plant the plant to set
	 */
	public void setPlant(int plant) {
		this.plant = plant;
	}

	/**
	 * @param harvest the harvest to set
	 */
	public void setHarvest(int harvest) {
		this.harvest = harvest;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return name + " plant in: "+ plant + " harvest in: ";
	}


	
}
