
public class Population extends game{
	
	//Defining variable
	private double population;
	
	//Setters and getters
	public double getPopulation(){
		return population;
	}
		
	public void setPopulation(double population) {
		this.population = population;
	}
	
	//Functions
	
	public void turnChange() {
		setPopulation(Math.floor(getPopulation()*(food.getFood()-getPopulation())));
	}

}
