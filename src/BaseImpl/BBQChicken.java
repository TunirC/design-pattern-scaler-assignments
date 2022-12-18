package BaseImpl;

import Service.Pizza;

public class BBQChicken extends Pizza {

	public BBQChicken(Pizza pizza) {
		super(pizza);
	}

	public BBQChicken() {
	}

	@Override
	public Integer getCost() {
		if (pizza == null)
			return 200;

		return pizza.getCost() + 200;
	}

	@Override
	public String getDescription() {
		if (pizza == null)
			return "BBQChicken";

		return pizza.getDescription() + " + BBQChicken ";
	}

}
