package BillGenerator;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 
	Scanner sc=new Scanner(System.in);
	
	//Display pizza choice
	System.out.println("Please Select a Order: ");
	System.out.println("1. Base Pizza");
	System.out.println("2. Delux Pizza");
	System.out.println("3. Exit");
	System.out.println("Enetr Your choice: ");
	int pizzaOrder = sc.nextInt();
	
	//Display Option pizza type 
	System.out.println("Please Select a Pizza Type: ");
	System.out.println("1. Veg Pizza");
	System.out.println("2. NonVeg Pizza");
	System.out.println("Enetr Your choice: ");
	int PizzaType = sc.nextInt();
	
	//Display Extra Choice
	System.out.println("Please Select an Extra");
	System.out.println("1. Extra Cheese");
	System.out.println("2. Extra Topping");
	System.out.println("3. TakeAway");
	System.out.println("Enetr Your choice: ");
	int extraChoice = sc.nextInt();
	
	//process user choice
	
	switch(pizzaOrder)
	{
		case 1:if(pizzaOrder==1);//Base Pizza
		{
			if(PizzaType==1)//veg
			{
				Pizza basePizza = new Pizza (true);
				basePizza.getBill();
			}
			else//NonVeg
			{
				Pizza basePizza = new Pizza (false);
				basePizza.getBill();
			}
		}
		break;
		
		case 2: if(pizzaOrder==2);//Delux Pizza
		{
			if(PizzaType==1)//veg
			{
				DeluxPizza Dp = new DeluxPizza(true);
				Dp.addEtraChese();
				Dp.addExtratopping();
				Dp.getBill();
			}
			else//NonVeg
			{			
				DeluxPizza Dp = new DeluxPizza(false);
				Dp.addEtraChese();
				Dp.addExtratopping();
				Dp.getBill();
			}
		}
		case 3:if(pizzaOrder==3)
		{
			System.out.println("Thank You!..Visit Again");
		}
		break;
		default:System.out.println("Invalid Choice");
	}
}
}
