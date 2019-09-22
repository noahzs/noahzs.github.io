
public class Food {

	
	private double food;
	
	//Setters and getters
		public double getFood(){
			return food;
		}
			
		public void setFood(double food) {
			this.food = food;
		}
		
		//Functions
		
		public static void turnChange() {
			setFood(farms.getFarms()*100);
		}
	
}
