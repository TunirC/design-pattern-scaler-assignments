package BaseImpl;

import Service.Pizza;

public class Farmhouse extends Pizza {

	public Farmhouse() {
		super();
	}

	public Farmhouse(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Integer getCost() {
		if (pizza == null)
			return 150;

		return pizza.getCost() + 150;
	}

	@Override
	public String getDescription() {
		if (pizza == null)
			return "Farmhouse";

		return pizza.getDescription() + " + Farmhouse";
	}

}
