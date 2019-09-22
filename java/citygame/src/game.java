import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		


			double food=0;
			double population=0;
			double space=0;
			double farms=0;
			double happiness=0;
			int year=0;
			double money=0;
			double taxPercent=0;
			double health=0;
			double hospitals=0;
			double dscale=0;
			double factories=0;
			double pollution=0;

		
		
		String again = "default";
		Scanner input = new Scanner(System.in);
		
	while(again != "no") {	
		System.out.println("Easy, medium, hard, or custom game? \n (E/M/H/C)");
		String diff = input.next();
		if(diff.equals("C")) {
		System.out.println("Enter how much food to start: ");
		food = input.nextDouble();
		System.out.println("Enter how much population to start: ");
		population = input.nextDouble();
		System.out.println("Enter how much space to start: ");
		space = input.nextInt();
		farms = 10;
		happiness = 50;
		year = 0;
		System.out.println("Enter how much money to start: ");
		money = input.nextDouble();
		System.out.println("What do you want your tax rate to be?");
		taxPercent = input.nextDouble();
		taxPercent = taxPercent/100;
		health = 100;
		hospitals = 1;
		System.out.println("What do you want your random disaster dificulty to be (0-100)?");
		dscale = input.nextDouble();
		}
		
		else if(diff.contentEquals("E")) {
			food = 500;
			population = 250;
			space = 1500;
			farms = 30;
			happiness = 50;
			year = 0;
			money = 5500;
			System.out.println("What do you want your tax rate to be?");
			taxPercent = input.nextDouble();
			taxPercent = taxPercent/100;
			health = 100;
			hospitals = 4;
			dscale = 10;
			factories = 2;
			pollution = 0;
		}
		else if(diff.contentEquals("M")) {
			food = 300;
			population = 200;
			space = 900;
			farms = 20;
			happiness = 50;
			year = 0;
			money = 2500;
			System.out.println("What do you want your tax rate to be?");
			taxPercent = input.nextDouble();
			taxPercent = taxPercent/100;
			health = 95;
			hospitals = 2;	
			dscale = 30;
			factories = 2;
			pollution = 0;
		}
		else if(diff.contentEquals("H")) {
			food = 200;
			population = 250;
			space = 100;
			farms = 13;
			happiness = 50;
			year = 0;
			money = 1000;
			System.out.println("What do you want your tax rate to be?");
			taxPercent = input.nextDouble();
			taxPercent = taxPercent/100;
			health = 100;
			hospitals = 1;	
			dscale = 100;
			factories = 2;
			pollution = 15;
		}
		
		
		while(population > 0) {
			year++;
			//Legacy Version population = Math.floor(((food+((happiness/50)*(population/2))))*(health/100)) ;
			population = Math.floor((population+((food-population)/10)+((population*happiness)/1000))*health/90);
			happiness = ((space)/(space+farms))*50*(1-taxPercent/1)*((100-pollution)/100);
			money = money + population*taxPercent - 5*hospitals + 3*factories;
			System.out.println("\n");
			System.out.println("City stats in year " + year);
			int random = (int) (Math.random() * 49 + 1);
			if(random > 46) {
				System.out.println("Oh no! A fire broke out! \n" + Math.floor((50-random)*(dscale/10)) +" farms burned down! \n" +Math.floor((dscale/30))+ " hospital(s) burned down! \n "+ Math.ceil((dscale/4)*(60-random)) + " people died!\n");
				farms = farms - Math.floor((50-random)*(dscale/10));
				hospitals = hospitals - Math.floor((dscale/30));
				population = population - Math.ceil(4*(60-random));
			}
			int dissease = (int) (Math.random() * 99 + 1);
			if(dissease>health) {
				int luck = (int) (Math.random() * 2 + 1);
				if(luck >=1) {
					System.out.println("\n Dissease has broken out! "+ (100-health)*(dscale/80) + "% of your population has died! \n");
					population = population - population*((100-health)*(dscale/80)/100);
				}
			}
			if(food-population<0) {
				System.out.println("\n Your people are starving! Build more farms!\n");
			}
			System.out.println("Current Population: " + population);
			System.out.println("Current ballance: $"+money);
			System.out.println("Current Happiness: " + happiness+"/50");
			System.out.println("Health: " +health+"%");
			System.out.println("Remaining Food: " + food);
			System.out.println("Number of farms: " + farms);
			System.out.println("Number of hospitals: " + hospitals);
			System.out.println("Number of factories: " + factories);
			System.out.println("Tax rate: " + 100*taxPercent + "%");
			System.out.println("Pollution: " + pollution);
			System.out.println("Remaining natural space: " + space);
			int build = 0;
			System.out.println("How many farms would you like to build? (Cost $30 each) ");
			build = input.nextInt();
			if(space >= build){
				if(money - 30*build > 0) {
				System.out.println("Building " + build + " farms.");
				space = space - build;
				farms = farms + build;
				money = money - 30*build;
				}
				else {
					System.out.println("Sorry! Not enough money. Wait till next year.");
				}
			}
			
			else{
				System.out.println("Sorry! Not enough space. Wait till next year.");
			}
			System.out.println("How many hospitals would you like to build? (Cost $40 each, + $5 per turn.)");
			build = input.nextInt();
			if(space >= build){
				if(money - 40*build > 0) {
				System.out.println("Building " + build + " hospitals.");
				space = space - build;
				hospitals = hospitals + build;
				money = money - 40*build;
				}
				else {
					System.out.println("Sorry! Not enough money. Wait till next year.");
				}
			}
			
			else{
				System.out.println("Sorry! Not enough space. Wait till next year.");
			}
			
			System.out.println("How many factories would you like to build? (Cost $35 each, bring in $3 per turn.) ");
			build = input.nextInt();
			if(space >= build){
				if(money - 35*build > 0) {
				System.out.println("Building " + build + " factories.");
				space = space - build;
				factories = factories + build;
				money = money - 35*build;
				}
				else {
					System.out.println("Sorry! Not enough money. Wait till next year.");
				}
			}
			if((pollution + (1.5*factories - 0.1*space))>0) {
				pollution = pollution + (1.5*factories - 0.1*space);
			}else {
				pollution = 0;
			}
			
			
			
			food = food - population + 10*farms;
			if((100*(10*hospitals/(farms+factories)-pollution))>100){
				health = 100;	
			}
			else {
				health = (100*(10*hospitals/(farms+factories))-pollution);
			}
			;
			
			
		}
	
		System.out.println("Game over! Everyone died!");
		System.out.println("Play again? (yes/no) ");
		again = input.next();
		
		
	}
	}
}
