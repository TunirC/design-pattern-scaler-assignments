package AddOnImpl;

import Service.Pizza;

public class Tomato extends Pizza {

	public Tomato(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Integer getCost() {
		return pizza.getCost() + 30;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "+ Tomato";
	}

}
