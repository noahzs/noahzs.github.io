public class TestBikeSystem{
	
	public static void main(String[] args){
		
		BikeSystem shop = new BikeSystem(5);
		shop.closeShop();
		System.out.println(shop.insertBike("Bike|Emily|Spinner|14|0|1"));
		System.out.println(shop.insertBike("MTB|Kirstin|Explorer|26|10|200|120"));
		System.out.println(shop.insertBike("RB|Alexander|Roadster|27|12|100|5"));
		System.out.println(shop.insertBike("Bike|Caroline|Toddler|10|0|1"));
		System.out.println(shop.insertBike("MTB|Anthony|Reign|27|10|500|170"));
		System.out.println(shop.insertBike("Bike|Jane|Slinner|14|0|1"));
		shop.printSystem();
		shop.printServiceIntervals();
		System.out.println(shop.bikeExists("Emily","Spinner"));
		shop.closeShop();
		System.out.println("Rnd.2");
		shop.printSystem();
		System.out.println(shop.insertBike("MTB|Susan|Nomad|29|11|400|180"));
		System.out.println(shop.insertBike("MTB|Susan|Nomad|29|11|400|180"));
		shop.printSystem();
		shop.printServiceIntervals();
		shop.closeShop();
		System.out.println(shop.bikeExists("Susan","Nomad"));
		
	}
	
}
