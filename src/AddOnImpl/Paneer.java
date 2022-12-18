package AddOnImpl;

import Service.Pizza;

public class Paneer extends Pizza {

	public Paneer(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Integer getCost() {
		return pizza.getCost() + 60;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " + Paneer";
	}

}
