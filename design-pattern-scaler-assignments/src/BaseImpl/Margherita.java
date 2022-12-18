package BaseImpl;

import Service.Pizza;

public class Margherita extends Pizza {

	public Margherita() {
		super();
	}

	public Margherita(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Integer getCost() {
		if(pizza == null)
			return 200;
		
		return pizza.getCost() + 200;
	}

	@Override
	public String getDescription() {
		if(pizza == null)
			return "Margherita";
		
		return pizza.getDescription() + " + Margherita";
	}

}
