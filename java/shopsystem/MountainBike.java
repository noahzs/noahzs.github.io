public class MountainBike extends Bike{
	
	//Local Variables
	private int suspensionDepth;
	
	//Constructors
	public MountainBike() {
	}
	
	public MountainBike(String owner, String model, int wheelDiameter, int gears, int kmsRidden, int suspensionDepth){
		super(owner, model, wheelDiameter, gears, kmsRidden);
		this.suspensionDepth = suspensionDepth;
	}
	
	//Getters
	public int getSuspensionDepth(){
		return suspensionDepth;
	}
	
	//Setters
	public void setSuspensionDepth(int suspensionDepth){
		this.suspensionDepth = suspensionDepth;
	}
	
	//Service Interval 
	public int getServiceInterval(){
		return (getWheelDiameter()*getGears())-getSuspensionDepth();
	}
	
	//toString
	public String toString(){
		return("MTB|"+getOwner()+"|"+getModel()+"|"+getWheelDiameter()+"|"+getGears()+"|"+getKmsRidden()+"|"+getSuspensionDepth());
	}
}
