/**
 * Plant.java
 * @author Spooky78
 * @version 1.0
 */
public class Plant {
	protected String name;		//Name of plant
	
	public Plant(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return name;
	}


	
}
