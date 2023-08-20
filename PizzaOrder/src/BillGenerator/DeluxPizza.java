package BillGenerator;

public class DeluxPizza extends Pizza {

	public DeluxPizza(Boolean veg) {
		super(veg);
		super.addEtraChese();
		super.addExtratopping();
	}

	@Override
	public void addEtraChese() {

	}

	@Override
	public void addExtratopping() {
		
	}

}
