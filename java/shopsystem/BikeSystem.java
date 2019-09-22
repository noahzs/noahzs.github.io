import java.util.ArrayList;
public class BikeSystem{
	
//Create array for bike system
	Bike[] bikeList;
	
//Constructor
	public BikeSystem(int num){
		bikeList = new Bike[num];
	}
	

	


		//Paramteres
		private String bike ="";
		private String owner = "";
		private String model = "";
		private String wheelDiameter = "";
		private String gears = "";
		private String kmsRidden = "";
		private String suspensionDepth = "";
		private String reflectorsFitted = "";

	
	//Methods
	
	//Insert Bike
	public boolean insertBike(String bikeString){
		//Resseting params
		int i= 0;
		String bike ="";
		String owner = "";
		String model = "";
		String wheelDiameter = "";
		String gears = "";
		String kmsRidden = "";
		String suspensionDepth = "";
		String reflectorsFitted = "";
		
		//Breaking down string
		while(bikeString.charAt(i)!='|'){
			bike = bike.concat(String.valueOf(bikeString.charAt(i)));
			i++;
			}
		i++;
		while(bikeString.charAt(i)!='|'){
			owner = owner.concat(String.valueOf(bikeString.charAt(i)));
			i++;
			//System.out.println(owner);
		}
		
		i++;
		while(bikeString.charAt(i)!='|'){
			model = model.concat(String.valueOf(bikeString.charAt(i)));
			i++;
			//System.out.println(model);
		}
		i++;
		while(bikeString.charAt(i)!='|'){
			wheelDiameter = wheelDiameter.concat(String.valueOf(bikeString.charAt(i)));
			i++;
			//System.out.println(wheelDiameter);
		}
		i++;
		while(bikeString.charAt(i)!='|'){
			gears = gears.concat(String.valueOf(bikeString.charAt(i)));
			i++;
		}
		i++;
		if(bike.equals("Bike")){
			while(i<bikeString.length()){
				kmsRidden = kmsRidden.concat(String.valueOf(bikeString.charAt(i)));
				i++;
			}
		}
		else if(bike.equals("MTB")){
			while(bikeString.charAt(i)!='|'){
				kmsRidden = kmsRidden.concat(String.valueOf(bikeString.charAt(i)));
				i++;
			}
			i++;
			while(i<bikeString.length()){
				suspensionDepth = suspensionDepth.concat(String.valueOf(bikeString.charAt(i)));
				i++;
			}
		}
		else if(bike.equals("RB")){
			while(bikeString.charAt(i)!='|'){
				kmsRidden = kmsRidden.concat(String.valueOf(bikeString.charAt(i)));
				i++;
			}
			i++;
			while(i<bikeString.length()){
				reflectorsFitted = reflectorsFitted.concat(String.valueOf(bikeString.charAt(i)));
				i++;
			}
		}
		
		//Test if bike already exists
		for(int n = 0;n<bikeList.length;n++){
			if(bikeList[n] != null){
			   if(bikeList[n].getModel().equals(model)){
				if(bikeList[n].getOwner().equals(owner)){
					if(String.valueOf(bikeList[n].getWheelDiameter()).equals(wheelDiameter)){
						if(String.valueOf(bikeList[n].getGears()).equals(gears)){
							if(String.valueOf(bikeList[n].getKmsRidden()).equals(kmsRidden)){
								
								if(bike.equals("Bike")){
									return false;
								}
								else if(bike.equals("MTB")){
									
									if(bikeList[n]!=null){
										Bike testBike = bikeList[n];
										MountainBike mTestBike = (MountainBike)testBike;
										if(String.valueOf(mTestBike.getSuspensionDepth()).equals(suspensionDepth)){
											return false;
										}
									}
								}
								else if(bike.equals("RB")){
									Bike testBike  = bikeList[n];
									RoadBike rTestBike = (RoadBike)testBike;
									if(String.valueOf(rTestBike.getReflectorsFitted()).equals(reflectorsFitted)){
										return false;
									}
								}
							}
						}
					}
				}
			}
		}
		//Make sure list isnt full
			for(int p = 0; p<bikeList.length; p++){
				int a = 0;
				if(bikeList[p]!=null){
					a++;
				}
				if(a == bikeList.length){
					return false;
				}
			}
		
	
		
		//Make bike if it doesn't already exist & list isnt full
		
		
		for(int p = 0; p<bikeList.length; p++){
			if(bikeList[p]==null){
				if(bike.equals("Bike")){
					bikeList[p] = (new Bike(owner,model,Integer.parseInt(wheelDiameter),Integer.parseInt(gears),Integer.parseInt(kmsRidden)));
					return true;
				}
				else if(bike.equals("MTB")){
					bikeList[p]=(new MountainBike(owner,model,Integer.parseInt(wheelDiameter),Integer.parseInt(gears),Integer.parseInt(kmsRidden),Integer.parseInt(suspensionDepth)));
					return true;
				}
				else if(bike.equals("RB")){
					bikeList[p]=(new RoadBike(owner,model,Integer.parseInt(wheelDiameter),Integer.parseInt(gears),Integer.parseInt(kmsRidden),Integer.parseInt(reflectorsFitted)));
					return true;
				}
			
			}
		
		}
		return false;
	}
	return false;	
	}
	
	//Bike exists
	public boolean bikeExists(String owner, String model){
		
		for(int n =0;n<bikeList.length;n++){
			if(bikeList[n] !=null){
			if(bikeList[n].getModel().equals(model)){
				if(bikeList[n].getOwner().equals(owner)){
					return true;
								
						}		
					}
				}
			}
		
		return false;
		
	}
	
	
	//Print System
	public void printSystem(){
		for(int n = 0; n<bikeList.length;n++){
			if(bikeList[n]!=null){
			if(bikeList[n].toString().charAt(0)=='B'){
				System.out.println(bikeList[n].toString());
				}
			else if(bikeList[n].toString().charAt(0)=='M'){
				MountainBike bike = (MountainBike)bikeList[n];
				System.out.println(bike.toString());
			}
			else if(bikeList[n].toString().charAt(0)=='R'){
				RoadBike bike = (RoadBike)bikeList[n];
				System.out.println(bike.toString());
			}
		}
		}
	}
	
	//Close Shop
	public void closeShop(){
		for(int n = 0; n<bikeList.length;n++){
			bikeList[n] = null;
		}
		//Reset parameters
		owner = null;
		model= null;
		wheelDiameter = null;
		gears = null;
		kmsRidden = null;
	}
	
	
	//Print service intervals
	public void printServiceIntervals(){
		for(int n = 0; n<bikeList.length; n++){
			if(bikeList[n]!=null){
			if(bikeList[n].toString().charAt(0)=='B'){
				Bike bike = (Bike)bikeList[n];
				System.out.println(bike.getOwner() +", "+bike.getModel()+", "+bike.getServiceInterval());
			}
			else if(bikeList[n].toString().charAt(0)=='M'){
				MountainBike bike = (MountainBike)bikeList[n];
				System.out.println(bike.getOwner() +", "+bike.getModel()+", "+bike.getServiceInterval());
				
			}
			else if(bikeList[n].toString().charAt(0)=='R'){
				RoadBike bike = (RoadBike)bikeList[n];
				System.out.println(bike.getOwner() +", "+bike.getModel()+", "+bike.getServiceInterval());
			}
			}
		}
	}
	
}

