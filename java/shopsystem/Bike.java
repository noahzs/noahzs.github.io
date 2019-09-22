public class Bike{
	
	//Paramters
	private String owner;
	private String model;
	private int wheelDiameter;
	private int gears;
	private int kmsRidden;
	
	//Constructors
	
	public Bike(){
	}
	
	public Bike(String owner, String model, int wheelDiameter, int gears, int kmsRidden){
		this.owner = owner;
		this.model = model;
		this.wheelDiameter = wheelDiameter;
		this.gears = gears;
		this.kmsRidden = kmsRidden;
	}
	
	//Getters
	public String getOwner(){
		return owner;
	}
	
	public String getModel(){
		return model;
	}
	public int getWheelDiameter(){
		return wheelDiameter;
	}
	public int getGears(){
		return gears;
	}
	public int getKmsRidden(){
		return kmsRidden;
	}
	
	//Setters
	public void setOwner(String owner){
		this.owner = owner;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setWheelDiameter(){
		this.wheelDiameter = wheelDiameter;
	}
	public void setGears(){
		this.gears = gears;
	}
	public void setKmsRideen(){
		this.kmsRidden = kmsRidden;
	}
	
	
	//Service Interval
	public int getServiceInterval(){
		return getOwner().length() * getGears();
		
	}
	
	//toString
	public String toString(){
		return("Bike|"+getOwner()+"|"+getModel()+"|"+getWheelDiameter()+"|"+getGears()+"|"+getKmsRidden());
	}
}
