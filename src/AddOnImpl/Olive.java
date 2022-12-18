package AddOnImpl;

import Service.Pizza;

public class Olive extends Pizza {

	public Olive(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Integer getCost() {
		return pizza.getCost() + 20;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " + Olive";
	}

}
