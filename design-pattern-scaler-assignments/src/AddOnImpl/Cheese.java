package AddOnImpl;

import Service.Pizza;

public class Cheese extends Pizza {

	public Cheese(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Integer getCost() {
		return pizza.getCost() + 80;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " + Cheese";
	}

}
