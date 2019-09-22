#include <stdio.h>
#include <math.h>

int main(void) {
	float food=0;
	float pop=0;
	int space=0;
	int farms=0;
	float hap=0;
	int year =0;
	float money =0;
	float taxPer = 0;
	float health =0;
	int hospitals = 0;
	int fact = 0;
	float pltn =0;

	char again = 'z';
	
	while(again != 'n'){
	printf("Easy, medium, hard? \n (E/M/H): ");
	char diff = getchar();

	if(diff == 'E'){
	food = 500;
	pop=250;
	space=1500;
	farms = 30;
	hap = 50;
	money = 5500;
	taxPer = 0.2;
	health = 100;
	hospitals = 4;
	fact = 2;
	pltn = 0;
	}
	

	while(pop > 0){
		year++;
		pop = floor((pop+((food-pop)/10)+((pop*hap)/1000))*health/90);
		hap = ((space)/(space+farms))*50*(1-taxPer/1)*((100-pltn)/100);
		money = money + pop*taxPer - 5*hospitals +3*fact;
		printf("\n City stats in year %d \n", year);
		if(food-pop<0) {
			printf("\n Your people are starving! Build more farms! \n");
		}
		printf("Population: %f \n", pop);
		printf("Ballance: $ %f \n", money);
		printf("Happiness: %f \n", hap);
		printf("Health: %f \n", health);
		printf("Remaining food: %f \n", food);
		printf("No. of farms: %i \n", farms);
		printf("No. of hospitals: %d \n", hospitals);
		printf("No. of factories: %d \n", fact);
		printf("Pollution: %f \n", pltn);
		printf("Space left: %d \n", space);

		int bld = 0;
		
		printf("How many farms to build? ($30 each) ");
		scanf("%d", &bld);
		if(space >= bld){
		  if(money - 30*bld >=0){
		    printf("Building %d ", bld);
		    printf(" farms. \n");
		    space = space-bld;
		    farms = farms+bld;
		    money = money - 30*bld;
		    }
		  else {
		    printf("Not enough money!");
		  }
		}
		else{
		  printf("Not enough space!");
		  }
		
		printf("How many hospitals to build? ($40 each, + $5 per turn) ");
		scanf("%d", &bld);
		if(space >= bld){
		  if(money - 40*bld >=0){
		    printf("Building %d ", bld);
		    printf(" hospitals. \n");
		    space = space-bld;
		    hospitals = hospitals+bld;
		    money = money -40*bld;
		    }
		  else {
		    printf("Not enough money!");
		  }
		}
		else{
		  printf("Not enough space!");
		  }

		printf("How many factoriess to build? ($35 each, earn $3 per turn) ");
		scanf("%d", &bld);
		if(space >= bld){
		  if(money - 35*bld >=0){
		    printf("Building %d ", bld);
		    printf(" factories. \n");
		    space = space-bld;
		    fact = fact+bld;
		    money = money - 30*bld;
		    }
		  else {
		    printf("Not enough money!");
		  }
		}
		else{
		  printf("Not enough space!");
		  }

		if((pltn +(1.5*fact - 0.1*space))>0) {
		  pltn = (pltn +(1.5*fact - 0.1*space));
		}
		else {
		  pltn = 0;
		}

		food = food - pop + 10*farms;

		if((100*(10*hospitals/(farms+fact)-pltn))>100){
		  health = 100;
		}
		else{
		  health = 100*(10*hospitals/(farms+fact)-pltn);
		}
		;
	
	}
	printf("Game over! Everyone died!\n");
	printf("Play again? (Y/N)\n");
	again = getchar();


	}
	}

