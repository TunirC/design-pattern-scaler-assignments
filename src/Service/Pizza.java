package Service;

public abstract class Pizza implements BaseService {
	protected Pizza pizza;

	public Pizza() {
		super();
	}

	public Pizza(Pizza pizza) {
		this.pizza = pizza;
	}

}
