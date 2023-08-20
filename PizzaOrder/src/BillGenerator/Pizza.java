package BillGenerator;

public class Pizza {

	private int Price;
	private Boolean veg;
	
	private int extraChesePrice = 50;
	private int extraToppingsPrice = 50;
	private int takeAwayPrice= 30;
	private int basePizzaPrice;
	private boolean isExtraChesseAdded=false;
	private boolean isExtraToppingAdded=false;
	private boolean isTakeAwayAdded=false;
	
	
	public Pizza(Boolean veg) {
		this.veg = veg;
		if(this.veg)
		{
			this.Price = 300;	
		}
		else
		{
			this.Price = 400;
		}	
		basePizzaPrice = this.Price;
	}
	
	public void addEtraChese() {
		isExtraChesseAdded=true;
		this.Price+=extraChesePrice;
	}
	
	public void addExtratopping(){
		isExtraToppingAdded=true;
		this.Price+=extraToppingsPrice;
	}
	
	public void takeAway() {
		isTakeAwayAdded=true;
		this.Price+=takeAwayPrice;
	}
	
	public void getBill() {
		String bill="";
		System.out.println("Pizza: "+basePizzaPrice);
		if(isExtraChesseAdded)
		{
			bill +="Extra chess Added: "+extraChesePrice+"\n";
		}
		if(isExtraToppingAdded)
		{
			bill += "Extra Toping Added: "+extraToppingsPrice+"\n";
		}
		if(isTakeAwayAdded)
		{
			bill += "Take Away is Added: "+takeAwayPrice+"\n";
		}
		bill +=  "ToTal Bill: "+ this.Price;
		System.out.println(bill);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
