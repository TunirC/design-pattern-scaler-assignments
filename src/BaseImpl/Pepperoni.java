package BaseImpl;

import Service.Pizza;

public class Pepperoni extends Pizza {

	public Pepperoni() {
		super();
	}

	public Pepperoni(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Integer getCost() {
		if (pizza == null)
			return 180;

		return pizza.getCost() + 180;
	}

	@Override
	public String getDescription() {
		if (pizza == null)
			return "Pepperoni";

		return pizza.getDescription() + " + Pepperoni";
	}

}
