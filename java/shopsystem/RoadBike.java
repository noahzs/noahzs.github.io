public class RoadBike extends Bike{
	
	//Instance Variables
	private int reflectorsFitted;
	
	//Constructors
	
	public RoadBike(){	
	}
	
	public RoadBike(String owner, String model, int wheelDiameter, int gears, int kmsRidden, int reflectorsFitted){
		super(owner, model, wheelDiameter, gears, kmsRidden);
		this.reflectorsFitted = reflectorsFitted;
	}
	
	
	//Getters
	public int getReflectorsFitted(){
		return reflectorsFitted;
	}
	
	//Setters
	public void setReflectorsFitted(){
		this.reflectorsFitted = reflectorsFitted;
	}
	
	//Service Interval
	public int getServiceInterval(){
		return getKmsRidden()*getReflectorsFitted();
	}
	
	//toString
	public String toString(){
		return("RB|"+getOwner()+"|"+getModel()+"|"+getWheelDiameter()+"|"+getGears()+"|"+getKmsRidden()+"|"+getReflectorsFitted());
	}
	
}
